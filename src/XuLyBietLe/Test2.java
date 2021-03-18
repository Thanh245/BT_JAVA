//Chuong trinh nem loi NumberFormatException 
package XuLyBietLe;
public class Test2 
{
	static String thisYear="2.016";  
	public static void main(String[] args)   
	{  
		try   
		{ 
			System.out.println("Next year :"+(Integer.parseInt(thisYear)+1)); 
		}catch(Exception e){}System.out.println("Hello");   
	} 
}
