/* ==========================================
   ■■■ 실행 흐름의 컨트롤(제어문) ■■■
   - switch 구문
=============================================*/

// ○ 사용자로부터 1부터 3까지의 정수 중 하나를 입력받아
// 입력받은 정수만큼의 별문자(★)가 출력되는 프로그램을 구현한다.
//	단, 두 가지 방법으로 작성할 수 있도록 한다.

// ① switch문의 일반 모델을 사용하여 구현한다.
// ② switch문의 기본 모델을 사용하되,
// 『break;』를 딱 한 번만 사용할 수 있도록 한다.

// 실행 예)
// 임의의 정수입력(1~3): 3
// ★★★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수입력(1~3): 1
// ★
// 계속하려면 아무 키나 누르세요...

// 임의의 정수입력(1~3): 2
// ★★
// 계속하려면 아무 키나 누르세요...

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test041
{
	public static void main(String[] args) throws IOException
	{
		// [내 풀이]
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num;
		String star ="";
		System.out.print("임의의 정수 입력(1~3) : ");
		num = Integer.parseInt(br.readLine());
		
		// switch의 일반 모델
		
		switch(num){
			case 3 : star ="★★★"; break;
			case 2 : star = "★★"; break;
			case 1: star = "★"; break;
			deafult: star = "입력오류";
		}
			
		System.out.println(star);
	
	
		// switch의 기본 모델
		switch(num){
			case 3 : star += "★";
			case 2 : star += "★";
			case 1 : star += "★"; break;
			default : star = "입력오류"; 
		}
		System.out.println(star);
			

	}
}

// 실행 결과
/*
임의의 정수 입력(1~3) : 3
★★★
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력(1~3) : 2
★★
계속하려면 아무 키나 누르십시오 . . .
*/
/*
임의의 정수 입력(1~3) : 1
★
계속하려면 아무 키나 누르십시오 . . .
*/
