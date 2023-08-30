package country;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

import task.Main;

public class EntryOper {

	ArrayList<cities> m1() {
		
		cities c1 = new cities ("Burhanpur", 450331, "Lalbag");
		cities c2 = new cities ("Dhar", 454001, "sardarpur");
		cities c3 = new cities ("Khargone", 451001, "segaon");
		cities c4 = new cities ("Khandwa", 450001, "palasi");
		cities c5 = new cities ("Cinchwad", 411033, "pimpri");
		cities c6 = new cities ("Aundh", 4110077, "pashan");
		cities c7 = new cities ("Lonavala", 410301, "waksai");
		cities c8 = new cities ("sShivajinagar", 411003, "bhamb");
		cities c9 = new cities ("Baran", 325205, "atru");
		cities c10 = new cities ("Bundi", 323001, "nainwa");
		cities c11 = new cities ("Jhalawar", 326001, "talai");
		cities c12 = new cities ("Kota", 324001, "anwan");
		
		ArrayList<cities> alindore = new ArrayList<>();
		alindore.add(c1);
		alindore.add(c2);
		alindore.add(c3);
		alindore.add(c4);
		
		ArrayList<cities> alpune = new ArrayList<>();
		alpune.add(c5);
		alpune.add(c6);
		alpune.add(c7);
		alpune.add(c8);
		
		
		ArrayList<cities> alkota = new ArrayList<>();
		alkota.add(c9);
		alkota.add(c10);
		alkota.add(c11);
		alkota.add(c12);
		
		HashMap<String,ArrayList<cities>> hm = new HashMap<>();
		hm.put("MP",alindore);
		hm.put("Maharastra", alpune);
		hm.put("Rajasthan", alkota);
	
		
		TreeMap<String, HashMap<String,ArrayList<cities>>> tm = new TreeMap<>();
		tm.put("Country", hm);
		
		return alindore;
		
	}
	public static void main(String[] args) {
		
		EntryOper eo = new EntryOper();
		eo.m1();
	}

}
