package wildcards;

import java.util.List;

public class RepairShop {
	public static <T extends Repairable> void fixAll(List<T> repairables) {
		repairables.stream().forEach(T::repair);
	}
}