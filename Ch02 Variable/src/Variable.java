
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
		
		
		
		
		// 리터럴의 타입과 접미사
		// 변수의 타입은 리터럴 타입에 의해 결정됨
		
		
		
		// 문자 리터럴과 문자열 리터럴
		// String은 빈 문자열이 가능하지만 char는 하나의 문자가 반드시 있어야함
		// String은 클래스이므로 객체를 생성하는 연산자 new를 사용해야하지만 생략하는 표현도 허용
		
		
		
		// 문자열 결합
		String name = "chan" + "ho";
		System.out.println(name);
		// 문자열과 다른 타입의 변수 결합
		// 순서대로 결합, 문자열과 만나면 어떤 타입이든지 문자열로 결합됨
		System.out.println(1+2+name+"2");
		
		
		
		// 두 변수의 값 바꾸기
		int t = 10;
		int q = 20;
		int tmp;
		
		tmp = t;  // tmp에 t 저장
		t = q;    // t에 q 저장
		q = tmp;  // q에 tmp 저장
		
		
		
		// 기본형과 참조형 
		// 기본형 : 논리형(boolean) 문자형(char, String) 정수형(byte, short, int, long) 실수형(float, double)
		// 참조형 : 객체의 주소를 저장
		
		
		
		// 기본형의 종류와 범위
		// 논리형 : boolean true or false만 표현함으로 가장 작은 크기인 1byte
		// 문자형 : char은 자바에서 유니코드(2바이트 문자체계)를 사용함으로 2byte
		// 정수형 : int(기본형4btye)  short(2byte)  long(8byte)
		// 실수형 : double(기본형8byte)   float(4byte)
		
		
		
		// printf를 이요한 출력
		
		
		
		
	}

}
