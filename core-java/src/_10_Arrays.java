public class _10_Arrays {
    public static void main(String[] args) {
        // data structures -> create add update 'delete' read search
//        int[] arr = new int[5];

//        System.out.println(arr[4]);
//        System.out.println(arr.length);
//        arr[0] = 100;
//        System.out.println(arr[0]);

//        int x = 10;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == x) {
//                System.out.println("found x");
//            }
//        }

//        int[] a = {1, 2, 3, 4, 5};
//
//        System.out.println(a[1]);
        int[] a = {10, 2, 3, 20, 15};
        //         sm         m
        //  sm=0          sm
//        findMaximum(a);
//        findMinimum(a);
//        findSecondMaximum(a);

//        int[][] a2 = new int[3][3];
//
//        for (int i = 0; i < a2.length; i++) {
//            for (int j = 0; j < a2[0].length; j++) {
//                System.out.print(a2[i][j]);
//            }
//            System.out.println();
//        }

        int[][] a2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        for (int i = 0; i < a2.length; i++) {
//            for (int j = 0; j < a2[0].length; j++) {
//                System.out.print(a2[i][j]);
//            }
//            System.out.println();
//        }
        print(a2);
        transpose(a2);
    }

    // 0 [10,2,3,20,15] -> max = 20
    public static void findMaximum(int[] arr) {
        int max = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > max) {
                max = current;
            }
        }

        System.out.println(max);
    }


    public static void findMinimum(int[] arr) {
        int min = 2147483647;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current < min) {
                min = current;
            }
        }

        System.out.println(min);
    }

    public static void findSecondMaximum(int[] arr) {
        int max = -2147483648;
        int secondMax = -2147483648;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            if (current > max) {
                secondMax = max;
                max = current;
            } else if (current > secondMax) {
                secondMax = current;
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }

    public static void transpose(int[][] arr) {
        int[][] result = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result[j][i] = arr[i][j];
            }
        }
        System.out.println("Transpose");
        print(result);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
