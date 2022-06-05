package hackerRack;

public class Students {
	 private int id;
	   private String fname;
	   private double cgpa;
	   public Students(int id, String fname, double cgpa) {
	      super();
	      this.id = id;
	      this.fname = fname;
	      this.cgpa = cgpa;
	   }
	   public int getId() {
	      return id;
	   }
	   public String getFname() {
	      return fname;
	   }
	   @Override
	public String toString() {
		return "Students [id=" + id + ", fname=" + fname + ", cgpa=" + cgpa + "]";
	}
	public double getCgpa() {
	      return cgpa;
	   }
}
