class FibonacciSearch {
    public static boolean search(int[] arr, int target) {
        int n = arr.length;
        if (n == 0) return false;
        int fk2 = 0;
        int fk1 = 1;
        int fk = fk1 + fk2;

        while (fk < n) {
            fk2 = fk1;
            fk1 = fk;
            fk = fk1 + fk2;
        }
        int i = -1;
        while (fk > 1) {
            int idx = Math.min(i + fk2, n - 1);
            if (arr[idx] == target) {
                return true;
            } else if (arr[idx] < target) {
                fk = fk2;
                fk1 = fk1 - fk2;
                fk2 = fk - fk1;
            } else {
                i = idx;
                fk = fk1;
                fk1 = fk2;
                fk2 = fk - fk1;
            }
        }
        if (fk1 == 1 && i + 1 < n && arr[i + 1] == target) {
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
    int[] arr = {90, 75, 60, 45, 30, 20, 10, 5, 0};

    System.out.println("Test 1 (90): " + (search(arr, 90) == true ? "PASS" : "FAIL"));

    System.out.println("Test 2 (0): "  + (search(arr, 0) == true ? "PASS" : "FAIL"));

    System.out.println("Test 3 (45): " + (search(arr, 45) == true ? "PASS" : "FAIL"));
    System.out.println("Test 4 (100): " + (search(arr, 100) == false ? "PASS" : "FAIL"));
    System.out.println("Test 5 (-10): " + (search(arr, -10) == false ? "PASS" : "FAIL"));
    System.out.println("Test 6 (50): "  + (search(arr, 50) == false ? "PASS" : "FAIL"));
    }
}
