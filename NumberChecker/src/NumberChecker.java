
public class NumberChecker {

	private int num;
	
	public int classifyNumType(int num) {
		//입력 가능한 문자들인가?
		//trim
		//String을 한 글자씩 받아서 아스키 값에 따라 검증(숫자와 하이픈, 띄어쓰기만 허용)
		
		//맞으면 
		//주민번호 폼인가?
			//하이픈이 있나?
				//있다면 하나보다 많은가?
				//하나라면 하이픈 앞 6자리, 뒤 7자리인가?
			//하이픈 제외 가공
			//총 13자리인가?
			//뒤 첫자리는 1~4인가?
			//모두 통과하면 return 1, 못하면 -1
		//카드번호 폼인가?
			//하이픈이 있나?
				//있다면 4개인가?
				//4개라면 숫자가 4/4/4/4 자리인가?
			//하이픈 제외 가공
			//총 16자리인가?
			//모두 통과하면 return 2, 못하면 -1
	
		//아니면 
		//개인정보 아니라고 출력	
		
		
	}
	
//	void showIdNumValid
//	
//	void showCardNumValid
//	
//	void Checker(String num)
//	
//	setters and getters
}
