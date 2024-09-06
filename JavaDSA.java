class JavaDSA {

    public int binarySearch(int target, int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;

            if (target < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 3;

        JavaDSA js = new JavaDSA();
        int result = js.binarySearch(target, arr);

        System.out.println("Element is found at index : " + result);
    }
}