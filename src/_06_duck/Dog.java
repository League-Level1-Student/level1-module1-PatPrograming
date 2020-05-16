package _06_duck;

public class Dog {
	int numberOfFriends;
	String favoriteFood;
	void Bark() {
		System.out.println("Bark");
	}
	void Run() {
		System.out.println("Run");
	}
	Dog(String favoriteFood, int numberOfFriends) {
	  	this.favoriteFood = favoriteFood;
	  	this.numberOfFriends = numberOfFriends;
	}
}
