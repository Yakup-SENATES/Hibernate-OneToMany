import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;




@Entity
public class Student {

	@Id @GeneratedValue(
		    strategy= GenerationType.AUTO
		)
	private int rollno;

	private String name;
	private int marks;
	
	@OneToMany
	private Collection<Pencil> pencil = new ArrayList<Pencil>();
	
	
	public Collection<Pencil> getPencil() {
		return pencil;
	}

	public void setPencil(Collection<Pencil> pencil) {
		this.pencil = pencil;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
