import java.util.Scanner;

public class selection {
    static  void evenOdd1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int n= scan.nextInt();

        if(n%2==0){
            System.out.print("the number is Even ");
        }
        else {
            System.out.println("the number is Odd ");
        }
    }
    static void vote2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int n = scan.nextInt();
        if(n>=18){
            System.out.println("you are eligible for voting ");
        }
        else {
            System.out.println("Sorry you are not eligible for voting ");
        }
    }

    static  void  discount3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a cost price : ");
        int n = scan.nextInt();

        System.out.print("if you are a student Enter (1) otherwise any number :  ");
        int m = scan.nextInt();

        if(m==1){
            if(n>=500){
                System.out.println("you will get 10% Discount ");
            }
            else {
                System.out.println("you will get 5% Discount ");
            }
        }
        else {
            if(n>=500){
                System.out.println("you will get 8% Discount ");
            }
            else {
                System.out.println("you will get 2% Discount ");
            }
        }
    }

    static  void poNEze4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your value : ");
        int n= scan.nextInt();
        if(n==0){
            System.out.println("the number is zero ");
        } else if (n>0) {
            System.out.println("the number is positive ");
        } else {
            System.out.println("the number is negative  ");
        }
    }

    static  void  largeThree5(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your 1st number :");
        int n = scan.nextInt();
        System.out.print("Enter your 1st number :");
        int m = scan.nextInt();
        System.out.print("Enter your 1st number :");
        int a = scan.nextInt();
        if(n==m && m==a){
            System.out.println("all numbers are equal ");
        } else if (n>m && n>a) {
            System.out.println(n+" is greater ");
        } else if (m>n && m>a) {
            System.out.println(m+" is greater ");
        } else if (a>n && a>m) {
            System.out.println(a+" is greater ");
        }
    }

    static  void  days(){

        String [] arr= {"monday","tuesday","Wednesday","thursday","friday","saturday","sunday"};
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a day number : ");
        int n = scan.nextInt();

        if(n>7 || n<=0){
            System.out.println("please inter a proper number");
        }
        else{
            System.out.println(arr[n-1]);
        }
    }
    static void monthDays(){
        Scanner scan = new Scanner(System.in);

        String [] mon = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
        int []days = {31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.print("Enter a month number :");
        int monN = scan.nextInt();
        System.out.print("Enter a year :");
        int yr = scan.nextInt();

        if(yr%4==0 && monN == 2){
            System.out.println(mon[monN-1]+ " " + yr+ " has "+29+" days");
        }
        else {
            System.out.println(mon[monN-1]+ " " + yr+ " has "+days[monN-1]+" days");
        }
    }

    public static void main(String[] args) {

//        1) check the number is even of odd
        evenOdd1();

//        2) a person is eligible for voting or not
//        vote2();

//        3) Discount
//        discount3();

//        4) positive, negative or zero
//        poNEze4();

//        5) greater number from three number and all are equal
//        largeThree5();

//       6)  print days according number
//        days();

//        7) number of days in month
//        monthDays();


    }
}
