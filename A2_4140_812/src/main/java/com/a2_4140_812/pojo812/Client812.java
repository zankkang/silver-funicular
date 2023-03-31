package com.a2_4140_812.pojo812;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "client812")
public class Client812 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId812")
    private Long clientId812;
    @Basic
    @Column(name = "clientCity812")
    private String clientCity812;
    @Basic
    @Column(name = "dollarsOnOrder812")
    private Integer dollarsOnOrder812;
    @Basic
    @Column(name = "clientStatus812")
    private String clientStatus812;
    @Basic
    @Column(name = "clientCompName812")
    private String clientCompName812;
    @Basic
    @Column(name = "clientCompPassword812")
    private String clientCompPassword812;
    @Basic
    @Column(name = "moneyOwed812")
    private Integer moneyOwed812;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client812 client812 = (Client812) o;
        return clientId812 == client812.clientId812 && Objects.equals(clientCity812, client812.clientCity812) && Objects.equals(dollarsOnOrder812, client812.dollarsOnOrder812) && Objects.equals(clientStatus812, client812.clientStatus812) && Objects.equals(clientCompName812, client812.clientCompName812) && Objects.equals(clientCompPassword812, client812.clientCompPassword812) && Objects.equals(moneyOwed812, client812.moneyOwed812);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId812, clientCity812, dollarsOnOrder812, clientStatus812, clientCompName812, clientCompPassword812, moneyOwed812);
    }
}
