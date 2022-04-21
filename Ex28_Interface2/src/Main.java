import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//팀장이 Unit 인터페이스를 설계하고 추상메소드 이름을 정하면 
		//팀원들은 그 이름을 토대로 기능을 구현하여 각 유닛(Marine, Medic, Tank)의 클래스를 설계함
		//팀장은 만들어진 클래스들을 이용하여 객체 생성 및 게임 알고리즘 구현
	
		Unit u1 = new Marine();
		u1.attack();
		
		//여러 유닛들을 한번에 제어하고자 함. 
		//콘트롤하는 유닛의 숫자는 바뀌는데 배열은 길이가 이미 고정되어 있음
		//ArrayList 클래스를 사용해보자
		//실제 게임이나 앱에서는 배열보다는 ArrayList를 더 많이 쓴다고..
		
		//ArrayList도 배열처럼 타입을 정해줘야 하는데 Marine이라고 쓰면 Marine 타입밖에 못 넣는다.
		//다양한 유닛들을 넣기 위해서는 부모 타입을 지정해주면 된다.
		ArrayList units0 = new ArrayList(); //타입 지정을 안해도 쓸수는 있지만 써주는 게 권장됨
		ArrayList<Unit> units = new ArrayList<Unit>();
		
		//ArrayList의 길이를 알려주는 메소드, size()
		System.out.println(units.size());
		
		units.add(u1);
		System.out.println(units.size());
		
		units.add(new Marine()); //굳이 Unit 참조변수에 넣어서 사용할 필요가 없다. ArrayList로 제어할 거니까.
		units.add(new Tank());
		units.add(new Medic());
		System.out.println(units.size());
		
		System.out.println(units.get(0)); //Marine@1c4af82 ArrayList 각 요소는 참조변수임
		Unit uni = units.get(0);
		uni.attack();
		
		for(Unit t : units) {
			t.attack();
			t.move();
		}

		//일부 유닛에게만 체력 회복 Heal 기능을 만들어주고 싶으면?
		//Heal 인터페이스를 따로 만들어 Marine과 Medic에게 적용
		for(Unit t: units) {
			if(t instanceof Marine) ((Marine) t).heal();
			else if(t instanceof Medic) ((Medic) t).heal();
		}
		
		//Heal 인터페이스의 기능을 사용할 때는 Heal로 형변환해서 사용하면 자식 객체마다 적용해줄 필요가 없으므로 더 간단
		for(Unit t: units) {
			if(t instanceof Heal) ((Heal) t).heal();
		}		
		
		
	}
}
