package Viettel.TestAutomation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        int a=1;
        int b =2;
        int c;
        c=a+b;
        System.out.println( "Hello World!" +c);
        
        //Songuyento
        Songuyento SNT = new Songuyento(6);
        SNT.PrintNumber();
    }
}
