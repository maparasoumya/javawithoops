class Animals{
        void info(){
            System.out.println("Jaanwar ka Ilaaka");

        }
    }
class Dog extends Animals {
    void info (){
        System.out.println("Dog is Barking");
    }
}

public class Main {
    public static void main(String[] args) {
            Dog k = new Dog();
            k.info();
        }
}
