package clients;

import processes.GeneralManufacturingProcess;
import processes.SmartPhoneManufacturingProcess;

public class DeviceeFactory {
	public static void main(String[] args) {
		GeneralManufacturingProcess manufacturing1 = new SmartPhoneManufacturingProcess("IPhone");
		manufacturing1.launchProcess();
	}

}
