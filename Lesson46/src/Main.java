import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner vc= new Scanner(System.in);
		System.out.print("���� �������� ��� ��������� (+ ��� -) : ");  
		String oper = vc.nextLine();  
		System.out.println("������� ���������� ������� �������");
		System.out.print("x1 = ");
		int x1 = vc.nextInt();  
		System.out.print("y1 = ");
		int y1 = vc.nextInt();  
		System.out.println("������� ���������� ������� �������");
		System.out.print("x2 = ");
		int x2 = vc.nextInt();  
		System.out.print("y2 = ");
		int y2 = vc.nextInt();  
		Calc add = new Calc();
		switch(oper) {
		case "+":{
			add.x=add.addition(x1, x2);
			add.y=add.addition(y1, y2);
			break;
			}
		case "-":{
			add.x=add.subtraction(x1, x2);
			add.y=add.subtraction(y1, y2);
			break;
			}
		}
		System.out.print("("+x1+", "+y1+") "+oper+" ("+x2+", "+y2+") = ("+ add.x+", "+add.y+")");
	}
}
