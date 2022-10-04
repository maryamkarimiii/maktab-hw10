package ir.maktab.entity;

import lombok.*;
import java.util.Date;
import java.util.List;

@Data
public class Bill {
    private Date date;
    private User user;
    private List<Product> products;
    private Double finalPrice;
}
