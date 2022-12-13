import java.util.*;  
public class StringJoinerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner joinNames = new StringJoiner(",", "[", "]");   
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
   


	}

}
