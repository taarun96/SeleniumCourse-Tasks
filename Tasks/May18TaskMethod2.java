public class May18Task2 {
    public static void main(String[] args) {
        double[][] a = {
                        {1.1,2.2,3.3},
                        {4.4,5.5,6.6},
                        {7.7,8.8,9.9}
                        };




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

        char[][] b = {{'a','b','c'},
                      {'d','e','f'},
                      {'g','h','i'}
                      };

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




        String[][] c = {{"One","Two","Three"},
                        {"Four","Five","Six"},
                        {"Seven","Eight","Nine"}};





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
