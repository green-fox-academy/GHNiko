public class CodingHours {
    public static void main(String[] args) {

        int codingHrs = 6;
        int nrOfWorkdays = 5;
        int weeksOfSemester = 17;
        int workHrsPerWeek = 52;

        int codingHrsPerSem = codingHrs * nrOfWorkdays * weeksOfSemester;
        System.out.println(codingHrsPerSem);

        float percOfCodingHrs = ((float)(codingHrs * nrOfWorkdays) / (float)workHrsPerWeek) * 100;
        System.out.println(percOfCodingHrs + "%");
    }
}
