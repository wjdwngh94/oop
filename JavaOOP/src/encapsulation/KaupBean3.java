package encapsulation;
/*
 * @Data : 2015.07.14
 * @Author : me
 * @Story : kaup지수 프로그램을 객체화 하는 예제
 */
import java.util.Scanner;

public class KaupBean3 {
	/*
	 * 은닉화가 되어 있는 않은 상태로
	 * 은니고하를 하려면 private 를 넣어야 한다.
	 * 그런데, 데이터 값은 private 를 넣어야 하고
	 * 기능 - 메소드는 public을 넣어야 한다.
	 * 
	 * 즉 이름 , 키, 몸무게 는 private
	 * 보고자 하는 message 는 public
	 */
	
	/*
	 * 자바의 계층 구조는 
	 * 최상단 -  프로젝트(어플리케이션)
	 * 		   클래스
	 * 		   멤버
	 * 멤버는 두가지로 구성되어 있다.
	 * -> private로 선언(감춰진)되어있는 속성 : 멤버 필드
	 * -> public으로 선언(open)되어있는 속성 : 멤버 메소드
	 */
	private String name, message;
	private double height, weight;
	private int idx;
// 정보는 처음에 모두 private로 두고 필요한 것만 public으로 바꿔준다
	
	public void getIndex() { // kaup index 를 구하는 메소드(동사)
		
		/*
		 * [오더]
		 * 카우푸지수는 키와 몸무게를 입력하면
		 * 저체중 -정상 비만 - 과체중 ... 을 구분하는 프로그램
		 * 콘솔출력되는 문장은 
		 * "[홍길동] 키 : 180cm , 몸무게 : 70kg , 카우푸지수 : 정상 "
		 */
		//30 초과 비만
		//24 초과 과체중
		//20 초과 정상
		//15 초과 저체중
		//13 초과 마름
		//10 초과 영양실조
		
		String name ="", message ="";
		double height = 0.0d, weight = 0.0d;
		int idx=0; // 카우푸 지숫 값
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("이름을 입력하여 주세요.");
		name = scanner.next();
		
		System.out.println("키를 입력 하세요");
		height = scanner.nextInt();
		
		System.out.println("몸무게를 입력 하세요");
		weight = scanner.nextInt();
		
		
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
		
		
		System.out.println("["+name+"]\n"
		+"키 : \t" + height + " cm \n"
				+ "몸무게 : \t"+weight+" kg\n"
						+"카우푸지수 : "+message);
	}
}
