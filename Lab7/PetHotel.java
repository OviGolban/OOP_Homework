import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class PetHotel {
	private Map<Integer, Caine> hotel = new HashMap<>();
	
	public void addPereche(Integer camera, Caine caine) {
		hotel.put(camera, caine);
	}
	public int dimensiune() {
		return hotel.size();
	}
	public void entrySet() {
		for(Entry<Integer, Caine> entry : hotel.entrySet()) {
			Integer key = entry.getKey();
			Caine value = entry.getValue();
			System.out.println("Camera:" + key + " se afla " + value);
		}
	}
	public Caine getCaine(Integer key) {
		return hotel.get(key);
	}
	public void afisareCamere() {//keyValues
		for(Integer key: hotel.keySet()) {
			System.out.println(key);
		}
	}
	
	public void afisareCaini( ) {//values
		for(Caine caine : hotel.values()) {
			System.out.println(caine);
		}
	}
	public void setNewPereche(Integer camera, Caine caine) {
		hotel.put(camera, caine);
	}

}
