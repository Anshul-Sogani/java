package test;
import java.util.Comparator;

public class ComImp implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		
		if(o1%10>o2%10) {
			return 1;
		}
		
		
		
		return -1;
	}

}
