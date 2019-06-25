import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap {

	public static void main(String[] args) {

		Map<String, Employee> mp=new HashMap<String, Employee>();
		
		Employee  m1=new Employee();
		m1.setEmpID(1);
		m1.setEmpName("Priya");
		
		Employee  m2=new Employee();
		m2.setEmpID(1);
		m2.setEmpName("Priya");
		
		mp.put("1", m1 );
		mp.put("2", m2);
		
		Set<Entry<String, Employee>> entrySet = mp.entrySet();
		for (Entry<String, Employee> entry : entrySet) {
			System.out.println(entry.getValue().getEmpID());
		}
		
		
		

	}

}
