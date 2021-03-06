package processes;

public abstract class GeneralManufacturingProcess {
	String processName;

	public GeneralManufacturingProcess(String name) {
		processName = name;
	}

	protected abstract void assembleDevice();

	protected abstract void testDevice();

	protected abstract void packagDevice();

	protected abstract void storeDevice();

	// template method
	public void launchProcess() {
		if (processName != null && !processName.isEmpty()) {
			assembleDevice();
			testDevice();
			packagDevice();
			storeDevice();
		} else {
			System.out.println("No process name was specified....");
		}
	}
}
