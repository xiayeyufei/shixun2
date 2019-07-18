package Again;

import java.util.HashMap;
import java.util.Map;

public class Company {
public static Map<Integer ,Employee> employees=new HashMap<>();
public static Map<Integer, DakaInfo> dakaifos=new HashMap<>();
void addemployee(Employee e) {
	employees.put(e.getID(), e);
}
void deleteemployee(Employee e) {
	employees.remove(e.getID());
}
Employee searchemployee(int ID) {
	return employees.get(ID);
}

}
