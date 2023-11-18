import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int volume;
        int fillingSpeed;
        int devastationSpeed;
        int startVolume;
        int time = 0;
        double approximateTime;


        System.out.println("Введите объем необходимого бассейна:");
        volume = new Scanner(System.in).nextInt();
        System.out.println("Введите примерную скорость подачи воды (л/ч):");
        fillingSpeed = new Scanner(System.in).nextInt();
        System.out.println("Введите ориентировочную потерю воды при заливке (л/ч):");
        devastationSpeed = new Scanner(System.in).nextInt();
        System.out.println("Введите изначальное количество воды в бассейне:");
        startVolume = new Scanner(System.in).nextInt();

        approximateTime = volume / fillingSpeed;

        if (devastationSpeed >= fillingSpeed) {
            System.out.println("Обнаружена большая утечка в бассейне, необходимо устранить проблему или увеличить напор воды");
        } else {
            System.out.println("Примерное время наполнения  бассейна = " + approximateTime);
            while (startVolume != volume) {
                startVolume = startVolume + fillingSpeed - devastationSpeed;
                time = time + 1;
                approximateTime = (double) (volume - startVolume) / fillingSpeed;
                System.out.println("Примерное время наполнения  бассейна = " + approximateTime + " минут");
                if (startVolume >= volume) {
                    break;
                }
            }
            System.out.println("Фактическое время наполнения бассейна = " + time + " минут");
        }
    }
}
