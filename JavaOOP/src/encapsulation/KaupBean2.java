package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : kaup지수 프로그램을 객체화 하는 예제
 */
import java.util.Scanner;

public class KaupBean2 {
	
	/*
	 * 
	 * 멤버 필드는 은닉화된 데이터 값이 모여 있는 공간이며,
	 * 가장 큰 특징은 초기화를 하지 않는다.
	 * 
	 * 이유는 멤버메소드 들이 이 데이터 공간(필드)를
	 * 공유하기 때문 이다.
	 * 
	 */
	private String name, message;
	private double height, weight;
	private int idx;
	
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
		/*
		 * public : 접근 제한자
		 * String : return type 결과값의 타입이 String 이다.
		 * toString() : 메소드 이름 - 이것은 자바에서 픽스된 메소드
		 */
		
		// sysout을 해야하기 때문에 리턴 타입이 있다.
		
		/*
		 *선언부
		 *연산부
		 *출력부 
		 *는 언제나 존재한다
		 */
		
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
