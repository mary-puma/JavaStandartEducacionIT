import com.educacionit.model.Docente;
import com.educacionit.model.Persona;

public class App {

    public static void main(String[] args) {

        Persona p1 = new Persona("mary", "lopez", 123456798, "mary@aa.com", "azul");
        Persona p2 = new Persona();
        p2.setNombre("belen");
        p2.setApellido("ramirez");

        System.out.println(p1.toString());
        p1.iniciar();
        System.out.println(p2.getApellido());

        //instanciamos a docente

        //docente hereda los atributos y metodos de persona menos el constructor
        Docente d1 = new Docente();
        d1.setNombre("ana");
        d1.setApellido("flores");
        d1.iniciar();
        System.out.println(d1.getApellido());
        System.out.println(d1.toString());
        Docente d2 = new Docente("mauro", "perez", 789522, "perez@tets.com", "buenos aires", 1, "ingenieria");
        System.out.println(d2.toString());

        d2.iniciar();
    }
}
