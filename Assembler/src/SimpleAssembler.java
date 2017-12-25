
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SimpleAssembler {
	private static final String FILENAME = "D:\\Library\\Desktop\\asm.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileReader fr = null;
		File file = new File("D:\\Library\\Desktop\\"+"binary"+".txt");
		PrintWriter writer = new PrintWriter(file);

		try {
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line, " !*^/,\b()");
				ArrayList<String> inst = new ArrayList<String>();
				while (st.hasMoreTokens()) {
					String str = st.nextToken();
					inst.add(str);
					System.out.println(str);
				}
				if(inst.get(0).equals("lw")) {
					writer.print("100011");

					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					writer.print(binaryString);
					writer.println("");

				}
				if(inst.get(0).equals("sw")) {
					writer.print("101011");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("add")) {
					writer.print("100000");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {
						binaryString="0"+binaryString;
					}			
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {
						binaryString="0"+binaryString;
					}
					
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {
						binaryString="0"+binaryString;
					}
					writer.print(binaryString);
					binaryString="00000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("sub")) {
					writer.print("100010");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					System.out.println(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					System.out.println(binaryString);

					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					System.out.println(binaryString);

					writer.print(binaryString);
					binaryString="00000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("and")) {
					writer.print("100100");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="00000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("or")) {
					writer.print("100101");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="00000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("slt")) {
					writer.print("100101");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="00000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("mult")) {
					writer.print("011000");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					 binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="0000000000000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("sll")) {
					writer.print("000000");
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="00000";
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3).substring(1, inst.get(3).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					binaryString="000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("mfhi")) {
					writer.print("010000");
					String binaryString="00000";
					writer.print(binaryString);
					 binaryString="00000";
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					 binaryString="00000";
					writer.print(binaryString);
					binaryString="000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("mflo")) {
					writer.print("010010");
					String binaryString="00000";
					writer.print(binaryString);
					 binaryString="00000";
					writer.print(binaryString);
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					 binaryString="00000";
					writer.print(binaryString);
					binaryString="000000";
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("addi")) {
					writer.print("001000");
					
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("myIns")) {
					writer.print("111111");
					
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("beq")) {
					writer.print("000100");
					
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2).substring(1, inst.get(2).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(3)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("blez")) {
					writer.print("000110");
					
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1).substring(1, inst.get(1).length())));
					for(int n=binaryString.length(); n<5; n++) {binaryString="0"+binaryString;}
					writer.print(binaryString);
					
					writer.print("00000");

					writer.print(binaryString);
					
					binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(2)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					if(binaryString.length()!=16)
						binaryString=binaryString.substring( binaryString.length()-16,binaryString.length());
					writer.print(binaryString);
					writer.println("");
				}
				if(inst.get(0).equals("j")) {
					writer.print("000010");
					writer.print("0000000000");

					
					String binaryString = Integer.toBinaryString(Integer.parseInt(inst.get(1)));
					for(int n=binaryString.length(); n<16; n++) {
						binaryString="0"+binaryString;
					}
					writer.print(binaryString);
					writer.println("");
				}
				
			}

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();
				writer.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}
		toHexa(file);
	}
	public static void toHexa(File f) throws IOException {
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		File file = new File("D:\\Library\\Desktop\\"+"hexadecimal"+".txt");

		PrintWriter writer = new PrintWriter(file);
		
		writer.print("v2.0 raw");
		while ((line = br.readLine()) != null) {
			long decimal=0;
			for(int i=0; i<line.length(); i++) {
				int m;
				if(line.charAt(line.length()-i-1)=='0') { 
					m=0;
				}else {
					m=1;
				}
				decimal+= (long)(m*(Math.pow(2, i)));
			}
			String l = Long.toHexString(decimal);
			for(int n=l.length(); n<8; n++) {
				l="0"+l;
			}
			writer.print(l+" ");

		}
		
		writer.close();
		br.close();
		
	}

}



