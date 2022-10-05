package ir.maktab.entity;
import lombok.*;
@Data
public abstract class Product {
  private Integer productID;
  private String productName;
  private String model;
  private String size;
  private Integer inventory;
  private Integer customerRequest;
  private Double price;
  private Double score;
}
