package java8Feature.collection.groupby;

public class Student {

    private String teacher;
    private double level;
    private String className;

    public Student(String teacher, double level, String className) {
        super();
        this.teacher = teacher;
        this.level = level;
        this.className = className;
    }

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public double getLevel() {
		return level;
	}

	public void setLevel(double level) {
		this.level = level;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		/*return "StudentClass [teacher=" + teacher + ", level=" + level
				+ ", className=" + className + "]" + "/";*/
		
		
		 return "StudentClass{" +
         "teacher=" + this.teacher +
         ", level='" + this.level + '\'' +
            ", className='" + this.className + '\''  + '}';
	}
    
    
}
