package Starcraft;

public class Starcraftmain {
	public static void main(String[] args) {
		Terran marine = new Terran();
		marine.attack();
		Protoss dragoon = new Protoss();
	    dragoon.attack();
		Zerg hydralisk = new Zerg();
	    hydralisk.attack();
		System.out.println("====��ü ����ȯ�� �������̵��� �̿�====");
		Starcraft obj = new Terran();    
// ���� Ŭ������ ������ ������ ���� Ŭ������ ��ü�� ����
		obj.attack();                  // shot() �޼ҵ� ȣ��
	    obj = new Protoss();
		obj.attack();                  // shot() �޼ҵ� ȣ�� 
		obj = new Zerg();
		obj.attack();                  // shot() �޼ҵ� ȣ��
		/* error
		�߻� Ŭ������ �ڽ��� �����ڸ� �̿��ؼ� ��ü�� ������ �� ����
		obj = new Starcraft();
		obj.shot();
		*/
	}
}
