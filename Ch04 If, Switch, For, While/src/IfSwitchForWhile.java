import java.util.Scanner;


public class IfSwitchForWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		// if문, if-else문
		/*
		if (조건식) {
		    조건식이 참일 때 수행될 문장
		}      
		*/
		System.out.println("점수를 입력하세요.");
		String input = scanner.nextLine();
		int score = 0;
		score = Integer.parseInt(input);
		
		if (score >= 60) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		
		
		// 조건식의 다양한 예
		// str.equals("yes") : 문자열str의 내용이 "yes"일때(대소구분)
		// str.equalsIgnoreCase("yes") : 문자열str의 내용이 "yes"일때(대소구분X)

		
		
		// 중첩 if문
		char grade= ' ';
		char opt = ' ';
		
		if(100>=score && score>=90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}
			else if(score < 94) {
			    opt = '-';
			}
		}
		else if(90>score && score>=80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			}
			else if(score < 84) {
			    opt = '-';
			}
		}
		else if(80>score && score>=70) {
			grade = 'C';
			if(score >= 78) {
				opt = '+';
			}
			else if(score < 74) {
			    opt = '-';
			}
		}
		else if(70>score && score>=60) {
			grade = 'D';
			if(score >= 68) {
				opt = '+';
			}
			else if(score < 64) {
			    opt = '-';
			}
		}
		else {
			grade = 'F';
		}
		
		System.out.println("학점은"+grade+opt+"입니다.");
		
		
		
		
		// switch문
		/*
		switch(조건식{
			case 값1 :
				참일때 실행문장
				break;
			case 값2 :
				참일때 실행문장
				break;
			default :
			     실행문
		}
		*/
		// switch문의 조건식 결과는 정수 또는 문자열이어야함
		// case문의 값은 정수 상수(문자 포함), 문자열만 가능, 중복X
		
		System.out.println("현재 월을 쓰시오.");
		int month = 0;
		month = scanner.nextInt();
		
		switch(month) {
			case 12:
			case 1:
			case 2:
				System.out.println("겨울입니다");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄입니다");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름입니다");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을입니다");
				break;
			default:
				System.out.println("잘 못 입력했습니다.");
			
		}
		
		
		
		
		
		// 임의의 정수만들기  Math.random()
		// Math.random 0.0 ~ 1.0 난수생성
		// 범위 늘리기 * : Math.random*3
		// 범위 늘리기 + : Math.random+3
		// 형변환 : (int)(Math.random)
		int rannum = 0;
		for (int i = 1; i<=5; i++) {
			rannum = (int)(Math.random()*10);
			System.out.println(rannum);
		}
		
		// for문
		/*
		for (초기화; 조건식; 중감식){
			  참일때 실행 문장
		 }
		*/
		
		for (int a = 1; a<=3; a++) {
			System.out.println("Hello");
		}
		

		
		
		
		
		// 중첩 for문
		// 5행 10열 별찍기
		
		for(int t = 1; t <= 5; t++) {
			for( int q = 1; q<=10; q++)
				System.out.printf("*");
			System.out.println("");
		}
		
		
		
		
		// while문
		/*
		
		초기화
		while (조건식){
			실행문
			증감식
		}
		*/
		int z = 5;
		while(z--!=0) {
			System.out.println(z + "- I can do it.");
		}
		
		int sum = 0;
		int n = 0;
		while(sum<=100) {
			System.out.printf("%d - %d%n", n, sum);
			sum += ++n;
		}
		
		
		
		
		
		// do-while 문
        /*
        do {
            참일때 실행문 
        } while (조건식);
        
        
         */  
		
		   
		
	}

}
