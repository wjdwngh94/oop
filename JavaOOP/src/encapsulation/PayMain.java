package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : 세금/실월급 - main과 bean 분리
 */

import java.util.Scanner;

public class PayMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int salary=0, money=0 , tax=0;
		String name="";
		
		
		System.out.println("이름을 입력하여 주세요");
		name = scanner.next();
		System.out.println("월급을 입력하여 주세요(단위 : 만원)");
		salary= scanner.nextInt();
		
		
		PayBean payBean = new PayBean();
		
		payBean.setName(name);
		payBean.setSalary(salary);
		
		
		System.out.println(payBean.toString());
	}
}
