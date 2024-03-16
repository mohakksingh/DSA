package packages.staticExample;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name){
            this.name=name;
        }
        @Override
    public String toString(){
        return name;
    }   
    }

    

    public static void main(String[] args) {
        Test a=new Test("Kunal");
        Test b=new Test("Mohak");
    }
}
