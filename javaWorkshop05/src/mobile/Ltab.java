package mobile;

public class Ltab extends Mobile {

	public Ltab() {
			}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
		
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize()-(time*10));//사용후 배터리 용량 변경
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize()+(time*10));//충전 후 배터리 용량 변경
		return getBatterySize();
	}

}
