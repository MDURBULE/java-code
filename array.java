import java.util.Arrays;
import java.util.Scanner;

public class array {
    static void reverse(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a n number of array : ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a array element : ");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i]= arr[n-i-1];
            arr[n-i-1]=temp;
        }
        for(int i :arr){
            System.out.print(i+" ");
        }
    }

    static void large(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a n number of array : ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        int large = -1111111111;
        for(int i=0;i<n;i++){
            System.out.print("Enter a array element : ");
            arr[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println(large);

    }

    static void search(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a n number of array : ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a array element : ");
            arr[i]=scan.nextInt();
        }
        System.out.println();
        System.out.print("Enter your key : ");
        int key = scan.nextInt();
        boolean ser = false;
        int i=0;
        while(i<n){
            if(arr[i]==key){
                ser = true;
                break;
            }
            i++;
        }
        if(ser){
            System.out.println(i);
        }
        else {
            System.out.println("-1");
        }
    }

    static void rearrange(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a n number of array : ");
        int n = scan.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a array element : ");
            arr[i]=scan.nextInt();
        }
        System.out.println();
        for(int i=0;i<n;i++){
            arr[i]=(-1)*arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {
//        reverse the array element using swaping the element
        reverse();

//        largest number in array
//        large();

//        search the key element
//        search();

//        rearrange the element
//        rearrange();
    }
}
