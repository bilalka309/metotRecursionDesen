import java.util.Scanner;
public class Main {
    static void desen(int n,int y,int z){
        System.out.print(" "+n);
        if(n<=0) return;



        desen(n-5,y++,z);
        if(z>=n){
            System.out.print(" "+n);
            n+=5;
        }

    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("N sayısını giriniz : ");
        int x= in.nextInt();
        desen(x,1,x);
    }
}