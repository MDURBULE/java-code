import java.util.Scanner;

public class pattern {
    static void loweTri() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void numSquare() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(i + 1 + " ");
            }
            System.out.println();
        }
    }

    static void uperTri() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pyramid() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern1() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void pattern2() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=n-i;j!=0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }


    static void pattern3(){
        int n=5;
        for(int i=0;i<n;i++){
            if(i+1==3){
                continue;
            }
            else {
                System.out.println(i+1+"  "+(n-i));
            }
        }
    }


    public static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
//        loweTri();

//        1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3 3
//        4 4 4 4 4
//        5 5 5 5 5
//        numSquare();

//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
//        uperTri();

//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//        pyramid();

//            *
//          * *
//        * * *
//      * * * *
//    * * * * *
//        pattern1();

//        * * * * *
//          * * * *
//            * * *
//              * *
//                *
//        pattern2();


//        1  5
//        2  4
//        4  2
//        5  1
//        pattern3();

    }
}
