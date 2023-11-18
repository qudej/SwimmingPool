public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 10;
        int devastationSpeed = 10;
        int startVolume = 0;
        int time = 0;
        double approximateTime;
        approximateTime = volume / fillingSpeed;

        if (devastationSpeed >= fillingSpeed) {
            System.out.println("Обнаружена большая утечка в бассейне, необходимо устранить проблему или увеличить напор воды");
        } else {
            System.out.println("Примерное время наполнения  бассейна = " + approximateTime);
            while (startVolume != volume) {
                startVolume = startVolume + fillingSpeed - devastationSpeed;
                time = time + 1;
                approximateTime = (double) (volume - startVolume) / fillingSpeed;
                System.out.println("Примерное время наполнения  бассейна = " + approximateTime);
            }
            System.out.println("Фактическое время наполнения бассейна = " + time);
        }
    }
}
