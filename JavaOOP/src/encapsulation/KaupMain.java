package encapsulation;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		
		String name ="", message ="";
		double height = 0.0d, weight = 0.0d;
		int idx=0;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하여 주세요.");
		name = scanner.next();
		System.out.println("키를 입력 하세요");
		height = scanner.nextInt();
		System.out.println("몸무게를 입력 하세요");
		weight = scanner.nextInt();

		
		KaupBean4 kaupBean = new KaupBean4();
		kaupBean.setName(name); // 위에서 불러왔기때문에
		kaupBean.setHeight(height);
		kaupBean.setWeight(weight);
		
		kaupBean.getIndex();
		
		//출력부
		System.out.println(kaupBean.toString());
	}
}
