package kr.poly;

public interface RemoCon { //��ü����x; remocon r = new remocon(x) 
	
	//15�� ������ : public static int final ����
	//����� ����� �� �ִ�. �������� �ּ�/�ִ� ä�� ����
	//final : ������ �ƴ� ����̱� ������ ������ �� ����.
	public final static int MAXCH=100;
	int MINCH=1; //RemoCon.MINCH�� ���� ���� ����(static ����߱� ������)
	
	public final static int MAXLIGHT=10;
	int MINLIGHT=1; //���� ��⸦ �����ϴ� �޼���(final-��� ���� x)
	
	//�߻�޼���
	public abstract void chUp(); //abstract�� ���� ����
	public void chDown();
	public void internet();
	
	//�ڽ� Ŭ������ implements(����)�� ���־�߸� ����� �����ϴ�. �θ�-> �ڽĿ��� �޼���
	//�߻� �޼��� ����(body {}�� ����� error. ���� �޼ҵ带 ���� �� ����.)
}
