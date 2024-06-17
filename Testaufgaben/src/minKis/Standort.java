package minKis;

import java.util.*;

public class Standort {
	private int id;
	private String name;
	private List<Station> stationen;
	
	//Standardkonstruktor
	public Standort() {
	}
	
	//Konstruktor mit allen Attributen
	public Standort(int id, String name) {
		this.id = id;
		this.name = name;
		this.stationen = new ArrayList<Station>();
	}
	
	public void addStation(Station station) {
		stationen.add(station);
	}
	
	public int removeStation(int id) {
		int result = 0;
		for (Station station : stationen) {
			if (station.getId() == id) {
				boolean sDel = stationen.remove(station);
				if (!sDel) {
					result = -1;
				} else {
					result = 1;
				}
			}
		}		
		return result;
	}
	
	//Getter und Setter
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	public String toString() {
	    String result = "";
	    
	    // Stationsinformationen
	    result += "Standort: " + name;
	    result += " ID: " + id + "\n";
	    result += "Stationen:\n";
	    
	    // Einrückung für Abteilungen
	    for (Station station : stationen) {
	        result += "  - " + station.toString() + "\n";
	    }
	    
	    return result;
	}
	
	public List<Station> getStationen() {
	    return stationen;
	}
}
