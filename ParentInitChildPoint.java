class Parent1{
    int num;
    Parent1(){
        num =0;
    }

    void message(){
        System.out.println("Hellppppppp");
    }
}
class Child1 extends Parent1{
    String name;
    Child1(){
        name = "SAM";
    }
    void display(){
        System.out.println("Drawwingggggg");
    }
}

public class ParentInitChildPoint{
    public static void main(String[] args){
Parent1 c = new Child1();
    c.message();
    }
}
