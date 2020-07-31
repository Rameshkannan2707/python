import java.util.Scanner;
public class BeautifulArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0,i;
        int array[] = new int [n];
        for(i=0; i<n; i++)
            array[i] = scan.nextInt();
        for(i=0; i<n; i++)
            sum+=array[i];
        if(sum%2==0 && sum%3==0 && sum%5==0)
            System.out.print("1");
        else
            System.out.print("0");
    }
}