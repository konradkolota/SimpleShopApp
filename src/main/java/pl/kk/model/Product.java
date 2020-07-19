package pl.kk.model;

public class Product {

    private String productName;
    private String manufacturer;
    private String specification;

    public Product(String productName, String manufacturer, String specification) {
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.specification = specification;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
