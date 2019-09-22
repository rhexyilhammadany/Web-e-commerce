import java.util.Scanner;
public class JadwalKuliah{
public static void main (String [] args){
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Masukkan Angka =");
	int nilai = input.nextInt();
	
	if (nilai >= 0 && nilai <= 29){
		System.out.println("Nilai anda adalah E");
	}else if(nilai >= 30 && nilai <= 59){
		System.out.println("Nilai anda adalah C");
	}else if(nilai >= 60 && nilai <= 79){
		System.out.println("Nilai anda adalah B");
	}else if(nilai >= 80 && nilai <= 100){
		System.out.println("Nilai anda adalah A");
		}
	}
}