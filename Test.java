public class main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		int n = Integer.parseInt();
		System.out.println("Input Student Name, ID, Score:");
		Student stu = new Student();
		for (int i = 0; i < n; i ++) {
			stu.id = in.next();
			stu.credits = in.next();
			stu.cgpa = in.nextInt();
			if (stu.credits > 50) {
				stu.id = stu.id;
				stu.credits = stu.credits;
				stu.cgpa = stu.cgpa;
			}
			System.out.println("name, ID of the highest score and the lowest score:");
		System.out.println("id"+stu.id);
			System.out.println("id"+stu.credits);
				System.out.println("id"+stu.cgpa);
		
		
			if (stu.cgpa > 3.75) {
				stu.id = stu.id;
				stu.credits = stu.credits;
				stu.cgpa = stu.cgpa;
			}
			System.out.println("id"+stu.id);
			System.out.println("id"+stu.credits);
				System.out.println("id"+stu.cgpa);
		}
	}
}