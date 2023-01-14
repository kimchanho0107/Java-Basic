
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 연산자와 피연산자
		// 피연산자 : 연산이 되는 대상
		
		
		
		// 연산자의 종류
		
		// 산술 연산자 : + _ * / % << >>
		// 비교 연산자 : > < >= <= == !=
		// 논리 연산자 : && || ! & | ^ ~
		// 대입 연산자 : =
		// 기타 : (type) ?: instanceof
		
		// 피연산자 1개 : 단항 연산자
		// 피연산자 2개 : 이항 연산자
		// 피연산자 3개 : 삼항 연산자
		
		// 피연산자 사이에 있는 연산자는 뺄셈 연산자, 피연산자 앞에 있는 연산자는 부호 연산자
		
		
		
		// 연산자의 우선순위
		// 상식 선에서 해결 가능
		
		
		// 연산자의 결합규칙
		// 산술 > 비교 > 논리 > 대입
		// 단항 > 이항 > 삼항
		// 연산의 진행방향은 왼쪽->오른쪽 (단항, 대입 제외)
		int x, y;
		x = y = 3;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		
		
		// 증감 연산자 ++, --
		// 증가 연산자 ++ : 피연산자의 값을 1 증가시킴
		// 감소 연산자 -- : 피연산자의 값을 1 감소시킴
		// 전위형(++i) : 값이 참조 전에 증가
		// 후위형(i++) : 값이 참조 후에 증가
		int i=5, j=0;
		j = i++;
		System.out.println("j=i++; 실행후, i=" + i + ", j=" + j);
		j = ++i;
		System.out.println("j=++i; 실행후, i=" + i + ", j=" + j);
		
		
		
		// 부호 연산자
		// 피연산자 앞에 붙는 -, +
		// boolean, char 제외한 기본형
		
		
		
		// 형변환 연산자
		// (변한하고싶은 타입)피연산자
		// int -> char 유니코드 번호에 맞는 문자 출력
		// float -> int 소수점 아래 값 버림
		
		double d = 85.4;
		int score = (int)d;
		System.out.println("score=" + score);
		System.out.println("d=" + d);
		int z = 34;
		char zchar = (char)z;
		System.out.println("zchar=" + zchar);
		System.out.println("z=" + z);
		
		
		
		// 자동 형 변환
		// 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환됨
		
		
		
		// 사칙 연산자
		// + - * / %
		int a = 10;
		int b = 4;
		System.out.printf("%d + %d = %d%n", a, b, a + b);
		System.out.printf("%d - %d = %d%n", a, b, a - b);
		System.out.printf("%d * %d = %d%n", a, b, a * b);
		System.out.printf("%d / %d = %d%n", a, b, a / b);
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		
		
		
		// 산술 변환
		// 이항 연산자는 두 피연산자의 타입이 일치해야 연산 가능. 그래서 연산 전에 형변환 연산자로 타입을 일치시켜야함
		// 두 피연산자의 타입을 큰 타입으로 일치 시킨다
		// 피연산자의 타입이 int보다 작은 타입이면 int로 변환 (char,short의 표현범위가 좁아 연산 중에 오버플로우가 발생할 확률이 높음)
		System.out.println(5/2);
		System.out.println(5/(float)2);
		
		byte t = 10;
		byte q = 30;
		byte c = (byte)(t * q);    // t * q 를 byte로 형 변환 해주지 않으면 int로 자동 형변환해 계산됨으로 int값이 나와 c에 저장되는데 c와 타입이 다름으로 오류가 떠서 현변환을 해줘야한다.
		System.out.println(c);
		
		// 두 피연산자를 계산한 값이 두 피연산자의 타입의 범위를 벗어나면 값이 다르게 나오므로 형변환해줘야한다
		int m = 1000000;
		int n = 1000000;
		long k = m * n;
		long l = (long)m * n;
		System.out.println(k);  // 형변환 안했을때
		System.out.println(l);  // 형변환 했을때
		
		
		
		
		
		// Math.round()로 반올림하기
		long result = Math.round(4.52);  // 소수점 첫째 자리에서 반올림
		System.out.println(result);
		// 소수점 첫째 자리가 아닌 다른자리에서 반올림을 하고싶을때
		long result1 = Math.round(3.141592 * 100);
		System.out.println(result1);
		
		
		
		
		// 나머지 연산자 %
		System.out.println(10%8);  // 10을 8로 나눈 나머지 2
		
		
		
		
		// 비교 연산자
		// 대소비교 연산자 < > <= >=
		// 등가비교 연산자 == !=
		
		
		// 문자열의 비교 equals()
		String str = new String("abc");
		boolean res = str.equals("abc");
		System.out.println(res);
		
		
		
		// 논리 연산자 &&(or) ||(and)
		
		
		
		// 논리 부정 연산자 !
		// 반복적으로 적용하면 참과 거짓이 차례대로 반복, 토글버튼 구현가능
		boolean bool = true;
		System.out.println(bool);
		System.out.println(!bool);
		
		
		
		// 조건 연산자
		// result = 좌항 ? x : y ;  result에 좌항이 참이면 x 거짓이면 y 대입
		// if ( x > y )
		//    result = x;
		// else
		//    result = y;  if문으로 작성하면 이렇게됨
		
		
		
		
		// 대입 연산자  =
		// 오른쪽에서 왼쪽으로 수행
		// 변수 앞에 final 을 붙이면 상수가 됨 (한번 저장된 값은 바꿀 수 없음)
		
		
		// 복합 대입 연산자
		// i += 3;     i = i + 3;
		// i -= 3;     i = i - 3;
		// i *= 3;     i = i * 3;
		// i /= 3;     i = i / 3;
		// i %= 3;     i = i % 3; 
		// i <<= 3;     i = i << 3;
		// i >>= 3;     i = i >> 3;
		// i &= 3;     i = i & 3;
		// i ^= 3;     i = i ^ 3;
		// i |= 3;     i = i | 3;
		// i *= 10 + j;     i = i * (10 + j);
		
		
		
		
		
		
		

		
		
	}

}
