public class TestStudent {
	
	public static boolean search(Student students[],Student student)
	{
		for(Student mystudent:students)
		{
			if (mystudent.getClass()==student.getClass())
			{
				if(mystudent.equals(student))
					return true;
			}
		}
		
		return false;	
	}

	public static void main(String[] args) {
		Student students[]=new Student[7];
		students[0]=new EnggStudent("Anusha",1286,"IT","SVIT");
		students[1]=new EnggStudent("Divya",1285,"IT","SVIT");
		students[2]=new EnggStudent("Kavya",1097,"cse","SVIT");
		students[3]=new BscStudent("Navya",3216,"science","MGR");
		students[4]=new BscStudent("Deepthi",3252,"Arts","MGR");
		students[5]=new CommerceStudent("Sravya",4123,"Science","KBR");
		students[6]=new CommerceStudent("Pravalika",4512,"Maths","KBR");
		
		CommerceStudent newstudent = new CommerceStudent("Navya",4123,"Science","KBR");
		if(search(students,newstudent))
			System.out.println("Student found");
		else
			System.out.println("student not found");
		EnggStudent newstudent1 = new EnggStudent("Divya",1280,"IT","SVIT");
		if(search(students,newstudent1))
			System.out.println("Student found");
		else
			System.out.println("student not found");
		

	}

}
