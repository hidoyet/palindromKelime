package palindromKelime;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Palindrom olup olmad���n� ��renmek istedi�iniz kelimeyi giriniz: ");
		String word=scanner.nextLine();
		scanner.close();
		int j=word.length()-1;
		for(int i=0;i<j;i++) {
			if(word.charAt(i)!=word.charAt(j)) {
				j--;
				System.out.println("Kelime palindrom de�ildir.");
				break;
			}
			if(word.charAt(i)==word.charAt(j)) {
				j--;
				
				System.out.println("Kelime palindromdur.");
				break;
			}
			
		}
			
	}

}
