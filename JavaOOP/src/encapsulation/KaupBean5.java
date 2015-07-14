package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : kaup지수 프로그램을 객체화 하는 예제
 */
import java.util.Scanner;

public class KaupBean5 {
	
	private String name, message;
	private double height, weight;
	private int idx;
	

	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/*
	 * 멤버필드에 값을 저장하는 메소드가 setter 라고하면
	 * 값을 읽어 오는 메소드는 getter라고 합니다.
	 * 
	 * getter는 read의 의미입니다.
	 * getter의 특징은 return 타입이 존재한다는 것이고
	 * 특별한 상황이 아니라면 파라미터가 존재하지 않습니다.
	 *  	
	 */
	
	public String getMessage() {
		
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
		
		return message;
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
		+"카우푸지수 : "+getMessage();
		// getMessage는 retrun 값으로 받아 들여온다
		
		
		//출력부
		return str; // return 을 통해서 main으로 간다.
		//즉 출력부의 역할은 syso(main안에서 사용하는 출력)대신에 return을 사용한다.
	}
}
