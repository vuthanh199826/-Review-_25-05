public class Student {
    private String msv;
    private String name;
    private String classmate;
    private double diemToan;
    private double diemVan;
    private double diemTiengAnh;
    private double diemTrungBinh;

    public Student(String msv, String name, String classmate, double diemToan, double diemVan, double diemTiengAnh) {
        this.msv = msv;
        this.name = name;
        this.classmate = classmate;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
        this.diemTiengAnh = diemTiengAnh;
        this.diemTrungBinh = (this.diemToan + this.diemVan + this.diemTiengAnh) / 3;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassmate() {
        return classmate;
    }

    public void setClassmate(String classmate) {
        this.classmate = classmate;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getDiemTiengAnh() {
        return diemTiengAnh;
    }

    public void setDiemTiengAnh(double diemTiengAnh) {
        this.diemTiengAnh = diemTiengAnh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    @Override
    public String toString() {
        return "Student{" +
                " msv = " + getMsv() +
                ", name='" + name + '\'' +
                ", classmate='" + classmate + '\'' +
                ", diemToan=" + diemToan +
                ", diemVan=" + diemVan +
                ", diemTiengAnh=" + diemTiengAnh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }
}
