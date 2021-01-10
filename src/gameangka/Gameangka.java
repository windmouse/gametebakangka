package gameangka;
import java.util.Scanner;
public class Gameangka {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100); // variabel yang berisi angka acak dari 0-100
        int c = 0; //variabel untuk parameter looping

        System.out.println("Hai.. nama saya Mr. Jerry, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d\n" + "100. Silakan tebak ya!!!");

        while(c >= 0) {//program akan melooping terus hingga terjadi break di dalam program
             c++;
            
             if (c % 11 == 0) { //tiap user salah menjawab sebanyak 10 kali, akan diberi opsi untuk berhenti
                System.out.println("Anda telah menjawab salah sebanyak 10 kali, tekan 1 untuk melanjutkan, tekan 2 jika ingin berhenti ");
                
                Scanner jawab = new Scanner(System.in);
                int b = jawab.nextInt();
                
                if (b == 2){
                    System.out.println("Program dihentikan. Terimakasih telah memainkan game ini.");
                    break;               
                }
                else if (b == 1){
                    continue;
                }
            }
             
            System.out.println("Tebakan Anda : " );
            Scanner jawab = new Scanner(System.in);
            int b = jawab.nextInt();
                if (b == a) {
                    System.out.println("Selamat!!! Angka yang anda tebak BENAR!");
                    break;
                } else if (b < a) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                } else if (b > a) {
                    System.out.println("--------------------------------------------");
                    System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                }
                System.out.println("--------------------------------------------");
        }

    }
}

        
        
