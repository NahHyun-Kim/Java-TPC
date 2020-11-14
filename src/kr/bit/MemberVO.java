package kr.bit;

public class MemberVO {
	//클래스 설계시 기본적으로 정보은닉을 위해 private을 사용한다.
	//#####private : 변수명. 접근이 허용되지 않음
	//private 으로 설정된 기억공간에 접근하기 위한 method : setter(데이터 저장)
	//데이터를 가져오기 위한 method : getter(데이터 가져옴) -> 데이터 간접 접근

	/*
	 * ##setter는 외부에서 데이터를 받아오기 때문에 String name을 적음. ##member가 가진 this.name에 name의
	 * 정보를 저장 public void setName(String name) { 
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

	//디폴트 생성자 : 기존 생성자가 있을 경우는 디폴트 생성자도 정의하여야 함.
	public MemberVO() {}
	
	//setter, getter method
	//###### source -> getter and setter로 설정 가능
	
	//##setter method는 DI. dependency Injection 종속 객체 주입
	
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

	
	
	//##tostring 이라는 메서드로 모든 것을 문자화하여 전달. 
	//쉬운 디버깅 위함


	//source --> generate toString을 통해 문자열로 변환 후 하나의 형태로 리턴
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", tel=" + tel + ", addr=" + addr + "]";
	}
}
