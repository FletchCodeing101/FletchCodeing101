public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Step 1: Create an array of 5 scores
        int[] scores = {85, 90, 78, 92, 88};
        // Step 2: Calculate the sum 
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i]; // Adds each score to the sum
        }
        // Step 3: Calculate the average
        double average = (double) sum / scores.length;
        // Step 4: Output results
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);
	}
}
