package application;


import java.util.Scanner;

public class Main {

    static Main app = new Main();
    static Scanner scanner  = new Scanner(System.in);

    public void inicializarVectores(double[] totalProducto, double[] totalTurno){
        for(int i = 0; i < totalProducto.length; i++){
            totalProducto[i] = 0;
        }
        for(int i = 0; i < totalTurno.length; i++){
            totalTurno[i] = 0;
        }
    }

    public void registrarVentas(double[][] ventas, String[] productos, String[] turnos){
        for(int i = 0; i < productos.length; i++){
            for(int j = 0; j < turnos.length; j++){
                System.out.println("Ingrese el valor de la venta: " + productos[i] + " en el turno de: " + turnos[j] + ": ");
                ventas[i][j] = app.validarDato();
            }
        }
    }

    public double validarDato(){
        double dato = 0;
        while(true){
            if(!scanner.hasNextDouble()){
                System.out.println("Error: Ingrese un numero valido");
                scanner.next();
                continue;
            }
            dato = scanner.nextDouble();

            if(Double.isNaN(dato) || Double.isInfinite(dato) || dato < 0){
                System.out.println("Error: ingrese un numero finito mayor o igual a cero");
                continue;
            }
            return dato;
        }
    }

    public void calcularTotalProducto(double[][] ventas, double[] totalProducto) {
        for (int i = 0; i < ventas.length; i++) {
            totalProducto[i] = 0;
            for (int j = 0; j < ventas[i].length; j++) {
                totalProducto[i] += ventas[i][j];
            }
        }
    }

    public void calcularTotalTurno(double[][] ventas, double[] totalTurno) {
        for (int j = 0; j < totalTurno.length; j++) {
            totalTurno[j] = 0;
            for (int i = 0; i < ventas.length; i++) {
                totalTurno[j] += ventas[i][j];
            }
        }
    }

    public double calcularTotalGeneral(double[][] ventas) {
        double total = 0;
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                total += ventas[i][j];
            }
        }
        return total;
    }

    public void buscarMayorMenorProducto(double[] totalProducto, String[] productos) {
        int indiceMayor = 0;
        int indiceMenor = 0;
        for (int i = 1; i < totalProducto.length; i++) {
            if (totalProducto[i] > totalProducto[indiceMayor]) {
                indiceMayor = i;
            }
            if (totalProducto[i] < totalProducto[indiceMenor]) {
                indiceMenor = i;
            }
        }

        System.out.println("Producto con mayor recaudacion: " + productos[indiceMayor]
                + " - $" + totalProducto[indiceMayor]);
        System.out.println("Producto con menor recaudacion: " + productos[indiceMenor]
                + " - $" + totalProducto[indiceMenor]);
    }

    public static void main(String[] args){
        String[] productos = {"Hamburguesas", "Perros Calientes", "Papas Fritas"};
        String[] turnos = {"Almuerzo", "Tarde", "Noche", "Madrugada"};
        double[][] ventas = new double[3][4];


        double[] totalProducto = new double[3];
        double[] totalTurno = new double[4];

        app.inicializarVectores(totalProducto, totalTurno);
        app.registrarVentas(ventas, productos, turnos);
        scanner.close();
    }
}
