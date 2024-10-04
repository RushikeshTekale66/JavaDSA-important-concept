import java.util.Arrays;
class JavaDSA{
    public static void counting(int [] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int [] count = new int[max+1];

        for(int num : arr) count[num]++;

        for(int i=0, index = 0; i<=max; i++){
            while(count[i]-->0) arr[index++]=i;
        }
    }
    public static void main(String [] args){
        int [] arr = {4, 3, 2, 1, 4, 3, 2,1, 1, 2, 3, 4, 5};

        counting(arr);
        System.out.println(Arrays.toString(arr));
    }
}