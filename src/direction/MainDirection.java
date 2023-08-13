package direction;

public class MainDirection {
    public static void main(String[] args) {
        Direction ad = new Direction(55,"Armenia", "Quindio", "Colombia");
        StudentClass obj = new StudentClass(123, "Maria", ad);
        System.out.println(obj.rollNum);
        System.out.println(obj.nombreEstudi);
        System.out.println(obj.direstudi.numeroCalle);
        System.out.println(obj.direstudi.ciudad);
        System.out.println(obj.direstudi.departamento);
        System.out.println(obj.direstudi.pais);
    }
}
