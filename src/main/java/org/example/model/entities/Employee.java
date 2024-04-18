package org.example.model.entities;


import jakarta.persistence.*;
import lombok.*;
import org.example.model.entities.abstractEntity.UserAbstract;
import org.example.model.entities.enums.Deparment;
import org.example.model.entities.interfacies.ActiveWithItem;

@Entity
@Data
public class Employee extends UserAbstract implements ActiveWithItem {

    @Id
    @GeneratedValue
    private Integer idEmployee;

    private String nameEmployee;
    @Enumerated
    @Column(length = 500)
    private Deparment deparment;


    @Override
    public void login() {

    }

    @Override
    public void register() {

    }

    @Override
    public void displayItem() {

    }

    @Override
    public void addItem(Product product) {

    }

    @Override
    public void removeItem(Product product) {

    }

    @Override
    public Product getItem() {
        return null;
    }

    @Override
    public void updateQuantityItem(Product product) {

    }

    @Override
    public void updateItem(Product product) {

    }

    @Override
    public void changeInforItem(Product product) {

    }
}