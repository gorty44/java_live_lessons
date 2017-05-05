package oop;

import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyPrinter {
	public static void main(String[] args) {
		double salary = 1234567.8901234567;
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		
		System.out.println(nf.format(salary));
		// NumberFormat is abstract class and getCurrencyInstance() is factory method
		// Object is initialized inside this method, can't create instance of NumberFormat because it's abstract
		nf = NumberFormat.getCurrencyInstance(Locale.JAPAN); 
		System.out.println(nf.format(salary));
		
		System.out.println(nf.getClass().getName());
	}
}

