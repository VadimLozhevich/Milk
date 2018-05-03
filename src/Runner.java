import by.gsu.epamlab.Milk;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Milk milks[] = {
				new Milk("Milk 1", 1, true),
				new Milk("Milk 2", 2, true),
				new Milk("Milk 3", 5, false),
				new Milk("Milk 4", 3, true),
		};
		
		for (Milk milk: milks) {
			System.out.println(milk);}
		
		int proc = 0;
		int nal = 0;
		for (int i = 0; i < milks.length ; i++) {
		proc += milks[i].getProc();
		if (milks[i].isNal() == true) {
			nal += 1;
			}
	
	
		}
	System.out.println("Средний процент " + proc/milks.length);
	System.out.println("Количество видов в наличии " + nal);
	}
}

