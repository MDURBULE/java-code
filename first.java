import  java.util.Scanner ;
public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m;
        char ch ;
        System.out.println("Enter a 1st value : ");
        n = scan.nextInt();
        System.out.println("Enter a 2st value : ");
        m = scan.nextInt();
        System.out.println("Enter operator (+,-,/,*): ");
        ch = scan.next().charAt(0);

        switch (ch){
            case '+':{
                System.out.println(n+m);
                break;
            }
            case '-':{
                System.out.println(n-m);
                break;
            }
            case '/':{
                System.out.println(n/m);
                break;
            }
            case '*':{
                System.out.println(n*m);
                break;
            }


        }

    }
}
