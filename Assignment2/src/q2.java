
class employee{
	
	String name;
	int salary;
	
	public employee() {
	}
	
	public employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}
	
}

public class q2 {
	
public static void main(String[] args) {
	employee[] e = new employee[3];
	e[0] = new employee("Anirudh",100000);
	e[1] = new employee("Hitesh",90000);
	e[2] = new employee("Samir",95000);
	
	employee temp;
	
	for(int j= 0 ; j< 3; j++) {
		for(int i = 0; i < 2; i++) {
			if(e[i].getSalary() > e[i+1].getSalary()) {
				temp = e[i];
				e[i] = e[i+1];
				e[i+1] = temp;
			}
		}
	}
for(int k= 0; k<3; k++) {
	System.out.println("{" + e[k].name + "," + e[k].salary + "}");
}
}

}
