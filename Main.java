public class Main {
    public static void main(String[] args) {
        int volume = 1200;
        int fillingSpeed = 30;
        int devastationSpeed = 10;
        int startVolume = 0;
        int time = 0;

        while (startVolume != volume) {
            startVolume = startVolume + fillingSpeed - devastationSpeed;
            time = time + 1;
            }
        System.out.println("Время наполнения бассейна = " + time);
    }
}
