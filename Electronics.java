package java8;

public interface Electronics {
	public static String onOff(boolean isOn) {
		if(isOn==true) {
			return "It's working";
		}
		else {
			return "It's not working";
		}
	}
	public void printElectronicType();
}
