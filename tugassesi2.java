import java.util.Scanner;
public class tugassesi2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nominal: ");
        int nominal = input.nextInt();

        int[] uang = {50000, 20000, 10000, 5000, 2000, 1000,500,200,100};    
        int[] jumlah = new int[9];
        

        for (int i = 0; i < uang.length; i++) {
            if (nominal >= uang[i]) {
                jumlah[i] = nominal / uang[i];
                nominal = nominal % uang[i];
            }
        }
        

    
        for (int i = 0; i < uang.length; i++) {
            if (jumlah[i] > 0) {
                if (uang[i] >= 1000) {
                    System.out.println(jumlah[i] + " lembar " + uang[i] + " ribuan");
                } else {
                    System.out.println(jumlah[i] + " keping " + uang[i]);
                }
            }
        }

    input.close();
    }  
}
    

