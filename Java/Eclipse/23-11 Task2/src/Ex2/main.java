package Ex2;

public class main {
	public static void main(String args[]) {
		Aviao plane=new Aviao();
		plane.setFabricante("Airbus");
		plane.setModelo("A380");
		plane.setVs("4");
		plane.setMilitary(false);
		plane.setCapacity(853);
		plane.setMaxflighttime("17:15hrs");
		System.out.println(plane.getFabricante());
		System.out.println(plane.getModelo());
		System.out.println(plane.getVs());
		System.out.println(plane.getMilitary());
		System.out.println(plane.getCapacity());
		System.out.println(plane.getMaxflighttime());
	}

}
