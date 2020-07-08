
public class EmergencyRoomProcess {
	public static void main(String[] args) {
		HospitalManagement hospitalManagement = new HospitalManagement();
		Employee employeepankaj = new Nurse(1, "Pankaj kumar", "Emergency", true);
		hospitalManagement.callUpon(employeepankaj);
		Employee kamlaDevi = new Doctor(2, "Kamla Devi", "emergency", true);
		hospitalManagement.callUpon(kamlaDevi);
	}
}
	