package pe.edu.upc.trabajofinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    @Column(name = "nameProduct",length =100 ,nullable = false)
    private String nameProduct;
    @Column(name = "descriptionProduct",length =100 ,nullable = false)
    private String descriptionProduct;
    @Column(name = "unitPrice",nullable = false)
    private Double unitPrice;
    @Column(name = "establishment" ,nullable = false)
    private int establishment;

    @ManyToOne
    @JoinColumn(name="idClient",nullable = false)
    private Client client;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String descriptionProduct, Double unitPrice, int establishment, Client client) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.descriptionProduct = descriptionProduct;
        this.unitPrice = unitPrice;
        this.establishment = establishment;
        this.client = client;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getEstablishment() {
        return establishment;
    }

    public void setEstablishment(int establishment) {
        this.establishment = establishment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
