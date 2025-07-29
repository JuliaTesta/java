	package Package;
	
	import java.util.Locale;
	import java.util.Scanner;
	
	public class Program {
	
		public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
				int n;
				
				System.out.print("How many rooms will be rented? ");
				n = sc.nextInt();
				sc.nextLine();
			
				
				String[] name = new String[n];
				String[] email = new String[n];
				int[] room = new int[n];
				
				for(int i =0; i<n; i++) {
					System.out.printf("Rent #%d: \n", i+1);
					
					System.out.print("Name: ");
					name[i] = sc.nextLine();
					
					System.out.print("Email: ");
					email[i] = sc.nextLine();
					
					System.out.print("Room: ");
					room[i]= sc.nextInt();
					sc.nextLine();
				}
				
				int menorRoom = 10000;
				
				System.out.println("Busy rooms: ");
				for(int i=0; i<n; i++) {
					if(room[i]<menorRoom) {
						menorRoom= room[i];
					}
					System.out.printf("%d: %s, %s \n", room[i], name[i], email[i]);
				}
				
				
			sc.close();
		}
	
	}
