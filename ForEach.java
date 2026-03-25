public class ForEach {
    public static void main(String[] args) {
        int [] arr = {5, 8, 2, 6, 9};
        for(int i=0; i<arr.length; i++){
          arr[i] *= 2; 
        }
        for(int pramu : arr){
            System.out.print(pramu+" ");
        }
    }
}
