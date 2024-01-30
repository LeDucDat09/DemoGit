import java.util.Scanner;

public class slide47 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n;
        int soDu;
        int tong =0;
        System.out.println("Nhap so nguyen duong");
        n = sc.nextInt();
        while(n>0){
            soDu = n%10;
            n = n/10;
            tong += soDu;
        }
        System.out.println("Tong cac chu so la: " + tong);
    }
}