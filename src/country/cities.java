package country;

public class cities {

	public cities() {
	}
	
	private String cityName;
	private int pinCode;
	private String area;
	
	public cities(String cityName, int pinCode, String area) {
		super();
		this.cityName = cityName;
		this.pinCode = pinCode;
		this.area = area;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getArea() {
		return area;
	}

	public void setAddress(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "cities [cityName=" + cityName + ", pinCode=" + pinCode + ", area=" + area + "]";
	}
	

}
