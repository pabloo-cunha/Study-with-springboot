package com.example.springboot.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_ProductS")
@Getter @Setter
public class ProductModel extends RepresentationModel<ProductModel> implements Serializable {
    private static final long serialVersionUID = 1l;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(value = AccessLevel.NONE)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public ProductModel() {
    }

    public ProductModel(UUID idProduct, String name, BigDecimal value) {
        this.idProduct = idProduct;
        this.name = name;
        this.value = value;
    }
}
