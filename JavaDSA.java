import java.util.Arrays;

class JavaDSA {

    public void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivoteIndex = partition(arr, low, high);

            quickSort(arr, low, pivoteIndex-1);
            quickSort(arr, pivoteIndex+1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        // Right most element as pivote
        int pivote = arr[high];

        int i=low-1;

        for(int j=low; j<high; j++){
            if(arr[j]<pivote){
                i++;

                // Swapping element at i with element at j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the greater element at i+1
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 5 };

        JavaDSA jd = new JavaDSA();
        jd.quickSort(arr, 0, arr.length-1);

        System.out.print("Sorted Array" + Arrays.toString(arr));
    }
}