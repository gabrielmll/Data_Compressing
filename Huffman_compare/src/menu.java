import java.lang.*;
import java.io.*;
// Modify the display content to suit your purposes...
class menu {
	private static final String TITLE =
		"\n2910325 Data Compression coursework\n"+
		" by Gabriel Pires e Albuquerque de Mello\n\n"+
		"\t********************\n"+
		"\tDeclaration: Sorry but part of the program was copied from the Internet! \n" +
		"\t1. Huffman Code \n"+
		"\t2. Huffman Code with Analysis \n"+
		"\t3. Extended Huffman Code \n"+
		"\t4. Extended Huffman Code with Analysis\n"+
		"\t5. Both Algorithms without Analysis\n"+
		"\t6. Both Algorithms with Analysis\n"+
		"\t0. Exit \n"+
		"\t********************\n"+
		"Please input a single digit (0-6):\n";

	menu() {
		int selected=-1;
		
		while (selected!=0) {
			System.out.println(TITLE);
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			// selected = Integer.parseInt(in.readLine());
			try {
				selected = Integer.parseInt(in.readLine());
				switch(selected) {
					case 1: q1();
					break;
					case 2: q2();
					break;
					case 3: q3();
					break;
					case 4: q4();
					break;
					case 5: q5();
					break;
					case 6: q6();
					break;
				}
			}
			catch(Exception ex) {}

			if (selected != 0)
				pause();


		} // end while
		System.out.println("Bye!");
	}
	
	// Modify the types of the methods to suit your purposes...
	private void q1() {
		HuffmanCompression.main(1);
	}
	
	private void q2() {
		HuffmanCompression.main(2);
	}
	
	private void q3() {
		HuffmanCompression.main(3);
	}
	
	private void q4() {
		HuffmanCompression.main(4);
	}
	
	private void q5() {
		HuffmanCompression.main(5);
	}
	
	private void q6() {
		HuffmanCompression.main(6);
	}
	
	public static void pause() {  
		try {  
		        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  
				System.out.println("\nPress ENTER to go back to menu!\n");
		         in.readLine();  
		    } catch (IOException e) {  
		    }  
		}  
	
	public static void main(String[] args) {
		new menu();
	}
}