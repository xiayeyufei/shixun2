package Again;

import java.io.Serializable;

public class Employee implements Serializable {
	private int ID;
	private String name;
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "����     ="+getName()+"ID     ="+getID();
		
	}
	public Employee(String name,int ID) {
		// TODO �Զ����ɵĹ��캯�����
		this.name = name;
		this.ID = ID;
	}
}