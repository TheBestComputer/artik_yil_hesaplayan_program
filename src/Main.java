
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int yil;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Yil giriniz : ");
        yil = scanner.nextInt();
        
        if((yil % 100) == 0){
            if((yil % 4) == 0){
                System.out.println(yil + " bir artik yildir ! ");
            }
            else{
                System.out.println(yil + " bir artik yil degildir ! ");
            }
        }
        else if((yil % 4) == 0){
            System.out.println(yil + " bir artik yildir ! ");
        }
        else{
            System.out.println("Bir artik yil degildir");
        }
    }
}
