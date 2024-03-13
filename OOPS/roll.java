public class roll {
    public static void main(String[] args) {
        int[] numbers=new int[5];

        //store 5 names
        String[] names= new String[5];

        //data of 5 students:{rollno,name,marks}
        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks= new float[5];

        Student[] students= new Student[5];
        Student kunal=new Student(13,"Kunal Kushwaha",85.4f);
        // Student rahul=new Student();
        // kunal.rno=13;
        // kunal.name="kunal";
        
        // kunal.changeName("Shoe Lover");
        // kunal.greeting();


        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random=new Student(0, null, 0);
        System.out.println(random.name);
        
        // Student one=new Student();
        // Student two=one;

    }
    
}
//create a class

class Student{
    int rno;
    String name;
    float marks=90;

    //we need a way to add the values of the above properties object by object
    //we need one word to access every object

    void greeting(){
        System.out.println("Hello! my name is "+this.name);
    }

    void changeName(String name){
        this.name=name;
    }

    Student(Student other){
        //this is how you call a constructor from another constructor
        this(13,"default", 24f);
    }

    //student arpit=new Student(17,"arpit",89.7f);
    //here this will be replaced with arpit
    Student(int roll,String naam,float marks){
        this.rno=roll;
        this.name=naam;
        this.marks=marks;
    }

}

class A{
    final int num=10;
    String name;

    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }
}
