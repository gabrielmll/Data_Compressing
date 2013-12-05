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
		
		System.out.println("SIZE: "+size+" bits");
	}
	
	public void calculateHuffmanSize(List<Symbol> huffmanList) {
		int size = 0;
		
		for (Symbol i : huffmanList) {
			size = size + (i.frequency * i.code.length());
		}
		
		System.out.println("SIZE: "+size+" bits");
	}
	
	public void calculateExtHuffmanSize(String input, List<Symbol> exthuffmanlist) {
		String twoChars;
		
		for (char c : input.toCharArray()) {
			
		}
	}
	
	public void calculateEntropy(List<Symbol> list) {
		
		double H = 0;	// Entropy
		
		for (Symbol i : list) {
			H = H + (i.probability * (Math.log(i.probability) / Math.log(2)));
		}
		
		H = -H;
		
		System.out.println("Entropy: "+H);
	}
	
	public void averageLengths(List<Symbol> list) {
		float length = 0;
		
		for (Symbol i : list) {
			length = length + (i.code.length() * i.probability);
//			System.out.println(i.code.length()+"*"+i.probability+" = "+length);
		}
		
		System.out.println("Average length: "+length);
	}
}
