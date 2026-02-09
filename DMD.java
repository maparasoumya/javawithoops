#dynamic method dispatch
class Animal{
	void show(){
		System.out.println("Animal class");
	}
}
class Dog extends Animal{
	@Override
	void show(){
		System.out.println("Dog class");
	}
}
class Cat extends Animal{
	@Override
	void show(){
		System.out.println("Cat class");
	}
}
public class Main {
	public static void main (String Args[]){
		Animal a;
		a = new Dog();
		a.show();
		a = new Cat();
		a.show();
	}
}
