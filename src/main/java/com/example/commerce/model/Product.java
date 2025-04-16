package com.example.commerce.model;
import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
//    @Column(nullable = false)
    private String name;
//    @Column(nullable = false)
    private BigDecimal price;
    private String desc;
    private String brand;
    private String category;
    private Date releaseDate ;
    private int quantity;
    private boolean available;
}
