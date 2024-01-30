import java.util.Scanner;

/**
 * B3slide93
 */
public class B3slide93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi: ");
        int tuoi = sc.nextInt();
    
        if(tuoi <16){
            System.out.println("ban" + ten + " o do tuoi vi thanh nien!! ");
        }else if(tuoi >= 16 && tuoi <= 18){
            System.out.println("ban " + ten + " o do tuoi truong thanh!! ");
        }else{
            System.out.println("ban " + ten + " da gia");
        }
    }
}