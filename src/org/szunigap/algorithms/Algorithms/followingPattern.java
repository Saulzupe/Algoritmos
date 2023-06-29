import java.util.* ;
class Pattern {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size");
		int size = s.nextInt();
		char value = 'A'; 
		int space=size-1;
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j<= space; j++) {
				System.out.print(" ");
			}
			for(char k = value; k >= 'A'; k--){
				System.out.print(k);
			}
			space--;
			value++;
			System.out.println();
		}
	}
}
