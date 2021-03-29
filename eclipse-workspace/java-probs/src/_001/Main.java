package _001;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Student st1 = new Student("��", "10");
		Student st2 = new Student("��", "20");
		Student st3 = new Student("��", "30");
		
		ArrayList <Student>list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		for (Student stu : list) {
			System.out.println(stu.getName());
			System.out.println(stu.getNo());
		}
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("��� �˻��� �ϰ�����ø� y, �����ϰ�����ø� n");
			String input = scan.next();
			boolean flag = false;
			
			if (input.equals("y")) {
				System.out.println("�˻��� �����մϴ�.");
				String name = scan.next();
				
				for (Student stu : list) {
					if (stu.getName().equals(name)) {
						System.out.println("�ش��ϴ� �л��� �й���:" + stu.getNo());
						flag = true;
						break;
					}
				}
				
				if (!flag) {
					System.out.println("�ش��ϴ� �л��̸��� �����ϴ�.");
				}
				
			}
			else if (input.equals("n")) {
				break;
			}
			
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
