public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int wholeDaySec = 86400;
        int currentTimeSec = ((currentHours * (int)(Math.pow(60, 2))) + (currentMinutes * 60) + currentSeconds);
        int remainingSec = wholeDaySec - currentTimeSec;

        System.out.println((remainingSec));
    }
}
