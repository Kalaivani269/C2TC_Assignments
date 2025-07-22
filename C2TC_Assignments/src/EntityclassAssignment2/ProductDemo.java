package EntityclassAssignment2;

public class ProductDemo {
public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setName("Hair drier");
		p1.setBatchno(289);
		p1.setQuality("Good");
		
		System.out.println("product no:1");
		System.out.println("Name= "+ p1.getName());
		System.out.println("Batchno= "+ p1.getBatchno());
		System.out.println("Quality= "+ p1.getQuality());
		System.out.println("------------------------------------");
		
		Product p2 = new Product();
		p2.setName("coffe maker");
		p2.setBatchno(345);
		p2.setQuality("Excellent");
		
		System.out.println("product no:2");
		System.out.println("Name= "+ p2.getName());
		System.out.println("Batchno= "+ p2.getBatchno());
		System.out.println("Quality= "+ p2.getQuality());
		System.out.println("------------------------------------");
		
		Product p3 = new Product();
		p3.setName("Water dispensor");
		p3.setBatchno(872);
		p3.setQuality("damaged");
		
		System.out.println("product no:3");
		System.out.println("Name= "+ p3.getName());
		System.out.println("Batchno= "+ p3.getBatchno());
		System.out.println("Quality= "+ p3.getQuality());
		System.out.println("------------------------------------");
		
		Product p4 = new Product();
		p4.setName("Water bottle");
		p4.setBatchno(123);
		p4.setQuality("Good");
		
		System.out.println("product no:4");
		System.out.println("Name= "+ p4.getName());
		System.out.println("Batchno= "+ p4.getBatchno());
		System.out.println("Quality= "+ p4.getQuality());
		
		
		
	

}
}