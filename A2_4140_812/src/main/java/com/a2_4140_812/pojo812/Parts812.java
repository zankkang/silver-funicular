package com.a2_4140_812.pojo812;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="parts812")
public class Parts812 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "partNo812")
    private Long partNo812;
    @Basic
    @Column(name = "partName812")
    private String partName812;
    @Basic
    @Column(name = "currentPrice812")
    private String currentPrice812;
//    @JsonIgnore
    @Basic
    @Column(name = "poH812")
    private Integer poH812;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parts812 parts812 = (Parts812) o;
        return partNo812 == parts812.partNo812 && Objects.equals(partName812, parts812.partName812) && Objects.equals(currentPrice812, parts812.currentPrice812) && Objects.equals(poH812, parts812.poH812);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partNo812, partName812, currentPrice812, poH812);
    }
}
