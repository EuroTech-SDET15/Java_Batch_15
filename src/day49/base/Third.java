package day49.base;

public class Third {
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard();
        dashBoard.navigate("My Profile");
      //  Base base = new Base();Base' is abstract; cannot be instantiated
        Base.print();
        DashBoard.print();
    }
}
