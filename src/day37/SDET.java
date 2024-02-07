package day37;

public class SDET {

//    name, age, gender(M/F), company, salary, isSuccessful=True
    String name;
    int age;
    char gender;
    String company;
    double salary;
    boolean isSuccessful;

    public SDET(String name, int age, char gender, String company,
                double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        this.salary = salary;
        this.isSuccessful = true;
    }

    public void increaseSalary(double newSalary){
        this.salary= newSalary;
    }

    public void changeCompany(String newCompany){
        this.company=newCompany;
    }

    @Override
    public String toString() {
        return "SDET{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", isSuccessful=" + isSuccessful +
                '}';
    }

//    public void printAllDataField(){
//        System.out.println("Object data fields;\n" +
//                "name: "+name+
//                "age: "+ age+ ....
//                );
//    }

}

