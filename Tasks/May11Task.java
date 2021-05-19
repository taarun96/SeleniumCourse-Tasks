public class May11Task {
    public static void main(String[] args) {
        int a=5,b=7,c=4;

        if(a==b && b==c && c==a)
            System.out.println("The given triangle is a Equilateral triangle");
        else if((a==b || a ==c )|| (b==a || b==c) || (c==a || c==b))
            System.out.println("The given triangle is a Isoceles triangle");
        else if((a*a)==((b*b)+(c*c)))
            System.out.println("The given triangle is a Right Angled triangle");
        else if((a!=b && a!=c) || (b!=a && b!=c) ||(c!=a && c!=b))
            System.out.println("The given triangle is a Scalene triangle");

    }
}
