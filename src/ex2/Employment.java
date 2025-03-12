package ex2;

public class Employment {
    //Xác định các thuộc tính cơ bản: id, name, department, salary.
    private String id;
    private String name;
    private String department;
    private float salary;

    // Viết constructor có tham số để khởi tạo thông tin nhân viên.
    public Employment(String id, String name, String department, float salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    //Viết phương thức hiển thị thông tin nhân viên bao gồm: mã, tên và phòng ban.

    public void displayInfo(){
        System.out.printf("ID: %s\tName: %s\t", this.id, this.name);
        System.out.printf("Department: %s\tSalary: %f", this.department, this.salary);
    }

    //Viết getter và setter cho thuộc tính salary để thay đổi lương nếu cần.
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    //Viết phương thức để tăng lương nhân viên dựa trên phần trăm(percentage) nhập vào.
    public float updateSalary(float percentage){
        float newSalary = salary + (salary * (percentage/100));
        return salary = newSalary;
    }
}
