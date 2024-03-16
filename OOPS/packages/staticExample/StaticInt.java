package packages.staticExample;


//thi is  a demo to show initialisation of static variable
public class StaticInt {
    static int a=4;
    static int b;


    //only runs once when the first object is created
    static{
        System.out.println("I am in Stati block");
        b=a*5;
    }
    public static void main(String[] args) {
        StaticInt obj=new StaticInt();
        System.out.println(StaticInt.a+""+StaticInt.b);

        StaticInt.b +=3;
    }
}
