package XuLyBietLe;
import java.util.Stack;

//Chuong trinh nem loi EmptyStackException 
public class Test3 
{
	public static void main(String[] args)   
	{  
		Stack<String> st=new Stack<String>();// tao mot doi tuong 
		st.push("Hello");  
		//st.push("Chao ban");   
		System.out.println(st.pop());   
		System.out.println(st.pop()); 
	}
}
