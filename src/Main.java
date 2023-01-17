//Crear una clase Main
public class Main {
    public static void main(String[] args) {
        System.out.println("Productos:");

        //Producto[] products = new Producto[5];

        //Crear 5 productos
        Producto producto1 = new Producto("botella", 1, 8.0, "botella de plástico");
        Producto producto2 = new Producto("vaso",2,2.50,"vaso de cartón");
        Producto producto3 = new Producto("tenedor",3,5.50,"tenedor de plata");
        Producto producto4 = new Producto("cuchillo",4,6.0,"cuchillo de plata");
        Producto producto5 = new Producto("cuchara",5, 5.50,"cuchara de plata");

        //Crear un array de productos
        Producto[] arrayDeProductos = new Producto[]{producto1,producto2,producto3,producto4,producto5};

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);

        //Estadísticas
        //Calcular la suma precio total de los productos del array
        Double totalCost = 0d;
        for (Producto product : arrayDeProductos) {
            totalCost += product.getCost();
        }
        System.out.println("Estadísticas:");
        System.out.println("Suma del precio total de los productos:"+totalCost);

        //Calcular la media de precio de los productos del array
        double averageCost = totalCost / arrayDeProductos.length;
        System.out.println("La media de precio de los productos: " + averageCost);

        //Calcular el precio máximo
        Double maxCost = arrayDeProductos[0].getCost();
        for (Producto arrayDeProducto : arrayDeProductos) {
            if (arrayDeProducto.getCost() > maxCost) {
                maxCost = arrayDeProducto.getCost();
            }
        }
        System.out.println("El precio máximo: " + maxCost);
    }

}