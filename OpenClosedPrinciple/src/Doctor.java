
public class Doctor extends Employee {
	// Doctors
		private void prescribeMedical() {
			System.out.println("prescribe Medical ...");
		}

		private void diagnosePatients() {
			System.out.println("Diagnosind Patient  .....");
		}

	public Doctor(int id, String name, String departnemt, boolean working) {
		super(id, name, departnemt, working);
		System.out.println("Doctor in Action .....");
	}

	@Override
	public void performDuties() {
		prescribeMedical();		
		diagnosePatients();
	}

}
