package Package2;

import Package1.Java1;

public class Java3 {

    int a3;
    double d3;
    char c3;
    String str3; // data members

    void display3() // member function
    {
        System.out.println("a="+a3);
        System.out.println("d="+d3);
        System.out.println("c="+c3);
        System.out.println("str="+str3);
    }

    public static void main(String[] args)   {
        Java1 obj3 = new Java1();
        obj3.a1 = 100;
        obj3.display1();

    }

}