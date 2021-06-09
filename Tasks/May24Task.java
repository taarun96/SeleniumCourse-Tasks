import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class May24Task {

    String parseString;
    String patternString;


    public May24Task(String parseString,String patternString){

        this.parseString=parseString;
        this.patternString=patternString;

    }

    public void display() throws ParseException {
        Date date=new Date();
        SimpleDateFormat sd=new SimpleDateFormat(patternString);
        Date dateString=sd.parse(parseString);
        System.out.println(dateString);
    }
    public static void main(String[] args) throws ParseException {

        May24Task obj1=new May24Task("Thursday 2016/06/23","EEEE yyyy/MM/dd");
        May24Task obj2=new May24Task("23-06-2016 | thu | 8:34","dd-MM-yyyy | E | hh:mm");
        May24Task obj3=new May24Task("8:34:22","hh:mm:ss");

        obj1.display();
        obj2.display();
        obj3.display();







    }
}
