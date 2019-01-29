/**
 * By Karwai Kang
 * (No willing partner)
 */
public class StudentRecord {
    /**
     * contains scores.length values
     * scores.length > 1
     */
    private int[] scores;

    StudentRecord(int... scores) {
        this.scores = scores;
    }

    /**
     * precondition: 0 <= first <= last < scores.length
     *
     * @param first the first index, inclusive
     * @param last  the last index, inclusive
     * @return the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     */
    private double average(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i++)
            sum += scores[i];
        return (double) sum / (last - first + 1);
    }

    /**
     * @return true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     */
    boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] > scores[i])
                return false;
        }
        return true;
    }

    /**
     * @return the average of the elements in scores
     * with indexes greater than or equal to scores.length/2
     * if the values in scores have improved;
     * otherwise, returns the average of all of the values in scores
     */
    double finalAverage() {
        if (hasImproved())
            return average(scores.length / 2, scores.length - 1);
        return average(0, scores.length - 1);
    }
}