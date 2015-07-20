import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.util.Scanner;

public class ateeqTest {

	public ateeqTest() {
		// TODO Auto-generated constructor stub
		System.out.println("Hi this is Abstract class");
		
	}

	/**
	 * @param args
	 */
	public int FindNos(List<Integer> numbers)
	{
		int result = numbers.size() ;
		return result;
	}
	
	public String conv_bin()
	{
		Scanner get = new Scanner (System.in);
		System.out.println("Enter a value");
		int v1 = Integer.parseInt(get.nextLine());
		String c1,c2,c3,c4;
		c1 = Integer.toString(v1);
		c2 = Integer.toBinaryString(v1);
		c3 = Integer.toHexString(v1);
		c4 = Integer.toOctalString(v1);
		String result =   c1 +" "+ c2+" " + c3 +" "+ c4;
		return result;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		BufferedReader bn = new BufferedReader (new InputStreamReader(System.in));
		int a = Integer.parseInt(bn.readLine());
		numbers.add(a);
		ateeqTest at = new ateeqTest();
		System.out.println(at.FindNos(numbers));
		System.out.println(at.conv_bin());
		String s = "ahmed";
		s = "ateeq";
		System.out.println(s);

	}

}
