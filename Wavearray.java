public class Wavearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        convertToWave(arr);
            // Print the result
        System.out.print("Wave array: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void convertToWave(int[] arr) {
        // Implementation for converting array to wave form
        for(int i=0; i<arr.length-1; i+=2){
            // Swap arr[i] and arr[i+1]
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
    }
}
