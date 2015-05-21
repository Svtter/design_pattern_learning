package Strategy;

public class Client {
	public static void main(String args[]) {
		Context c;
		c =  new Context(new ConcreteStrategy1());
		c.contextOperate();
		c = new Context(new ConcreteStrategy2());
		c.contextOperate();
	}
}
