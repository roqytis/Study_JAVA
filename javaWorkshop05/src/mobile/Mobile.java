package mobile;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;

	public abstract int operate(int time);//+operate(time:int):int 
	public abstract int charge(int time);//+charge(time:int):int
	
	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mobile(String mobileName, int batterySize, String osType) {
		super();
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
}
