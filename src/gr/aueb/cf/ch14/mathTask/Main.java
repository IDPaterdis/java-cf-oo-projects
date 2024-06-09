package gr.aueb.cf.ch14.mathTask;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.logMessage(" Current process");
        int[] arr = {6, 4, 23, 53, 26, 75, 88};

        int max = MathHelper.findMax(arr);
        int min = MathHelper.findMin(arr);
        double avg = MathHelper.average(arr);

        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " +min);
        System.out.println("Average Value: " +avg);
    }
}
