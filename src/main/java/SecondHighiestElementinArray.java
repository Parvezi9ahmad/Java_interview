public class SecondHighiestElementinArray {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 8, 20, 15 ,19};
        int highest = 0;
        int secondHighest = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                secondHighest=highest;
                highest=arr[i];
            } else if (arr[i]>secondHighest && arr[i]!=highest) {

                secondHighest = arr[i];
            }
         }
        System.out.println(secondHighest);
    }
}
