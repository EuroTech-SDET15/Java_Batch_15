package day41;

public class Staff {

    String name;
    int staffId;
    boolean isActive;
    double salary;

    public Staff(String name, int staffId, double salary) {
        this.name = name;
        this.staffId = staffId;
        this.isActive = true;
        this.salary = salary;
    }

//    public void printAttributes(){
//        System.out.println("name = " + name);
//        System.out.println("staffId = " + staffId);
//    }

    @Override
    public String toString() {
        return "THIS IS MY Staff{" +
                "name='" + name + '\'' +
                ", staffId=" + staffId +
                ", isActive=" + isActive +
                ", salary=" + salary +
                '}';
    }
}
