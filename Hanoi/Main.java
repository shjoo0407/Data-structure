import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] studs = {
				new Student(14042,"��**","����",2),
				new Student(62028,"��**","����",3),
				new Student(49064,"��**","����",2),
				new Student(14055,"��**","����",2),
				new Student(31076,"��**","�濵",2),
				new Student(29010,"��**","��ǻ��",2),
				new Student(67034,"��**","����",2),
				new Student(14020,"��**","����",2),
				new Student(14007,"��**","����",2),
				new Student(51061,"��**","�濵",2)
		};
		Arrays.sort(studs);
		print(studs,"id");
		
		Arrays.sort(studs,Student.CompName);
		print(studs,"�̸�");
		
		Arrays.sort(studs,Student.CompDept);
		print(studs,"�а�");
		
		Arrays.sort(studs,Student.CompGrade);
		print(studs,"�г�");

		}
	public static void print(Student[] studs, String key) {
		System.out.println();
		System.out.println(key + "(��)�� ����");
		System.out.println("--------------");
		for(Student s: studs) {
			System.out.println(s.getId()+" "+s.getName() + " "+ s.getDept() + "\t"+s.getGrade());
		}
		
		
	}

}