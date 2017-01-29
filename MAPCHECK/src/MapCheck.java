import java.util.*;

public class MapCheck {
	
	private Map<Long,Long> map1 = new HashMap<Long,Long>();
	
	public void setVaules(Long x,Long y)
	{
		System.out.println("The value of X is :"+x);
		
		map1.put(x, y);
	}
	
	public Long getValue(Long x)
	{
		return map1.get(x);
	}

	public static void main(String[] args) {
		
		MapCheck  m1 = new MapCheck();
		m1.setVaules(7L, 7L);
		System.out.println("The returned value is "+m1.getValue(8L));
		System.exit(0);
	}

}
