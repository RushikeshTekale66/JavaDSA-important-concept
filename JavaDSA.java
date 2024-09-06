class JavaDSA {

    public int linerSearch(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 9, 8, 7, 6, 5 };
        int target = 22;

        JavaDSA js = new JavaDSA();
        int result = js.linerSearch(target, arr);

        System.out.println("Element is found at index : " + result);
    }
}