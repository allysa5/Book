import java.util.Scanner;

public class BookApplication {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the sku");
		String sku = keyboard.nextLine();

		Book b = new Book();
		if (sku.equals("Java1001")){

			b.setSku("Java1001");
			b.setTitle("Head First Java");
			b.setAuthor("Kathy Sierra and Bert Bates");
			b.setDescription("Easy to read Java workbook");
			b.setPrice(47.50);
			System.out.println(b.getTitle());

		}
		if (sku.equals("Java1002")){
			b.setSku("Java1002");
			b.setTitle("Thinking in Java");
			b.setAuthor("Bruce Eckel");
			b.setDescription("Details about Java under the hood");
			b.setPrice(20.00);
		}


		if (sku.equals("Orcl1003")){

			b.setSku("Orcl1003");
			b.setTitle("OCP: Oracle Certified Professional Java SE");
			b.setAuthor("Jeanne Boyarsky");
			b.setDescription("Everything you need to know in one place");
			b.setPrice(45.00);
		}

		if(sku.equals("Python1004")){
			b.setSku("Python1004");
			b.setTitle("Automate the Boring Stuff with Python");
			b.setAuthor("Al Sweigart");
			b.setDescription("Fun with Python");
			b.setPrice(10.50);
		}

		if (sku.equals("Zombie1005")){
			b.setSku("Zombie1005");
			b.setTitle("The Maker's Guide to the Zombie Apocalypse");
			b.setAuthor("Simon Monk");
			b.setDescription("Defend Your Base with Simple Circuits, Arduino, and Raspberry Pi");
			b.setPrice(16.50);
		}

		if (sku.equals("Rasp1006")){
			b.setSku("Rasp1006");
			b.setTitle("Raspberry Pi Projects for the Evil Genius");
			b.setAuthor("Donald Norris");
			b.setDescription("A dozen fiendishly fun projects for the Raspberry Pi!");
			b.setPrice(14.75);
		}
		System.out.println(b.getTitle());

	}
	
}
