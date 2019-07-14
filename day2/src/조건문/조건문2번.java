package Á¶°Ç¹®;

import java.util.Date;

public class Á¶°Ç¹®2¹ø {

	public static void main(String[] args) {
		
		Date date = new Date();
		int hour = date.getHours(); //ÇöÀç½Ã°¢
		if (hour < 11) {
			System.out.println("±Â¸ð´×~");
		}
		else if (hour < 18) {
			System.out.println("±Â ¾ÖÇÁÅÍ ´«~");
		}
		else if (hour <20) {
			System.out.println("±Â ÀÌºê´×~");
		}
		else {
			System.out.println("±Â³ªÀÕ~");
		}
	

	}

}
