public class Main {
    public static void main(String[] args) {

        // Instancia de los objetos

        // Se usa el constructor 1 porque en este caso solo se conoce el nombre
        Persona persona1 = new Persona("Carlos");

        // Se usa el constructor 3 porque se sabe con todos los datos completos
        Persona persona2 = new Persona("Laura", 45, 1.65, 10203040);

        // Se usa el constructor 1 porque en este escenario solo se conoce nombre y edad
        Jugador jugador1 = new Jugador("Andres", 22);

        // Se usa el constructor 2 porque ya se tienen los que se heredan pero no los especificos
        Jugador jugador2 = new Jugador("Miguel", 27, 1.78, 11223344);

        // Se usa el constructor 3 porque se conoce toda la información del jugador
        Jugador jugador3 = new Jugador("Santiago", 24, 1.80, 1234567,10, "Delantero", 8500000, true);

        // Se usa el constructor 2 porque solo se conoce nombre y edad
        DirectorTecnico dt2 = new DirectorTecnico("Fernando Castro", 50);

        // Se usa el constructor 3 porque se sabe toda la información del DT
        DirectorTecnico dt3 = new DirectorTecnico("Ricardo", 55, 1.75, 1029384756L,"Tactica de posesion", 15, 20000000, true);

        // Se usa el constructor 3 porque se tiene toda la información del árbitro
        Arbitro arbitro2 = new Arbitro("Camila", 38, 1.70, 998877665L,"FIFA", 120, 9.2, true);

        // impresiones

        System.out.println(persona1.toString());
        System.out.println(persona2.toString());

        System.out.println(jugador1.toString());
        System.out.println(jugador2.toString());
        System.out.println(jugador3.toString());

        System.out.println(dt2.toString());
        System.out.println(dt3.toString());

        System.out.println(arbitro2.toString());
    }
}