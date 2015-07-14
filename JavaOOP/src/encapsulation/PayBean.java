package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : 세금/실월급 - main과 bean 분리
 */

public class PayBean {
	//메소드는 선언부, 연산부, 출력부 로 나뉜다.
	//Bean Class(main 메소드가 없는)는 멤버 필드 영역과 멤버 메소드 영역으로 나누니다.

	
	// 멤버필드는 보안이 필요하기 때문에 private로
	private String name; // 메인의 타입과 동일하게 유지한다. 그리고 초기화 하지 않는다. !!
	private int salary, tax, money;
	
									// 멤버 메소드 영역의 시작
	
	//scanner로 받는 값은 set이다.
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	//계산을 통해서 출력은 get / read 이다.
	public int getTax() {
		int tax=0; // 지변 초기화
		tax =  (int) (salary * 0.1);
		return tax;
	}
	
	public int getMoney() {
		int money =0; // 지변 초기화
		money = salary - this.getTax();
		// this. 이라는 것은 이 클래스 내부에 있는 ~~~~ 의 의미이다.
		return money;
	}
	
	
	@Override // 계산 완료된 값을 main으로 돌려준다.
	public String toString() {
		
		return "["+ this.name +"님의 실급여]\n"+
		"월급 : " + this.salary +" 만원\n"+
				"세금 : " + this.getTax() + " 만원\n"+
		"실급여 : " + this.getMoney() +" 만원\n";
	}
	
}
