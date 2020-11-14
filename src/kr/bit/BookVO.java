package kr.bit;

//å(Object.��ü) --> ����, ����, ���ǻ�, ������ �� ...
public class BookVO {

	public String title;
	public int price;
	public String company;
	public int page;
	
	//������ ������ �޼���(����)
	//������ �޼��带 Ȱ���Ͽ� ��ü�� �����ϰ� �ʱ�ȭ �ϴ� �ߺ� ����
	//Overloading
	//BookVO b = new BookVO();
	//BookVO b = new BookVO("�ڹ�",20000,"���",790); 
	//�� �������� overloading�ε�, ���� BookVO�� BookVO�� �ٸ� �Լ��� ����.
	/*public BookVO(//String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page; }
//this.�� ����Ű�� �������   //�Ű�����
		//�ʱ�ȭ
*/	
	
	public BookVO() {
		//�ʱ�ȭ �۾�(�ʱ�ȭ �ϴ� "����")
		//this�� ���� �ڱ��ڽſ��ִ� ��������� ���� �Ҽ��ִ�.
		this.title = "�ڹ�";
		this.price = 14000;
		this.company = "������";
		this.page = 780;
	}
	
	//������ �޼��带 �ߺ��ؼ� ������� ���,
	//default �����ڴ� ��������� �ʴ´�. ���� TPC12�� b1,b2�� ����Ʈ �����ڸ� ����� �����ϸ� ������ ��.
	
	//####this. ������  source - field �������� ����
	public BookVO(String title, int price, String company, int page) {
		//this�� ���� �ڱ� �ڽ��� ����Ű�� ��. �� ���� title,,,�̷� ���� �־���.
		//������ �޼����� �ߺ�����(overloading)
		//�Ű����� ������ �ٸ��ų�, ������ ������ data type�� �޶�� �Ѵ�.
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
}
