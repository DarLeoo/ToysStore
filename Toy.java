public class Toy {
    private int id;
    private String nameToy;
    private int quantity;
    private double frequency;


    public Toy(int id, String nameToy, int quantity, double frequency) {
        this.id = id;
        this.nameToy = nameToy;
        this.quantity = quantity;
        this.frequency = frequency;
    }


    public int getId() {
        return id;
    }


    public String getNameToy() {
        return nameToy;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getFrequency() {
        return frequency;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "Toy (" +
                "id=" + id +
                ", Название: " + nameToy + '\'' +
                ", количество: " + quantity +
                ", частота выпадения: " + frequency +
                ')';
    }
}

