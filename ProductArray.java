 public class ProductArray {
    public static void main(String[] args) {
     int [] arr = {3, 6 ,73 ,34, 53, 23, 12} ;
     long product =  1;
     for( int i =0; i<arr.length; i++){
        product *= arr[i];
     } 
     System.out.println(product); 

    }
}
