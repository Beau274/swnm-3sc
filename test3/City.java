package test3;

public class City implements Comparable{
	String cityname;
	int yqnum;
	public City(String city,int sum) {
		this.cityname=city;
		this.yqnum=sum;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getYqnum() {
		return yqnum;
	}
	public void setYqnum(int yqnum) {
		this.yqnum = yqnum;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		City city = (City)o;
		if(this.yqnum > city.getYqnum()) return -1;
		else if(this.yqnum < city.getYqnum()) return 1;
		else {
			if(this.cityname.compareTo(city.getCityname())<0) return -1;
			else return 1;
		}
	}
}

