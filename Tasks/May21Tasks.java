import java.text.SimpleDateFormat;
import java.util.Date;

public class May21Task {

    String format;

    public May21Task(String format){

        this.format=format;

    }

    public void display(){
        Date date=new Date();
        SimpleDateFormat sd=new SimpleDateFormat(format);
        String dateString=sd.format(date);
        System.out.println(dateString);
    }
    public static void main(String[] args) {

        May21Task obj1=new May21Task("dd-MMMM-yyyy");
        May21Task obj2=new May21Task("dd| MMMM yy h:MM");
        May21Task obj3=new May21Task("yyyy-MM-dd | hh:mm:ss");
        May21Task obj4=new May21Task("EEEE yyyy/MM/dd");
        May21Task obj5=new May21Task("dd-MM-yyyy|E|hh:mm");
        May21Task obj6=new May21Task("hh:mm:ss");

        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
        obj5.display();
        obj6.display();






    }
}
