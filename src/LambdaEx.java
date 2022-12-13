
@FunctionalInterface
interface abc{
	String say(String message);
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        abc ob=(message)->{
        	return message;
        };
        System.out.println(ob.say("Hello"));
	}

}
