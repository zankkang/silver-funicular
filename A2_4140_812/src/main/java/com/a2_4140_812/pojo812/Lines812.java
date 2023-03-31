package com.a2_4140_812.pojo812;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "lines812")
public class Lines812 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "lineNo812")
    private Long lineNo812;
    @Basic
    @Column(name = "poNo812")
    private Long poNo812;
    @Basic
    @Column(name = "partNo812")
    private Long partNo812;
    @Basic
    @Column(name = "qty812")
    private Integer qty812;
    @Basic
    @Column(name = "priceOrdered812")
    private String priceOrdered812;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lines812 lines812 = (Lines812) o;
        return poNo812 == lines812.poNo812 && partNo812 == lines812.partNo812 && Objects.equals(lineNo812, lines812.lineNo812) && Objects.equals(qty812, lines812.qty812) && Objects.equals(priceOrdered812, lines812.priceOrdered812);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lineNo812, poNo812, partNo812, qty812, priceOrdered812);
    }
}
