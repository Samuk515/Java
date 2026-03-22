@SuppressWarnings("unused")
public class OddEvenArray {
    public static void main(String[] args) {
     int[] arr = { 10,302, 32, 2343, 23, 11, 4} ;
     
     for (int i = 0; i<arr.length; i++){
        if( i % 2 == 1)
        {
            arr[1] *= 2;
        }
        else{
            arr[i] += 10; 
        }
     }
     for (int num : arr){
        System.out.println(num+ " ");
     }
    }
    
}
