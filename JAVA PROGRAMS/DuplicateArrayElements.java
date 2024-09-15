public class DuplicateArrayElements {
    public static void main(String[] args) {
        int[] a = {20, 30, 45, 67, 89, 20, 35, 30};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate element: " + a[i]);
                }
            }
        }
    }
}
