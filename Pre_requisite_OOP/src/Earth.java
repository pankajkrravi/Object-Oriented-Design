
public class Earth {
	public static void main(String[] args) {
    /*
		Human pankaj = new Human();
		pankaj.age = 20;
		pankaj.eyeColor = "Gray";
		pankaj.heightInInch=20;
		pankaj.name="Pankaj kumar";
		pankaj.spesk();
		
		Human jatan = new Human();
		jatan.age = 22;
		jatan.eyeColor = "Gray";
		jatan.heightInInch=24;
		jatan.name="Jatan Veer";
		jatan.spesk(); */
		//=================================================
		Human human=new Human(19, "Pankaj kumar", 10, "Gray");
		Human human2=new Human(14, "Jatan kumar", 30, "Red");
		human.spesk();
		human2.spesk();
	}
}