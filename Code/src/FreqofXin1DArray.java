public class FreqofXin1DArray {
    public static void main(String[] args) {
        // Example Usage
        int[] A1 = {1, 1, 2, 4, 2};
        int B1 = 2;
        System.out.println(findFrequency(A1, B1)); // Output: 2

        int[] A2 = {4, 2, 3, 4, 4};
        int B2 = 4;
        System.out.println(findFrequency(A2, B2)); // Output: 3
    }

    public static int findFrequency(int[] A, int B) {
        int frequency = 0;

        for (int num : A) {
            if (num == B) {
                frequency++;
            }
        }

        return frequency;
    }
}
