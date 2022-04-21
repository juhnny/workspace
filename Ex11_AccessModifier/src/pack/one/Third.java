package pack.one;

protected class Third {

	//접근 제한자를 부여한 필드
	private int a;
	int b;
	protected int c;
	public int d;
	
	//접근제한자를 부여한 메소드
	//private
	private void showPrivate() {
		//같은 클래스 안에서는 접근제한자가 무의미
		System.out.println("showPrivate");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//default
	void showDefault() {
		//같은 클래스 안에서는 접근제한자가 무의미
		System.out.println("showDefault");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//private
	protected void showProtected() {
		//같은 클래스 안에서는 접근제한자가 무의미
		System.out.println("showProtected");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//private
	public void showPublic() {
		//같은 클래스 안에서는 접근제한자가 무의미
		System.out.println("showPublic");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
