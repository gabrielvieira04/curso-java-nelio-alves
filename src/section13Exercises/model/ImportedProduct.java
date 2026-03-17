package section13Exercises.model;

public class ImportedProduct extends Product {
    private double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ImportedProduct() {}

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }

    @Override
    public String priceTag (){
        return String.format("%s $ %.2f (Customs Fee: $ %.2f)", getName(), totalPrice(), getCustomsFee());
    }
    
}
