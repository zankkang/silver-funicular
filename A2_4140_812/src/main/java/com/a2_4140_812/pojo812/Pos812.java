package com.a2_4140_812.pojo812;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name="pos812")
public class Pos812 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "poNo812")
    private Long poNo812;
    @Basic
    @Column(name = "clientCompID812")
    private Long clientCompId812;
    @Basic
    @Column(name = "dateOfPO812")
    @JsonFormat(pattern = "yyyy-dd-MM HH:mm:ss")
    private Date dateOfPo812;
    @Basic
    @Column(name = "status812")
    private String status812;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos812 pos812 = (Pos812) o;
        return poNo812 == pos812.poNo812 && Objects.equals(clientCompId812, pos812.clientCompId812) && Objects.equals(dateOfPo812, pos812.dateOfPo812) && Objects.equals(status812, pos812.status812);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poNo812, clientCompId812, dateOfPo812, status812);
    }
}
