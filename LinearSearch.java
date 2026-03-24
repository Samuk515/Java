



public class LinearSearch{

    public static void main(String[] args) {
        int[] arr = {12, 3, 27,53 ,18, 62, 88, 6};
        int target = 53;
        int found = -1;
        for (int i=0; i<arr.length; i++){
            if (arr[i] == target) 
            found = i;
        }
    
    if( found != -1) System.out.println("Target exits in array at index " + found);
    else System.err.println("Target missing in Array ");
}}