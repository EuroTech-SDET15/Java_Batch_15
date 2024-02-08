package day38;

public class Task {

    String name;
    public Task(String name){
        this.name = name;
    }

    public boolean weirdMethod(Task obj){
//        if(obj.name != null){
//            return true;
//        }
//        return  false;

        return (obj.name != null);
    }

    public static void main(String[] args) {
        Task task1= new Task("laptop");
        Task task2= new Task("tv");

        System.out.println(task2.weirdMethod(task1));
    }
}
