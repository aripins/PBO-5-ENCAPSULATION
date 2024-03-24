import java.text.DecimalFormat;

public class Product {

  private String productName;
  private String productCode;
  private double price;

  public Product(String productName, String productCode, double price) {
    this.productName = productName;
    this.productCode = productCode;
    this.price = price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getProductName() {
    return productName;
  }

  public String getProductCode() {
    return productCode;
  }

  public double getPrice() {
    return price;
  }

  public String toString() {
    DecimalFormat formatter = new DecimalFormat("Rp #,###");
    return "Product Name: " + productName + "\n"
        + "Product Code: " + productCode + "\n"
        + "Price: " + formatter.format(price);
  }
}
