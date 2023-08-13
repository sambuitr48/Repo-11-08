package direction;

public class Direction {
    public int numeroCalle;
    public String ciudad;
    public String departamento;
    public String pais;

    public Direction(int numeroCalle, String ciudad, String departamento, String pais) {
        this.numeroCalle = numeroCalle;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }
}
   class StudentClass{
    public int rollNum;
    public String nombreEstudi;
    Direction direstudi;

       public StudentClass(int rollNum, String nombreEstudi, Direction direstudi) {
           this.rollNum = rollNum;
           this.nombreEstudi = nombreEstudi;
           this.direstudi = direstudi;
       }
   }
