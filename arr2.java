import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n,z,count=0;
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter The Number ");
        n=sc.nextInt();
        z=n;
        while(n>0)
        {
            count=count+1;
            z=z/10;
        }
        System.out.println("The Digits Are "+count);
        sc.close();
    }
    
}
