public class Producto {
    private String title;
    private Integer num;
    private Double cost;
    private String description;

    private Manufacturer manufacturer;
    public Producto() {
    }

    public Producto(String title, Integer num, Double cost, String description) {
        this.title = title;
        this.num = num;
        this.cost = cost;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Producto: " +
                " Title => '" + title + '\'' +
                ", Num => " + num +
                ", Cost => " + cost +
                ", Description => " + description +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
