public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] dooblAr = new double[]{1.57, 7.654, 9.986};
        for (int i = 0; i < dooblAr.length; i++) {
            System.out.print(dooblAr[i]);
            if (i < dooblAr.length - 1) ;
            System.out.print(", ");
        }
        {
            System.out.print(dooblAr[dooblAr.length - 1]);
        }
        System.out.println();

        int[] s = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + ", ");
            if (i == s.length - 1) ;
        }
        {
            System.out.print(s[s.length - 1]);
        }
        System.out.println();

        System.out.println("Задача 3");
        int[] arr2 = new int[3];
        for (int i = arr2.length; i > 0; i--) {
            arr2[arr2.length - i] = i;
            System.out.print(arr2[arr2.length - i]);
            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] dooblAr2 = new double[]{1.57, 7.654, 9.986};
        for (int i = dooblAr2.length - 1; i > 0; i--) {
            System.out.print(dooblAr2[i]);
            System.out.print(", ");
        }
        System.out.print(dooblAr[0]);
        System.out.println();
        int[] s2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        for (int i = s2.length; i > 0; i--) {
            s2[s2.length - i] = i;
            System.out.print(s2[s2.length - i]);
            if (i > 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        int[] arr3 = {1, 2, 3};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 2 != 0)
                arr3[i]++;
            System.out.print(arr3[i]);
            {
                if (i < arr3.length - 1) {
                    System.out.print(", ");
                }
            }
        }
    }
}