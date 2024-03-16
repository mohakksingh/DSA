package properties.inheritance;

public class Main {
    public static void main(String[] args) {
        // Box box1=new Box(4,7.9,4);
        // Box box2=new Box(box1);

        // System.out.println(box1.l+" "+box1.w+" "+box1.h);

        // BoxWeight box3=new BoxWeight();
        // System.out.println();

        // Box box5=new BoxWeight(2,3,4,8);
        // System.out.println(box5);

        //there are many variable in both parent and child classes
        //you are given access to variables that are in the refernce type
        //hence you should have access to weight variable
        //this also means,that the ones you are trying to access should be initialised
        //but here, when the obj is of the parent class,how will you call the child class
        //that is why error
        // BoxWeight box6=new Box(2,3,4,8);
        // System.out.println(box6);

        BoxPrice box=new BoxPrice(5,8,20);
        
    }
}
