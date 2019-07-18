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
		return "名字     ="+getName()+"ID     ="+getID();
		
	}
	public Employee(String name,int ID) {
		// TODO 自动生成的构造函数存根
		this.name = name;
		this.ID = ID;
	}
}