import java.util.stream.*;
import java.util.*;
public class StreamsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(str -> str.length()<=3 && str.length()!=0 ).collect(Collectors.toList());
		filtered.forEach(i->System.out.println(i));
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		//get list of unique squares
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(i->System.out.println(i));
        List<Integer> sortedNum= numbers.stream().sorted().collect(Collectors.toList());
        sortedNum.forEach(i->System.out.println(i));
        
	}
}

