package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : kaup지수 프로그램을 객체화 하는 예제
 */
import java.util.Scanner;

public class KaupBean4 {
	
	private String name, message;
	private double height, weight;
	private int idx;
	/*
	 * toString을 활용해 출력부를 완성하고
	 * 스캐너가 입력받은 값을 저장하는 메소드가 필요하다.
	 * 
	 * 그리고 이를 setter 메소드라고 합니다.
	 * 이 setter메소드는 set + 멤버필드()로 이름이 자동 생성됩니다.
	 * setter는 write 의 의미이다(메모리 공간할당과 부여)
	 * */	
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	public void getIndex() { 
		// void - return 값이 없다는 뜻
		idx = (int)( (weight / ( height * height )) * 10000);
		
		if (idx > 10) {
		 message = "영양 실조";
		}
		if (idx > 13) {
			 message = "마름";
		}
		if (idx > 15) {
			 message = "저체중";
		}
		if (idx > 20) {
			 message = "정상";
		}
		if (idx > 24) {
			 message = "과체중";
		}
		if(idx > 30){
			 message = "비만";
		}
	}
	
	
	@Override
	public String toString() {
		
		// 선언부
		String str = ""; // 지역변수는 무조건 초기화 한다.
		
		
		//연산부
		str="["+name+"]\n"+"키 : \t" 
		+ height + " cm \n"
		+ "몸무게 : \t"
		+weight+" kg\n"
		+"카우푸지수 : "+message;
		
		//출력부
		return str; // return 을 통해서 main으로 간다.
		//즉 출력부의 역할은 syso(main안에서 사용하는 출력)대신에 return을 사용한다.
	}
}
