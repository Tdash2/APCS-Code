public class Main {
    public static void main(String[] args) {
        Statistics test = new Statistics("C:\\numbers.txt");
        System.out.println(test.getAverage());
        System.out.println(test.standardDeviation());
        System.out.println(test.getMode());
    }
}