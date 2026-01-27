class Outer{
    class Inner{
        void display(){
            System.out.println("Inner class Method");
        }
    }
}
public class Main {
    public static void main(String[] args) {
            Outer.Inner obj = new Outer().new Inner();
            obj.display();
        }
}
