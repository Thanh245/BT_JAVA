// in so ngay tuong ung cua 1 thang, nam
package BaiTap;
public class Bai5
{
	public void In(int month, int year)
	{
		int day;
		switch (month)
		{
		case 2: 
			if((year %4 == 0 && year %100 != 0) || (year %400 == 0))
				day = 29;
			else day = 28;
			break;
		case 4: case 6: case 9: case 11: 
			day = 30;
			break;	
		default: //1,3,5,7,8,10,12
			day = 31;
			break;
		}
		System.out.println("Thang " +month + " nam " + year+ " co " +day + " ngay");
	}
	public static void main (String s[])
	{
		Bai5 dt = new Bai5();
		dt.In(12,2019);
		dt.In(2,2016);
	}

}
