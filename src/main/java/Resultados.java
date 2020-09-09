import java.util.ArrayList;

public class Resultados {
    public void actualizarListaDesaparecidos(ArrayList<PersonasAfectadas> personas){
        personas.add(new PersonasAfectadas("nombre", "apellido", 21));

    }



    public void listaDesaparecidos(ArrayList<PersonasAfectadas> personas){
        //Variables dinámicas
        String nombre = "";
        String apellido = "";
        int edad = 0;

        for (int i=0; i < personas.size(); i++){
            personas.get(i);
            System.out.println("Nombre del afectado: " + nombre + " " + apellido);
            System.out.println("Edad del afectado: " + edad);
        }
    }

    public void detalleDesastre(int cantidadDesastres, int cantidadAfectados, int billonesUSperdidos,
                                String pais, String ciudad, int fechaAño, int fechaMes, int fechaDia,
                                int fechaHora, int latitud, int longitud, double gradosRichter) {

        System.out.println("Detalles del desastre natural: ");
        System.out.println("Cantidad de desastres: " + cantidadDesastres);
        System.out.println("Cantidad de afectados: " + cantidadAfectados);
        System.out.println("Cantidad de billones de US perdidos: " + billonesUSperdidos);
        System.out.println("País que ocurrió el desastre:" + pais);
        System.out.println("Ciudad que ocurrió el desastre: " + ciudad);
        System.out.println("Fecha en que ocurrió el desastre: " + fechaAño + "/" + fechaMes + "/" +
                fechaDia + " a las " + fechaHora);
        System.out.println("Latitud y longitud del desastre: " + latitud + " " + longitud);
        System.out.println("Grados Richter (en caso de ser terremoto): " + gradosRichter);

    }
}
