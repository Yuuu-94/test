import java.util.HashSet;


public class Setsample {

	public static void main(String[] args){
		java.util.Set<String> set=new HashSet<String>();

		set.add("value1");
		set.add("value2");
		set.add("value3");
		set.add("value4");
		set.add("value5");

		set.add("value2");

	for(String s : set){
		System.out.println(s);
		}
	}
}
