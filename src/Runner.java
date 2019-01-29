public class Runner {
    public static void main(String[] args) {
        StudentRecord studentRecord1 = new StudentRecord(50, 50, 20, 80, 53);
        StudentRecord studentRecord2 = new StudentRecord(20, 50, 50, 53, 80);
        StudentRecord studentRecord3 = new StudentRecord(20, 50, 50, 80);

        System.out.println(studentRecord1.hasImproved()); // → false
        System.out.println(studentRecord2.hasImproved()); // → true
        System.out.println(studentRecord3.hasImproved()); // → true

        System.out.println(studentRecord1.finalAverage()); // → 50.6
        System.out.println(studentRecord2.finalAverage()); // → 61.0
        System.out.println(studentRecord3.finalAverage()); // → 65.0
    }
}
