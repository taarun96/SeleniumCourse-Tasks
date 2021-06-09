package May27PolymorphismOverloading;

public class May27TaskMultiplication {


        int a;
        int b;

        void multiplication()
        {
            int c = a *b;
            System.out.println("Multiplication="+c);
        }

        void multiplication(int x,int y)
        {
            int c = x *y;
            System.out.println("Multiplication="+c);
        }

        void multiplication(int x,int y,int z)
        {
             int c = x * y *z;
            System.out.println("Multiplication="+c);
        }

        void multiplication(double x,double y)
        {
            double c = x *y;
            System.out.println("Multiplication="+c);
        }


        void multiplication(double x,double y,double z)
        {
            double c = x *y *z;
            c=Math.round(c * 100.0) / 100.0;
            System.out.println("Multiplication="+c);
        }


        public static void main(String[] args) {

            May27TaskMultiplication ob = new May27TaskMultiplication();
            ob.a=1;
            ob.b=2;
            ob.multiplication();
            ob.multiplication(10,10);
            ob.multiplication(10,10,10);
            ob.multiplication(10.2,10.3);
            ob.multiplication(10.2,10.3,10.2);
        }


}
