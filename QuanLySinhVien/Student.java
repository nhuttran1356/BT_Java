public class Student {
    private String name;
    private String grade;
    private String gender;
    private double maths;
    private double phys;
    private double hoa;

    public Student(String name, String grade, String gender, double maths, double phys, double hoa) {
        this.name = name;
        this.grade = grade;
        this.gender = gender;
        this.maths = maths;
        this.phys = phys;
        this.hoa = hoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    public double getPhys() {
        return phys;
    }

    public void setPhys(double phys) {
        this.phys = phys;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double averageScore() {
        return (double)Math.round(((maths + phys + hoa) / 3)*100)/100;

    }

    public String classification() {
        double score = averageScore();
        if (score >= 9)
            return "Xuất Sắc";
        else if (score >= 8 && score < 9)
            return "Giỏi";
        else if (score >= 7 && score < 8)
            return "Khá";
        else if (score >= 6 && score < 7)
            return "TB - Khá";
        else if (score >= 5 && score < 6)
            return "TB";
        else
            return "Yếu";
    }

    public String toString() {
        return "Tên: " + name + "\nLớp: " + grade + "\nGiới tính: " + gender + "\nĐiểm Toán: " + maths + "\nĐiểm Lý: " +
                phys + "\nĐiểm Hóa: " + hoa + "\nĐiểm trung bình: " + averageScore() + "\nXếp loại: " + classification();
    }
}