package bolero;
import java.util.Random;
import java.util.Scanner;
public class bolero {
	public static void main(String[] args) {
		String[] renkler = {"Sarý","Mavi","Kýrmýzý","Yeþil","Mor","Turuncu"};
		String[] pc = new String[3];
		String[] pc1 = new String[4];
		for(int i=0;i<3;i++){
			Random rastgele = new Random();
			int karisik = rastgele.nextInt(6);
			pc[i]=renkler[karisik];
			if (pc[0]==pc[1] && pc[1]==pc[2]){
				pc[0] = renkler[karisik];
			}
		}
		for (int i=0;i<4;i++){
			Random rastgele1 = new Random();
			int karisik1 = rastgele1.nextInt(6);
			pc1[i]=renkler[karisik1];
			if (pc1[0]==pc1[1] && pc1[1]==pc1[2] && pc1[2]==pc1[3]){
				pc1[0] = renkler[karisik1];
				pc1[1] = renkler[karisik1];
			}
		}
		for (int i=0;i<3;i++)
			System.out.println(pc[i]);
		for (int i=0;i<4;i++)
			System.out.println(pc1[i]);
		System.out.println("----------------------------");
		int sayac = 0;
		Menu();
		System.out.println("-------------------");
		int dogru = 0;
		int yanlis = 0;
		while (sayac<8){
			sayac+=1;
			Scanner veri = new Scanner(System.in);
			System.out.println("Ýlk sýradaki renk tahmininizi giriniz : ");
			String tahmin1 = veri.next();
			System.out.println("Ýkinci siradaki renk tahmininizi giriniz : ");
			String tahmin2 = veri.next();
			System.out.println("Ucuncu siradaki tahmininizi giriniz : ");
			String tahmin3 = veri.next();
			if (pc[0].equals(tahmin1)){
				System.out.println("Renk ve yer dogru . ");
				dogru+=1;
				System.out.println("-------------------");
			}else if (pc[1].equals(tahmin1)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else if (pc[2].equals(tahmin1)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else{
				System.out.println("Renk ve yer yanlis");
				yanlis+=1;
				System.out.println("-------------------");
			}
			if (pc[1].equals(tahmin2)){
				System.out.println("Renk ve yer dogru .");
				dogru+=1;
				System.out.println("-------------------");
			}else if (pc[0].equals(tahmin2)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else if (pc[2].equals(tahmin2)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else{
				System.out.println("Renk ve yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}
			if (pc[2].equals(tahmin3)){
				System.out.println("Renk ve yer dogru .");
				dogru+=1;
				System.out.println("-------------------");
			}else if (pc[1].equals(tahmin3)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else if (pc[0].equals(tahmin3)){
				System.out.println("Renk dogru yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}else{
				System.out.println("Renk ve yer yanlis .");
				yanlis+=1;
				System.out.println("-------------------");
			}
			if (pc[0].equals(tahmin1) && pc[1].equals(tahmin2) && pc[2].equals(tahmin3)){
				System.out.println("Bir ust levele gectiniz .");
				System.out.println("Bu leveldeki doðru sayiniz = " + dogru + " yanlis sayiniz = " + yanlis + " dir. ");
				System.out.println("-------------------");
				break;
			}
		}
		int dogru1=0;
		int yanlis1=0;
			while (sayac<8){
				Scanner veri = new Scanner(System.in);
				Menu();
				System.out.println("-------------------");
				sayac+=1;
				System.out.println("Ýlk sýradaki renk tahmininizi giriniz : ");
				String tahminbir = veri.next();
				System.out.println("Ýkinci siradaki renk tahmininizi giriniz : ");
				String tahminiki = veri.next();
				System.out.println("Ucuncu siradaki tahmininizi giriniz : ");
				String tahminuc = veri.next();
				System.out.println("Dorduncu tahmininizi giriniz : ");
				String tahmindort = veri.next();
				System.out.println("--------------------------");
				if (pc1[0].equals(tahminbir)){
					System.out.println("Renk ve yer dogru . ");
					dogru1+=1;
					System.out.println("-------------------");
				}else if (pc1[1].equals(tahminbir)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[2].equals(tahminbir)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[3].equals(tahminbir)){
					System.out.println("Renk doðru yer yanlis .");
					yanlis1+=1;
					System.out.println("--------------------------");
				}else{
					System.out.println("Renk ve yer yanlis");
					yanlis1+=1;
					System.out.println("-------------------");
				}	
				if (pc1[1].equals(tahminiki)){
					System.out.println("Renk ve yer dogru .");
					dogru1+=1;
					System.out.println("-------------------");
				}else if (pc1[0].equals(tahminiki)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[2].equals(tahminiki)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[3].equals(tahminiki)){
					System.out.println("Renk doðru yer yanlis .");
					yanlis1+=1;
					System.out.println("--------------------------");
				}else{
					System.out.println("Renk ve yer yanlis");
					yanlis1+=1;
					System.out.println("-------------------");
				}	
				if (pc1[2].equals(tahminuc)){
					System.out.println("Renk ve yer dogru .");
					dogru1+=1;
					System.out.println("-------------------");
				}else if (pc1[1].equals(tahminuc)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[0].equals(tahminuc)){
					System.out.println("Renk dogru yer yanlis");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[3].equals(tahminuc)){
					System.out.println("Renk doðru yer yanlis .");
					yanlis1+=1;
					System.out.println("--------------------------");
				}else{
					System.out.println("Renk ve yer yanlis");
					yanlis1+=1;
					System.out.println("-------------------");
				}
				if (pc1[3].equals(tahmindort)){
					System.out.println("Renk ve yer dogru .");
					dogru1+=1;
					System.out.println("-------------------");
				}else if (pc1[1].equals(tahmindort)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[2].equals(tahmindort)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("-------------------");
				}else if (pc1[0].equals(tahmindort)){
					System.out.println("Renk dogru yer yanlis .");
					yanlis1+=1;
					System.out.println("--------------------------");
				}else{
					System.out.println("Renk ve yer yanlis");
					yanlis1+=1;
					System.out.println("-------------------");
				}
				if (pc1[0].equals(tahminbir) && pc1[1].equals(tahminiki) && pc1[2].equals(tahminuc) && pc1[3].equals(tahmindort)){
					System.out.println("Tebrikler oyun bitti.");
					System.out.println("Dogru sayiniz : " + dogru1 + " yanlis sayiniz : " + yanlis1);
					System.out.println("--------------------------");
					break;
				}	
		}
	}
	public static void Menu(){
		System.out.println("Sarý\n"+
				"Mavi\n"+
				"Kýrmýzý\n"+
				"Turuncu\n"+
				"Mor\n"+
				"Yeþil");
	}
}
