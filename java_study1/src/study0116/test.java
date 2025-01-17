package study0116;

public class test {

	public static void main(String[] args) {
		// 주석- 설명이나 메모, 코드 대기 등등
		/*
		 * 여러줄 주석 (실행 x) -> 각 코드의 설명 적어놓는 용도로 사용!
		 *
		 * 주석 단축키 ctrl+ /
		 * 실행 단축키 ctrl + f11
		 *
		 *
		 */
		// TODO Auto-generated method stub
		System.out.println("자바 이클립스 테스트");

		// 데이터를 사용하려면 변수를 선언해야한다.
		// 변수를 선언할 때는 반드시 데이터타입을 정해야 한다.
		// 변수의 이름은 저장할 데이터에 맞는 의미 있는 이름으로 짓기!
		// 정수 : int, byte, short, long
		// 실수 : float, double
		// 문자 : char
		// 논리 : boolean
		int age; 
		age = 100; //변수에 100 저장 (대입연산)
		age = 27; //같은 공간에 덮어쓰기 한거임;;
		age = "가"; //자바에서 ''는 문자를 의미! ""해야 .문자열을 의미! (자바스크립트는 '" 모두 문자열!) 문자는 다른 값으로 바뀌어서 저장이 됨. 문자열은 저장xx


//


		system.out.println(27);
		system.out.println(27);
		byte num1 = 120;
		system.out.println( num1 );
		num1 =130;
		
//		
int num2 =20; // 변수를ㄹ 선언하면서 데이터 저장 - 변수 초기화!
int num3 =43; // 'num3은 43이다' 라고 하면 안 됨! =>'num3에 43을 저장했다' (O)
		
//
	int sum = num2+num3;
	system.out.println(sum);
	
	
	// 사각형의 너비와 높이로 너비를 구하라!!!
	int area =width + height;
	int width=20;
	int height=30;
	// 
	
	
	
	
	int blue =20;
	int red = 15;
	int white = 0;
	// 파란 컵에 오렌지주스가 20ml 있다.
	// 빨간 컵에 딸기주스가 50ml 가 있다.
	// 파란 컵에 딸기주스를, 빨간 컵에 오렌지주스를 담으려면 어떻게 해야하는가?
	// blue와 red 값 출력
	// blue= 15, red=20 이 방법은 아님
	white=blue;
	blue=red;
	red=white;
	System.out.println(blue);
	System.out.println(red);
	
	

	int birth_year=1991;
	// 김철수가 태어난 연도를 birth_year에 저장했다.
	// 나이는?
	
	int myAge = 2025 - birth_year;
	System.out.println( myAge );
System.out.println();


float fnum =2.156f;
System.out.println( fnum);
fnum = 2.123456789f;
System.out.println(fnum);
double dnum =1.1234567890123456189;
System.out.println(dnum);

	char ch='a';
	System.out.println( ch);
	ch='가';
	System.out.println( ch);
	ch=97;
	System.out.println( ch);
	System.out.println( ch - 'A');
	System.out.println( '나' - 64);
	
	
	//
	
	
	String name = "홀길동";
	
	
	boolean isApple = true; //참 거짓 값을 가지는 타입!
	
	
	}

}