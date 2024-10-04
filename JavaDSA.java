import java.util.Arrays;

/**
 * JavaDSA
 */
public class JavaDSA {

    public static void radixSort(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        for(int exp = 1; max/exp>0; exp*=10){
            int [] output = new int[arr.length];
            int[] count = new int[10];
            
            for(int num:arr) count[(num/exp)%10]++;
            for(int i=1; i<10; i++) count[i]+=count[i-1];
            for(int i=arr.length-1; i>=0; i--) output[--count[(arr[i]/exp)%10]]=arr[i];
            System.arraycopy(output, 0, arr, 0, arr.length);
        }
    }

    public static void main(String [] args){
        int [] arr = {180, 90, 23, 89, 1909};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}