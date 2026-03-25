public class MissingNum {
     @SuppressWarnings("unused")
     int missingNum(int arr[]){
        long n = arr.length + 1;
        long sum = n*(n+1)/2;
        long arrySum = 0;
        for(int pramu : arr){
            arrySum += pramu;
        }
        return (int)(sum - arrySum);
     }
}
