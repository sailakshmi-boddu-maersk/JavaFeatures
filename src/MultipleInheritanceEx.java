interface A{
  public default void printUsingA(){
    System.out.println("Print from A");
  }
}
interface B{
  public default void printUsingB(){
    System.out.println("Print from B");
  } 
} 

public class MultipleInheritanceEx implements A,B {

	public static void main(String[] args) {
		MultipleInheritanceEx ob=new MultipleInheritanceEx();
		ob.printUsingA();
		ob.printUsingB();

	}

}
