import java.util.Scanner;

public class looping_statements {
    static void prime(){
        for(int i=2;i<=100;i++){
            boolean notPrime = true;
//            System.out.println(i+" ");
            for(int j=2;j<i;j++){
                if(i%j==0){
                    notPrime = false;
                }
            }
            if(notPrime){
                System.out.print(i +" ");
            }
        }
    }
    static void armStrong(){
        for(int i = 1;i<=1000 ;i++) {
            int ans = 0;
            int temp = i;
            if(i>=1 && i<=9){
                System.out.print(i+" ");
            } else if (i>=0 && i<=99) {
                while (temp!=0){
                    int rem = temp%10;
                    temp = temp/10;
                    ans = ans +(rem *rem);
                }
                if (i == ans){
                    System.out.print(i+" ");
                }

            } else if (i>=100 && i<=999) {
                while (temp!=0){
                    int rem = temp%10;
                    temp = temp/10;
                    ans = ans +(rem *rem *rem);
                }
                if (i == ans){
                    System.out.print(i+" ");
                }
            }

        }
    }

    static void sumAvrg(){
        Scanner scan = new Scanner(System.in);
        int ans =0;
        for(int i=1;i<=5;i++){
            System.out.print("Enter a number "+i+" :");
            int n =scan.nextInt();
            ans = ans +n;

        }
        System.out.println("The sum of 5 no. is : "+ans);
        System.out.println("The average is : "+(ans /5f));
    }

    static void cubeN(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number of terms : ");
        int n = scan.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Number is : "+i+" and cube of "+i+" is : "+i*i*i);
        }
    }

    static void table(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of table : ");
        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+i*n);
        }
    }




    public static void main(String[] args) {

//        for prime number 1 to 100
        prime();

//        for armStrong number 1 to 1000
//        armStrong();

//        sum and average of 5 numbers
//        sumAvrg();

//        cube of number upto given integer
//        cubeN();

//        printing a table
//        table();
    }
}
