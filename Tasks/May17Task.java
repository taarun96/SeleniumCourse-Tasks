public class May17Task {
    public static void main(String[] args) {
        //Initial Declarations
        int[] intArray={1,2,3,4,5};
        double[] doubleArray={1.2,2.2,3.2,4.2,5.2};
        char[] charArray={'a','b','c','d','e'};
        String[] stringArray={"One","Two","Three","Four","Five"};

        //int
        System.out.println("Integer Array List:");
        for(int i=0;i<=intArray.length-1;i++)
        {
            if(i==intArray.length-1)
            {
                System.out.print(intArray[i]);
                break;
            }
            System.out.print(intArray[i]+" , ");
        }

        //double
        System.out.println(" ");
        System.out.println("Double Array List:");

        for(int i=0;i<=doubleArray.length-1;i++) {
            if(i==doubleArray.length-1)
            {
                System.out.print(doubleArray[i]);
                break;
            }
            System.out.print(doubleArray[i]+" , ");

        }

        //char
        System.out.println(" ");
        System.out.println("Char Array List:");

        for(int i=0;i<=charArray.length-1;i++) {
            if(i==charArray.length-1)
            {
                System.out.print(charArray[i]);
                break;
            }
            System.out.print(charArray[i]+" , ");


        }

        //String
        System.out.println(" ");
        System.out.println("String Array List:");

        for(int i=0;i<=stringArray.length-1;i++) {
            if(i==stringArray.length-1)
            {
                System.out.print(stringArray[i]);
                break;
            }
            System.out.print(stringArray[i]+" , ");


        }

    }
}
