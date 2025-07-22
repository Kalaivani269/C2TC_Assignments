package EntityclassAssignment1;

public class StudentDemo {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(101);
		s1.setGrade('B');
		s1.setName("kalaivani");
		
		System.out.println("First Student data:");
		System.out.println("Name= "+ s1.getName());
		System.out.println("Id= "+ s1.getId());
		System.out.println("Grade= "+ s1.getGrade());
		System.out.println("------------------------------------");
		
		Student s2 = new Student();
		s2.setId(102);
		s2.setGrade('S');
		s2.setName("charukesi");
		
		System.out.println("Second Student data:");
		System.out.println("Name= "+ s2.getName());
		System.out.println("Id= "+ s2.getId());
		System.out.println("Grade= "+ s2.getGrade());
		System.out.println("------------------------------------");
		
		Student s3 = new Student();
		s3.setId(103);
		s3.setGrade('A');
		s3.setName("Dharani");
		
		System.out.println("Third Student data:");
		System.out.println("Name= "+ s3.getName());
		System.out.println("Id= "+ s3.getId());
		System.out.println("Grade= "+ s3.getGrade());
		System.out.println("------------------------------------");
	}

}
