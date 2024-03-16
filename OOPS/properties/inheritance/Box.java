package properties.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        // super();  Object class
        this.h=1;
        this.l=1;
        this.w=1;
    }

    //cube
    Box(double side){
        System.out.println("Box class constructor ");
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(double l,double h,double w){
        this.w=w;
        this.l=l;
        this.h=h;
    }

    Box(Box old){
        this.l=old.l;
        this.w=old.w;   
        this.h=old.h;
    }
    
    public void information(){
        System.out.println("Running the box");
    }

    
}
