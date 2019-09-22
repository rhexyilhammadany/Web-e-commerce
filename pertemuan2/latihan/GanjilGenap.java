import java.util.Scanner;
public class GanjilGenap{
	
	public static void main (String[] args){
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Masukkan angka = ");
		int nilai = sc.nextInt();
		
		if(nilai % 2 == 0){
			System.out.println("Bilangan Genap");
		
		}else {
			System.out.println("Bilangan Ganjil");
		}
		
		
		}
}	