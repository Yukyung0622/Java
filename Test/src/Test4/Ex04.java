package Test4;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] names = {"������", "������", "�庸��", "������", "�̼���", "�����"};

		System.out.print("�̸� �˻� : ");
		String name = sc.next();

		int i = 0;
		while(!name.equals(names[i])){
			i++;
		}

		System.out.println(name + "�� �迭�� "+i+"���� �ֽ��ϴ�.");
		sc.close();
	}
}