import java.util.function.*;

public class FunctionalInterfacesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,Integer> adder = (value) -> {
			System.out.println("It's Function Interface");
			value=value + 3;
			return value;
		};
		System.out.println(adder.apply(4));
		Consumer<Integer> c=(x)->{
			System.out.println(x);
		};
		c.accept(22);

	}

}
