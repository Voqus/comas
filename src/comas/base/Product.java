package comas.base;

/**
 * Class for product.
 */
public class Product {

    private String   productName;
    private String   productDescription;
    private String   measurementUnit;
    private float    weight;
    private float    purchasePrice;
    private float    sellingPrice;
    private int      stock;
    
    public Product(String productName, String productDescription, String measurementUnit, float weight, float purchasePrice, float sellingPrice, int stock)
    {
        this.productName            = productName;
        this.productDescription     = productDescription;
        this.measurementUnit        = measurementUnit;
        this.weight                 = weight;
        this.purchasePrice          = purchasePrice;
        this.sellingPrice           = sellingPrice;
        this.stock                  = stock;
    }
    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getMeasurementUnit() {
        return measurementUnit;
    }

    public void setMeasurementUnit(String measurementUnit) {
        this.measurementUnit = measurementUnit;
    }
    
    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public float getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(float sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
