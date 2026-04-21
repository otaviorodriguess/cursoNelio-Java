package exercipolimorfismo.entities;

public class ImportedProduct extends Product {
    private Double custmosFree;

    public ImportedProduct(String name, Double price, Double custmosFree) {
        super(name, price);
        this.custmosFree = custmosFree;
    }

    public Double getCustmosFree() {
        return custmosFree;
    }

    public void setCustmosFree(Double custmosFree) {
        this.custmosFree = custmosFree;
    }

    @Override
    public String priceTag() {
        Object[] customsFee = new Object[0];
        return getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    private Object[] totalPrice() {
        return null;
    }
}
