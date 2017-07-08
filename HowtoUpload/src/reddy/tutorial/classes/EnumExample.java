package reddy.tutorial.classes;

import java.time.Month;

public class EnumExample {

	public enum Months{
		JAN,FEB,MAR,APR
	}
	public static void main(String[] args) {
EnumExample.printMonthNamesWithEnum(Months.JAN);
EnumExample.printMonthNameswithIndex(1);
	}
	
	public static void printMonthNamesWithEnum(Months month) {
		  if(month==Months.JAN){
			  System.out.println("january");
		  }else if  (month==Months.FEB)
			  System.out.println("febraury");
			}

	public static void printMonthNameswithIndex(int index) {
  if(index==1){
	  System.out.println("january total "+(78+index));
  }else if  (index==2)
	  System.out.println("febraury");
	}
}
