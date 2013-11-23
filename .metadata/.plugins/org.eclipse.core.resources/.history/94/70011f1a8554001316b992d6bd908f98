import java.util.List;


public class Analysis {
	int originalSize = 0;
	int huffmanSize = 0;
	int extHuffmanSize = 0;
	
	public void calculateOriginalSize(List<Symbol> input) {
		int size = 0;
		
		for (Symbol i : input) {
			size = size + (8 * i.frequency);
		}
		
		System.out.println("Original file is: "+size);
	}
}
