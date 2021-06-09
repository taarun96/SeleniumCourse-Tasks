public class May20Task {
    public static void main(String[] args) {
        String str="We want to go to toronto ";

        String[] strArr=str.split(" ");

        for(int i=0;i< strArr.length;i++){
            if(strArr[i].endsWith("o"))
                System.out.println(strArr[i]);
        }

    }
}
