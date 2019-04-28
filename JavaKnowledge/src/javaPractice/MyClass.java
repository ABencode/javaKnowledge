package javaPractice;

public class MyClass {

	public static void main(String[] args) {
		
        Student ABen = new Student(); // ABen -> object or instance
        
        ABen.setId(123);
        ABen.setName("Adben");
        ABen.setAge(50);
        
        Student Sab = new Student(); // ABen -> object or instance
        
        Sab.setId(0123);
        Sab.setName("Saben");
        Sab.setAge(40);
        
        System.out.println(Sab.getName() + " is less than " + ABen.getAge() + " years old.");
	}

}
