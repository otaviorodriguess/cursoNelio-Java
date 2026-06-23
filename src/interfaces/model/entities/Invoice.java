package interfaces.model.entities;

public class Invoice {

    private  Double basicPayMent ;
    private Double tax ;

    public Invoice(Double basicPayMent, Double tax) {
        this.basicPayMent = basicPayMent;
        this.tax = tax;
    }

    public Double getBasicPayMent() {
        return basicPayMent;
    }

    public void setBasicPayMent(Double basicPayMent) {
        this.basicPayMent = basicPayMent;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public double getTotalPayment(){
        return getBasicPayMent() - getTax();
    }
}
