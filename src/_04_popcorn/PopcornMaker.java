package _04_popcorn;

public class PopcornMaker {
public static void main(String[] args) {
	Popcorn pop=new Popcorn("Butter");
	Microwave micro=new Microwave();
	micro.putInMicrowave(pop);
	micro.setTime(10);
	pop.applyHeat();
	micro.startMicrowave();
	
}
}
