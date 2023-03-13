import java.util.Scanner;

public class branching {
    static void choose(){
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("*********");
            System.out.println("1) square ");
            System.out.println("2) cube ");
            System.out.println("3) leap year or not ");
            System.out.println("0) exit ");
            System.out.println("*********");

            System.out.print("choose value :");
            int m = sc.nextInt();
            System.out.println();
           if(m==1){
               Scanner scan = new Scanner(System.in);
               System.out.print("Enter number for square : ");
               int n = scan.nextInt();

               System.out.println("The square of "+n+" is "+n*n);
               System.out.println();
           }
          else if(m==2){

                   Scanner scan = new Scanner(System.in);
                   System.out.print("Enter number for cube : ");
                   int n = scan.nextInt();

                   System.out.println("The cube of "+n+" is "+n*n*n);
                   System.out.println();
           }
          else if(m==3){
               Scanner scan = new Scanner(System.in);
               System.out.println("Enter year :");
               int yr = scan.nextInt();
               if(yr%4==0){
                   System.out.println("the year is LEAP ");
               }
               else {
                   System.out.println("the year is not LEAP ");
               }
               System.out.println();
           }
           else if(m==0){
               System.out.println("you exit");
               break;
           }
           else {
               System.out.println("please enter a proper number : ");
               System.out.println();
           }
        }
    }


    static void calci(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a 1st number :");
        int n = scan.nextInt();
        System.out.print("Enter a operator : ");
        char ch = scan.next().charAt(0);
        System.out.print("Enter a 2nd number : ");
        int m = scan.nextInt();

        switch (ch){
            case '+':{
                System.out.println(n+"+"+m+"="+(n+m));
                break;
            }
            case '-':{
                System.out.println(n+"-"+m+"="+(n-m));
                break;
            }
            case '*':{
                System.out.println(n+"*"+m+"="+n*m);
            }
            case '/':{
                System.out.println(n+"/"+m+"="+n/m);
            }
        }

    }




    public static void main(String[] args) {

//       1) choose from square , cube and check the year is leap or not
        choose();

//      2)  Arithmatic operations + - * /
//        calci();

//
    }
}
