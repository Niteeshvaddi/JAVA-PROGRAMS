public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {36, 41, 8, 19, 6, 2, 14};
        int min, temp;
       
        for (int i = 0; i < a.length - 1; i++) {
            min = i; 
            
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j; 
                }
            }
            
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        
       
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
