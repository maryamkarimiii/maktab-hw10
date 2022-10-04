package ir.maktab.entity;
import lombok.*;
@Data
public class Product {
  private Integer productID;
  private String productName;
  private String model;
  private String size;
  private String description;
  private Double price;
  private Double score;
}
