package pe.edu.upc.trabajofinal.dtos;

import jakarta.persistence.Column;

import java.time.LocalDate;

public class InvoicesDTO {
    private int idInvoices;
    private char nominalValue;
    private Double interestValue;
    private LocalDate endDate;
    private Double tea;
    private Double initialCost;
    private int withholding;

    public int getIdInvoices() {
        return idInvoices;
    }

    public void setIdInvoices(int idInvoices) {
        this.idInvoices = idInvoices;
    }

    public char getNominalValue() {
        return nominalValue;
    }

    public void setNominalValue(char nominalValue) {
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
