public class Segregate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0};
        segregate0and1(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void segregate0and1(int [] arr){
        int numberOfZeros = 0;
        for(int pramu : arr){
            if(pramu == 0) numberOfZeros++;
        }
        for(int i=0; i<numberOfZeros; i++){
                arr[i] = 0;
             }
             for(int i=numberOfZeros; i<arr.length; i++){
                arr[i] = 1;
             }
        }
    }

