package pkg1;
import java.util.Random;
// https://java-slides.netlify.app/javabeginnerclass1
//תרגיל בית מתקדם בנושא for וביטויים בוליאניים
public class Questions_for_2 {

	public static void main(String[] args) {
		exercise1();
		exercise2();
		exercise3();
		exercise4();
		exercise5();
		exercise6();
		exercise7();
		

	}
	
	static void exercise1()
	{
		System.out.println("-------------- exercise1 ------------------");
		for( int i = 0; i<=4; i++ ) {
			for ( int j = 0; j<=4; j++) {
				System.out.print(i+"" +j + " ");
			}
			System.out.println("");
		}
	}
	static void exercise2()
	{
		System.out.println("-------------- exercise2 ------------------");
		 for(int i = 0 ; i <= 100 ; i++)
		 {
			 if(i%5 != 0 ) {
				 continue;
			 }
			 System.out.println(""+ i + " ") ;
		 }
	}

	static void exercise3()
	{
		System.out.println("-------------- exercise3 ------------------");
		Random rand = new Random();
		
		for(int a1 = rand.nextInt(100) ;  ; a1 = rand.nextInt(100))
		{
			System.out.println(a1);
		    if(a1%11 == 0) {
		    	break;
		    }
		}
	}

	static void exercise4()
	{
		System.out.println("-------------- exercise4 ------------------");
		for(int i = 0 ; i <= 10 ; i++)
	    {
			
			System.out.print(10-i + " ");
		    
	    }
		System.out.println("");
	}

	static void exercise5()
	{
		System.out.println("-------------- exercise5 ------------------");
		Random rand = new Random();
		int a, d1, d2 ;
		do {
			a = rand.nextInt(90)+10 ;
			System.out.println(a);
			d1 = (a/10)%10;
			d2 = a%10;
		} while(d1 != d2);
		
		
	}

	static void exercise6()
	{
//		כתבו לולאת for ובה:
//			הגרילו מספר שלם בתחום (0,100]. על לולאת ה for לרוץ שוב ושוב עד אשר יתקבל המצב הבא:
//			בשלוש הריצות העוקבות האחרונות שלה הוגרל מספר אי זוגי. יש להדפיס את כל המספרים שהוגרלו כדי שניתן יהיה לעקוב אחרי ריצת התכנית.
		
		System.out.println("-------------- exercise6 ------------------");
		Random rand = new Random();
		int a, n1, n2, n3, i ;
		i = 0;
		n1 = -1;
		n2 = -1;
		n3 = -1;
		
		do {
			a = rand.nextInt(100) ;
			System.out.println(a);
			if(a%2 == 0 ) {
				i = 0;
				n1 = -1;
				n2 = -1;
				n3 = -1;
			} else {
				//  מספר  אי זוגי
				if(i==0) {
					n1 = a;
				} else if( i == 1) {
					n2 = a;
				} else if( i == 2) {
					n3 = a;
				}
				i++;
			}
			
		} while(n1>0 && n2>0 && n3>0 );
	}

	static void exercise7()
	{// בפתרון שאלה זו מותר להגדיר שני משתנים בלבד.
		// לולאת for בתוך לולאת for כך שיתקבל בפלט לוח הכפל של המספרים 1-10.

		//הערה: כדי להדפיס "tab" ניתן להשתמש בתו t\ (באופן דומה לשימוש בתו n\ כשרוצים לשים במחרוזת תו ירידת שורה), תוכלו ליישר את עמודות לוח הכפל בעזרתו כדי לקבל הדפסה מסודרת ומיושרת
		
		System.out.println("-------------- exercise7 ------------------");
	}


}
