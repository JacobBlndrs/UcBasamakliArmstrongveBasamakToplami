import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayiyi Giriniz : ");
        int number =inp.nextInt();
        int tempNumber=number;
        int numberBas;
        int result=0;

        while (tempNumber> 0 ){
            numberBas=tempNumber %10;
            result+=numberBas;
            tempNumber=tempNumber/10;
        }
        System.out.print(number+"\s"+"Sayisinin Basamaklari toplami : "+"\s"+result);
    }
}
