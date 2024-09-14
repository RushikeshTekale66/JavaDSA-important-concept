class JavaDSA {

    public void insertionSort(int[] arr) {
        for(int i=0; i<arr.length; i++){
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j=j-1;
            }
            arr[j+1] = key;
        }
    }

    public void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 5 };

        JavaDSA jd = new JavaDSA();
        jd.insertionSort(arr);
        jd.display(arr);
    }
}