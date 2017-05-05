package oop;

import java.util.HashSet;
import java.util.Set;

public class Test {
	private static Set<SomeKey> set = new HashSet<>();

	private class SomeKey {
		private int parameter;

		public SomeKey(int param) {
			parameter = param;
		}

		@Override
		public int hashCode() {
			return -1;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o)
				return true;
			if (o == null)
				return false;

			SomeKey sk = (SomeKey) o;
			if (this.parameter == sk.parameter)
				return true;
			return false;
		}
	}

	public static void main(String[] args) {
		SomeKey s1 = new Test().new SomeKey(1);
		SomeKey s2 = new Test().new SomeKey(2);
		SomeKey s3 = new Test().new SomeKey(3);
		SomeKey s4 = new Test().new SomeKey(4);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		
		System.out.println(set);
	}
}
