import java.util.*;

public class TestHashcodeAndEquals {
	public static void main(String[] args) {
		
		Bird bird_obj1 = new Bird();
		Bird bird_obj2 = new Bird();
		
		System.out.println("Is bird_obj1 & bird_obj2 equal : "+bird_obj1.equals(bird_obj2));
		
		System.out.println("Hashcode of bird_obj1 : "+bird_obj1.hashCode());
		
		System.out.println("Hashcode of bird_obj2 : "+bird_obj2.hashCode());
		
	}
}
