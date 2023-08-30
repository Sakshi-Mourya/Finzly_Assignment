package country;

import java.util.ArrayList;

public class data {

	public static void main(String[] args) {
		
		EntryOper eo = new EntryOper();
		ArrayList<cities> list = eo.m1();
		
		for(cities city : list) {
			if(city.getCityName() == "Burhanpur") {
				System.out.println(city);
			}
		}
	}
}
