package hackerRack;

public class Student  implements Comparable<Student>{
	   private int id;
	   private String fname;
	   private double cgpa;
	   public Student(int id, String fname, double cgpa) {
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
	   public double getCgpa() {
	      return cgpa;
	   }
	@Override
	public int compareTo(Student o) {
		if(this.cgpa!=o.cgpa)
        {
            if(this.cgpa>o.cgpa)
                return -1;
            else 
                return 1;
        }
		else if(this.fname.equals(o.fname))
        {
            return
                Integer.compare(this.id, o.id);
        }
        else
        {
            if(this.fname.compareTo(o.fname)<0)
                return -1;
            else 
                return 1;
                
        }
	}
	   
	   
	   
}
	   
	   

