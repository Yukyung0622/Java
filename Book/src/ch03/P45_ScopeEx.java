package ch03;

/*
 * ��¥ : 2021/12/31
 * �̸� : ������
 * ���� : ������ ���� p45
 */

public class P45_ScopeEx { //1.Ŭ���� ����
	
	int no; // Ŭ����
	
	public static void main(String[] args) {
		
		String name;
		
		if(true) {
			// �޼��� ���ȿ��� ������ ���� ��� ����
			name = "ȫ�浿";
			// if�� ���ȿ��� ���� ����
			String email = "hong@test.com";
					
		}
		//if�� �� �ۿ��� email ������ ����ϸ� ���� �߻�
		String email = "hong@test.com";
		
	}

}
