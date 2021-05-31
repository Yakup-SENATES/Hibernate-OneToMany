
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Pencil {

	@Id
	@GeneratedValue(
		    strategy= GenerationType.AUTO
		)
	private int pencilID;

	private String pencilName;
	
	@ManyToOne
	private Student student = new Student();
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getPencilID() {
		return pencilID;
	}

	public void setPencilID(int pencilID) {
		this.pencilID = pencilID;
	}

	public String getPencilName() {
		return pencilName;
	}

	public void setPencilName(String pencilName) {
		this.pencilName = pencilName;
	}

}
