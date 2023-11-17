public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int startVolume = 0;
        int time = 0;
        double approximateTime;
        approximateTime = volume / fillingSpeed;

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
