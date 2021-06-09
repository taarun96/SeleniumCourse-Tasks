package Package1;

public class Java2 {

	  public int a1;
	    double d1;
	    private char c1;
	    String str1; 

	    void display1() 
	    {
	        System.out.println("a="+a1);
	        System.out.println("d="+d1);
	        System.out.println("c="+c1);
	        System.out.println("str="+str1);
	    }

	    public static void main(String[] args)   {

	    	Java2 ob = new Java2();
	        ob.a1 = 10;
	        ob.c1 = 'l';
	        ob.display1();
	    }

}
