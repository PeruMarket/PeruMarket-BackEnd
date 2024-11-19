package pe.edu.upc.trabajofinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;
    @Column(name = "nameClient",length =100 ,nullable = false)
    private String nameClient;
    @Column(name = "lastNameClient",length =100 ,nullable = false)
    private String lastNameClient;
    @Column(name = "dniClient",length =100 ,nullable = false)
    private String dniClient;
    @Column(name = "creditLimit",nullable = false)
    private Double creditLimit;
    @Column(name = "currentBalance" ,nullable = false)
    private Double currentBalance;
    @ManyToOne
    @JoinColumn(name="idInvoices",nullable = false)
    private Invoices invoices;

    public Client() {
    }

    public Client(int idClient, String nameClient, String lastNameClient, String dniClient, Double creditLimit, Double currentBalance, Invoices invoices) {
        this.idClient = idClient;
        this.nameClient = nameClient;
        this.lastNameClient = lastNameClient;
        this.dniClient = dniClient;
        this.creditLimit = creditLimit;
        this.currentBalance = currentBalance;
        this.invoices = invoices;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public String getLastNameClient() {
        return lastNameClient;
    }

    public void setLastNameClient(String lastNameClient) {
        this.lastNameClient = lastNameClient;
    }

    public String getDniClient() {
        return dniClient;
    }

    public void setDniClient(String dniClient) {
        this.dniClient = dniClient;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(Double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public Invoices getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoices invoices) {
        this.invoices = invoices;
    }
}
