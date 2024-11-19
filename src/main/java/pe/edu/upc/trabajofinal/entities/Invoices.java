package pe.edu.upc.trabajofinal.entities;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Invoices")
public class Invoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInvoices;
    @Column(name = "nominalValue",length =100 ,nullable = false)
    private String nominalValue;
    @Column(name = "interestValue" ,nullable = false)
    private Double interestValue;
    @Column(name = "endDate" ,nullable = false)
    private LocalDate endDate;
    @Column(name = "tea" ,nullable = false)
    private Double tea;
    @Column(name = "initialCost" ,nullable = false)
    private Double initialCost;
    @Column(name = "withholding" ,nullable = false)
    private int withholding;

    public Invoices() {
    }

    public Invoices(int idInvoices, String nominalValue, Double interestValue, LocalDate endDate, Double tea, Double initialCost, int withholding) {
        this.idInvoices = idInvoices;
        this.nominalValue = nominalValue;
        this.interestValue = interestValue;
        this.endDate = endDate;
        this.tea = tea;
        this.initialCost = initialCost;
        this.withholding = withholding;
    }

    public int getIdInvoices() {
        return idInvoices;
    }

    public void setIdInvoices(int idInvoices) {
        this.idInvoices = idInvoices;
    }

    public String getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(String nominalValue) {
        this.nominalValue = nominalValue;
    }

    public Double getInterestValue() {
        return interestValue;
    }

    public void setInterestValue(Double interestValue) {
        this.interestValue = interestValue;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Double getTea() {
        return tea;
    }

    public void setTea(Double tea) {
        this.tea = tea;
    }

    public Double getInitialCost() {
        return initialCost;
    }

    public void setInitialCost(Double initialCost) {
        this.initialCost = initialCost;
    }

    public int getWithholding() {
        return withholding;
    }

    public void setWithholding(int withholding) {
        this.withholding = withholding;
    }
}
