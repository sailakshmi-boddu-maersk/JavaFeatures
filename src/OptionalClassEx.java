import java.util.*;
public class OptionalClassEx {

	public static void main(String[] args) {
		/*
        String[] str = new String[10];  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  
        */
		String[] str = new String[10];
		for(int i=0;i<10;i++) {
			str[i]="AB";
		}
		
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");  



	}

}
