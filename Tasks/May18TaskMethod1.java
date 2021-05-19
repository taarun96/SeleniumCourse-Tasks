public class May18Task {
    public static void main(String[] args) {
        double[][] a = new double [3][3];

        a[0][0] = 3.5;
        a[0][1] = 3.0;
        a[0][2] = 4.2;

        a[1][0] = 2.4;
        a[1][1] = 2.6;
        a[1][2] = 2.6;

        a[2][0] = 3.1;
        a[2][1] = 2.6;
        a[2][2] = 4.1;



        int row = a.length;
        int col = a[0].length;

        System.out.println("***Double 2D Array****");

        for(int i=0; i<row ;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+"  ");
            }

            System.out.println();
        }

        char[][] b = new char [3][3];

        b[0][0] = 'a';
        b[0][1] = 'b';
        b[0][2] = 'c';

        b[1][0] = 'd';
        b[1][1] = 'e';
        b[1][2] = 'f';

        b[2][0] = 'g';
        b[2][1] = 'h';
        b[2][2] = 'i';



        int row2 = b.length;
        int col2 = b[0].length;

        System.out.println("***Char 2D Array****");

        for( int i=0; i<row2 ;i++)
        {
            for( int j=0;j<col2;j++)
            {
                System.out.print(b[i][j]+"  ");
            }


            System.out.println();
        }




        String[][] c = new String [3][3];

        c[0][0] = "one";
        c[0][1] = "two";
        c[0][2] = "three";

        c[1][0] = "four";
        c[1][1] = "five";
        c[1][2] = "six";

        c[2][0] = "seven";
        c[2][1] = "eight";
        c[2][2] = "nine";



        int row3 = c.length;
        int col3 = c[0].length;

        System.out.println("***String 2D Array****");

        for( int i=0; i<row3 ;i++)
        {
            for( int j=0;j<col3;j++)
            {
                System.out.print(c[i][j]+"  ");
            }

            System.out.println();
        }
    }
}
