public class Kangaroo {
    private String name;
    private int age;

    public Kangaroo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Kangaroo(int x) {
        System.out.println(4);
    }

    public void diaplay(String country) {
        System.out.println(name + ", " + country);
        age++;
        System.out.println(age);
    }
}