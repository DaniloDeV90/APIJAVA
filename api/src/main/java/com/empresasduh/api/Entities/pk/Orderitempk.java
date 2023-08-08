package com.empresasduh.api.Entities.pk;

import com.empresasduh.api.Entities.Order;
import com.empresasduh.api.Entities.Product;

import java.io.Serializable;
import java.util.Objects;

public class Orderitempk  implements Serializable {
    private Order order;
    private Product product;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orderitempk that = (Orderitempk) o;
        return Objects.equals(order, that.order) && Objects.equals(product, that.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, product);
    }


}
