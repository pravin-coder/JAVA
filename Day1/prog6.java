public class prog6{
    public static void main(String[] args) {
        int[] actual = {1, 0, 0, 1, 1, 1, 0, 1, 0, 1};
        int[] predicted = {1, 1, 0, 1, 0, 1, 0, 1, 1, 1};

        int tp = 0, tn = 0, fp = 0, fn = 0;
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] == 1 && predicted[i] == 1) {
                tp++;
            } else if (actual[i] == 0 && predicted[i] == 0) {
                tn++;
            } else if (actual[i] == 0 && predicted[i] == 1) {
                fp++;
            } else if (actual[i] == 1 && predicted[i] == 0) {
                fn++;
            }
        }

        double precision = (double) tp / (tp + fp);
        double recall = (double) tp / (tp + fn);
        double f1Score = 2 * (precision * recall) / (precision + recall);

        System.out.println("Confusion Matrix:");
        System.out.println("True Positive (TP): " + tp);
        System.out.println("True Negative (TN): " + tn);
        System.out.println("False Positive (FP): " + fp);
        System.out.println("False Negative (FN): " + fn);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1-Score: " + f1Score);
    }
}
