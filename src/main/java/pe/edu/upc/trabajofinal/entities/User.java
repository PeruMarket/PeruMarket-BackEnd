package pe.edu.upc.trabajofinal.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "nameUser",length =100 ,nullable = false)
    private String nameUser;
    @Column(name = "lastName",length =100 ,nullable = false)
    private String lastName;
    @Column(name = "email",length =100 ,nullable = false)
    private String email;
    @Column(name = "password",length =100 ,nullable = false)
    private String password;
    @ManyToOne
    @JoinColumn(name="idClient",nullable = false)
    private Client client;
    @ManyToOne
    @JoinColumn(name="idProduct",nullable = false)
    private Product product;

    public User() {
    }

    public User(int idUser, String nameUser, String lastName, String email, String password, Client client, Product product) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.client = client;
        this.product = product;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
