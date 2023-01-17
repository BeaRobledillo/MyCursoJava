//Crear una clase: Product
public class Producto {
    //atributos encapsulados (private)
    private String title;
    private int reference;
    private Double cost;
    private String description;

    //private Manufacturer manufacturer;
    //constructores
    //vacio
    public Producto() {
    }

    //con todos los parámetros
    public Producto(String title, int reference, Double cost, String description) {
        this.title = title;
        this.reference = reference;
        this.cost = cost;
        this.description = description;
        //this.manufacturer = manufacturer;
    }
    //métodos getter setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReference() {
        return reference;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /*public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }*/
    //método toString
    @Override
    public String toString() {
        return "Producto: " +
                " Title => '" + title + '\'' +
                ", Num => " + reference +
                ", Cost => " + cost +
                ", Description => " + description +
                //", manufacturer=" + manufacturer +
                '}';
    }
}
