package kontrRob1;

public class KontrRob1zad2 {

	public static void main(String[] args) {
		int a = 639;										// ����
		String astr = Integer.toString(a); 					// ���������� � ������
		char sot = astr.charAt(0);							// ������ ����
		char od = astr.charAt(2);							// ������ �������
		String aizm = od + astr.substring(1,2) + sot;		// ����� ������ � ������� �� ��������� ���������
		a = Integer.parseInt(aizm);							// ���������� � ��� �����
		System.out.println(a);								// ����

	}

}
