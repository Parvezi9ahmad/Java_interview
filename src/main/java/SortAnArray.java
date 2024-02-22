import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        int[] arr={50,15,3,8,1,25,87};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            int temp=0;
            for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
