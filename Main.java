package HomeworkInterfaces;

public class Main implements Interface2, Interface3 {
    public void display()
    {
        System.out.println("Display from Interface 2");
    }
    public void print()
    {
        System.out.println("Print from Interface 3");
    }
    public static void main(String args[])
    {
        Main d = new Main();

        d.show();
        d.display();
        d.print();
    }
}
