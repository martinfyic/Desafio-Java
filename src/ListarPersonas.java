import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListarPersonas {
  public static void main(String[] args) {

    List<Persona> personas = new ArrayList<>();

    personas.add(new Persona("Carlos", "Azaustre"));
    personas.add(new Persona("Marcelo", "Mendez"));
    personas.add(new Persona("Sofia", "Vergara"));
    personas.add(new Persona("Bruna", "Sosa"));
    personas.add(new Persona("Andres", "Padilla"));

    System.out.println("***** Lista de personas agregadas: *****");
    for (Persona persona : personas) {
      System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
    }

    System.out.println();

    System.out.println("***** Ordenado por nombre: *****");
    Collections.sort(personas, Comparator.comparing(Persona::getNombre));
    for (Persona persona : personas) {
      System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
    }

    System.out.println();

    System.out.println("***** Ordenado por apellido: *****");
    Collections.sort(personas, Comparator.comparing(Persona::getApellido));
    for (Persona persona : personas) {
      System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
    }

    System.out.println();

    System.out.println("***** Ordenado inversamente por apellido: *****");
    Collections.sort(personas, Comparator.comparing(Persona::getApellido, Collections.reverseOrder()));
    for (Persona persona : personas) {
      System.out.println("Nombre: " + persona.getNombre() + ", Apellido: " + persona.getApellido());
    }
  }
}