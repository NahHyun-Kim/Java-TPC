package kr.bit;

public class MemberVO {
	//Ŭ���� ����� �⺻������ ���������� ���� private�� ����Ѵ�.
	//#####private : ������. ������ ������ ����
	//private ���� ������ �������� �����ϱ� ���� method : setter(������ ����)
	//�����͸� �������� ���� method : getter(������ ������) -> ������ ���� ����

	/*
	 * ##setter�� �ܺο��� �����͸� �޾ƿ��� ������ String name�� ����. ##member�� ���� this.name�� name��
	 * ������ ���� public void setName(String name) { 
	 * this.name = name; }
	 */
	/*
	 * public String getName() { 
	 * return name;
	 */	
	
	private String name;
	private int age;
	private String tel;
	private String addr;
	
	//source --> field 
	public MemberVO(String name, int age, String tel, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.tel = tel;
		this.addr = addr;
	}

	//����Ʈ ������ : ���� �����ڰ� ���� ���� ����Ʈ �����ڵ� �����Ͽ��� ��.
	public MemberVO() {}
	
	//setter, getter method
	//###### source -> getter and setter�� ���� ����
	
	//##setter method�� DI. dependency Injection ���� ��ü ����
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}

	
	
	//##tostring �̶�� �޼���� ��� ���� ����ȭ�Ͽ� ����. 
	//���� ����� ����


	//source --> generate toString�� ���� ���ڿ��� ��ȯ �� �ϳ��� ���·� ����
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
}
