//Chuong trinh hien thi chuoi "Hello" va nem doi tuong NullPointException 
package XuLyBietLe;
public class Test4 
{
	static String s;  
	public static void main(String[] args)   
	{  
		try   
		{ 
			System.out.println(" The length of string s is :"+ s.length());   
		}   finally {System.out.println("Hello");}  
	 }
}
