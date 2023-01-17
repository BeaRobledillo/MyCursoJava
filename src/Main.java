public class Main {
    public static void main(String[] args) {
        System.out.println("Productos:");

        Producto[] products = new Producto[5];

        Producto producto1 = new Producto("botella", 1, 8.0, "botella de plástico");
        Producto producto2 = new Producto("vaso",2,2.50,"vaso de cartón");
        Producto producto3 = new Producto("tenedor",3,5.50,"tenedor de plata");
        Producto producto4 = new Producto("cuchillo",4,6.0,"cuchillo de plata");
        Producto producto5 = new Producto("cuchara",5, 5.50,"cuchara de plata");

        Producto[] arrayDeProductos = new Producto[]{producto1,producto2,producto3,producto4,producto5};

        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(producto4);
        System.out.println(producto5);

    }
}