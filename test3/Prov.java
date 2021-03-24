package test3;

import java.util.ArrayList;

public class Prov implements Comparable{
	String proname;
	int yqsum;
	ArrayList<City> citys = new ArrayList<City>();
	public Prov(String proname) {
		this.proname = proname;
	}
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getYqsum() {
		return yqsum;
	}
	public void setYqsum(int yqsum) {
		this.yqsum = yqsum;
	}
	public ArrayList<City> getCitys() {
		return citys;
	}
	public void setCitys(ArrayList<City> citys) {
		this.citys = citys;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Prov prov = (Prov)o;
		if(this.yqsum > prov.getYqsum()) return -1;
		else if(this.yqsum < prov.getYqsum()) return 1;
		else {
			if(this.proname.compareTo(prov.getProname()) < 0) return -1;
			else return 1;
		}
	}
	
	
}
