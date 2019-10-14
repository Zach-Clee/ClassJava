
public class App {
	public static void main(String[] args) {
		Greeting g = new Greeting();
		Person Enemy = new Enemy();
		Person Friend = new Friend();
		
		g.greeting(Friend);
		g.greeting(Enemy);
	}
}


class Greeting{
	public void greeting(Person p) {
		p.speak();
	}
}

class Friend implements Person{
	public void speak() {
		System.out.println("Hello my friend");
	}
}

class Enemy implements Person{
	public void speak() {
		System.out.println("I hate you");
	}
}