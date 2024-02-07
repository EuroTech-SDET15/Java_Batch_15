package day37;

public class SampleD {

    public static void main(String[] args) {
        C c = new C(5);
        System.out.println(c.value);
    }
}
class C{
    int value=2;

    C(int value){
        this.value=value;
    }
}
