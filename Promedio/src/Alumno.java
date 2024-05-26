public class Alumno {

    private String nombre;
    private int[] calif;

    public Alumno(String nombre, int[] calif) {
        this.nombre = nombre;
        this.calif = calif;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calif) {
            suma += calificacion;
        }
        return (double) suma / calif.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calif.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calif[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        int[] calif = {85, 92, 78, 88, 90};  // Ejemplo de calif
        Alumno alumno = new Alumno("Alumno 1", calif);
        alumno.imprimirResultados();
    }

}
