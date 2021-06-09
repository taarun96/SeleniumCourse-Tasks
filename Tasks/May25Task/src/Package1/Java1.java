package Package1;

public class Java1 {
	  public int a1;
	  public double d1;
	  public char c1;
	  public String str1;

	   public void display1()
	    {
	        System.out.println("a="+a1);
	        System.out.println("d="+d1);
	        System.out.println("c="+c1);
	        System.out.println("str="+str1);
	    }

	    public static void main(String[] args)   {

	    	Java1 ob1 = new Java1();
	        ob1.a1 = 10;
	        ob1.c1 = 'l';
	        ob1.display1();
	    }

}
