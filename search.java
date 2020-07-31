import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,k;
        String flag="";
        n=scan.nextInt();
        k=scan.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++)
            array[i] = scan.nextInt();
        for(int i=0;i<n;i++){
            if(k==array[i]){
                System.out.print("yes");
                break;
            }
            else
                flag = "no";
        }
        if(flag.matches("no"))
            System.out.print("no");
    }
}