package _02_cat;

public class CatRunner {
public static void main(String[] args) {
	Cat Cat=new Cat("Meep");
	Cat.meow();
	Cat.printName();
	for (int i = 0; i < 9; i++) {
		Cat.kill();
	}
	
}
}
