
public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 화면에 글자 출력
		System.out.println("3+8"); //ln이 있으면 줄바꿈
		System.out.println(3+8);
		
		
		// 사칙연산 계산하기
		System.out.print("5+3=");
		System.out.println(5+3);
		System.out.print("5-3=");
		System.out.println(5-3);
		System.out.print("5*3=");
		System.out.println(5*3);
		System.out.print("5/3=");
		System.out.println(5/3);
		
		
		// 변수의 선언과 저장
		// 변수타입 변수이름 = 저장할 값
		int x = 5;
		System.out.print("x에 저장된 값은 ");
		System.out.println(x);
		
		x = 10;
		System.out.print("x에 새로 저장된 값은 ");
		System.out.println(x);
		
		
		// 변수의 타입
		// 정수 int long(20억이 넘을 때)
		// 실수 float(오차없이 7자리) double(15자리)
		// 문자 char(문자) String(문자열)
		int a = 100;
		double pi = 3.14;
		char ch = 'I';
		String str = "StudyHard";
		
		System.out.print("int a에 저장된 값:");
		System.out.println(a);
		System.out.print("double pi에 저장된 값:");
		System.out.println(pi);
		System.out.print("char ch에 저장된 값:");
		System.out.println(ch);
		System.out.print("string str에 저장된 값:");
		System.out.println(str);
		
		
		
		// 상수와 리터럴
		// 상수 : 변수와 같이 값을 저장할 수 있지만 한번 저장하면 변경 불가능
		// 선언 방법 : final 변수타입 변수이름(모두 대문자로 하는게 관례) = 저장할 값
		// 리터럴 : 저장된 값을 지칭

	}

}
