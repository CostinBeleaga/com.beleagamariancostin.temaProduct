package com.example.demo.model;


import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    ProductType productType;
    @NotNull
    String productName;
    @NotNull
    String productCode;
    @NotNull
    Integer stock;
    //@OneToMany
    //List<PurchaseHistory> purchaseHistory;
    Boolean deleted;
}
