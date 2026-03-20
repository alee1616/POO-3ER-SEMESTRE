package main;

import java.util.Scanner;
// Importamos la herramienta de Java que nos permite leer lo que el usuario teclea en la consola.

public class Ejercc {
// Declaramos la clase principal. Tiene que llamarse igualito que el archivo para que no te dé error de compilación.

    public static void main(String[] args) {
        // Este es el punto de arranque del programa. Sin el main, Java no sabe por dónde empezar a ejecutar.

        Scanner scanner = new Scanner(System.in);
        // Creamos nuestro lector y lo conectamos al teclado (System.in) para recibir los datos de entrada.

        int capacidadMaxima = 100;
        // Puse un límite fijo de 100 espacios por si acaso, para no crear arreglos infinitos y que consuman memoria de más.

        String[] nombres = new String[capacidadMaxima];
        // Creamos nuestro primer arreglo paralelo donde solo vamos a guardar textos (los nombres de los productos).

        int[] cantidades = new int[capacidadMaxima];
        // Esta es la segunda lista para guardar las cantidades, aquí metemos puros números enteros.

        double[] precios = new double[capacidadMaxima];
        // Y la tercera lista para los precios. Usamos double porque el dinero lleva decimales.

        int contadorProductos = 0;
        // Esta variable es clave. Nos dice en qué "casilla" de los arreglos vamos a guardar el siguiente dato y cuántos llevamos en total.

        int opcion;
        // Aquí vamos a guardar la respuesta del usuario cuando le preguntemos si quiere seguir agregando productos.

        System.out.println("Sistema de Control de Inventario");
        // Solo imprimimos el título al arrancar para darle formato.

        do {
            // Iniciamos el ciclo do-while. La gracia de este ciclo es que nos obliga a entrar y pedir datos al menos una vez antes de preguntar si queremos salir.

            System.out.print("\nIngrese el nombre del producto: ");
            // Le pedimos el nombre al usuario. Uso print normal para que escriba a la par del texto y no abajo.

            nombres[contadorProductos] = scanner.nextLine();
            // Leemos el texto que puso y lo guardamos en la casilla actual del arreglo de nombres.

            int cantidad = -1;
            // Empiezo la variable cantidad en negativo a propósito para forzar a que el programa entre al siguiente ciclo de validación.

            while (cantidad < 0) {
                // Nuestro primer filtro. Mientras la cantidad sea menor a 0, de aquí no lo dejamos pasar.

                System.out.print("Ingrese la cantidad (0 o mayor): ");
                // Le advertimos que meta un número válido.

                cantidad = scanner.nextInt();
                // Leemos el número que digitó. Si pone un negativo, el while da otra vuelta y le vuelve a preguntar.
            }
            // Si el número es 0 o positivo, rompemos el while y seguimos.

            cantidades[contadorProductos] = cantidad;
            // Guardamos la cantidad limpia y validada en su respectivo arreglo paralelo.

            double precio = -1.0;
            // Hacemos el mismo truco del negativo para validar el precio.

            while (precio < 0.0) {
                // Segundo filtro. El precio tampoco puede ser negativo, así que lo atrapamos aquí si se equivoca.

                System.out.print("Ingrese el precio unitario (0 o mayor): ");
                // Le pedimos el precio.

                precio = scanner.nextDouble();
                // Leemos el dato con sus decimales.
            }
            // Sale del while porque por fin metió un precio válido.

            precios[contadorProductos] = precio;
            // Guardamos el precio en su lista correspondiente.

            contadorProductos++;
            // Le sumamos 1 al contador general. Así la próxima vez que registremos algo, se guardará en la siguiente casilla vacía.

            System.out.print("Desea ingresar otro producto? (1 = Si, 0 = No): ");
            // Preguntamos si quiere continuar el ciclo principal.

            opcion = scanner.nextInt();
            // Leemos el número que eligió.

            scanner.nextLine();
            // Esto es un parche clásico en Java. Sirve para "limpiar" el enter que se queda pegado en la memoria después de leer un número, para que no nos salte el próximo nombre.

        } while (opcion != 0 && contadorProductos < capacidadMaxima);
        // Aquí se decide todo. El ciclo vuelve a empezar a menos que el usuario haya puesto 0 o que ya nos hayamos quedado sin espacio en los arreglos.

        double valorAcumuladoTotal = 0;
        // Termina el ingreso de datos. Empezamos en cero la variable que va a sumar todo el dinero del inventario.

        System.out.println("\nResumen de Inventario");
        // Imprimimos el encabezado del reporte final.

        for (int i = 0; i < contadorProductos; i++) {
            // Usamos el ciclo for porque sabemos exactamente cuántos productos ingresamos. Empieza en la casilla 0 y da vueltas hasta llegar a nuestro contador.

            double valorProducto = cantidades[i] * precios[i];
            // Multiplicamos la cantidad por el precio de ese producto en específico para sacar su subtotal.

            valorAcumuladoTotal += valorProducto;
            // Le sumamos ese subtotal a nuestro gran total acumulado.

            System.out.println("Producto: " + nombres[i] +
                    " | Cantidad: " + cantidades[i] +
                    " | Precio Unitario: $" + precios[i] +
                    " | Valor Total: $" + valorProducto);
            // Imprimimos toda la información de la fila, jalando los datos de la misma posición (i) en los tres arreglos.
        }
        // El for termina cuando termina de imprimir el último producto.

        System.out.println("Valor Total Acumulado del Inventario: $" + valorAcumuladoTotal);
        // Mostramos el gran total final para que el profe vea que el cálculo global funciona.

        scanner.close();
        // Cerramos el scanner por buena práctica, para liberar memoria.
    }
}