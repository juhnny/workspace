package pack.one;

protected class Third {

	//���� �����ڸ� �ο��� �ʵ�
	private int a;
	int b;
	protected int c;
	public int d;
	
	//���������ڸ� �ο��� �޼ҵ�
	//private
	private void showPrivate() {
		//���� Ŭ���� �ȿ����� ���������ڰ� ���ǹ�
		System.out.println("showPrivate");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//default
	void showDefault() {
		//���� Ŭ���� �ȿ����� ���������ڰ� ���ǹ�
		System.out.println("showDefault");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//private
	protected void showProtected() {
		//���� Ŭ���� �ȿ����� ���������ڰ� ���ǹ�
		System.out.println("showProtected");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	
	//private
	public void showPublic() {
		//���� Ŭ���� �ȿ����� ���������ڰ� ���ǹ�
		System.out.println("showPublic");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
