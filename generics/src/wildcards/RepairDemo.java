package wildcards;

import java.util.Arrays;
import java.util.List;

public class RepairDemo {
	public static void main(String[] args) {
		List<Repairable> items = Arrays.asList(new Blender(), new Car(), new Toster());
		RepairShop.fixAll(items);
	}
}
