package tools;

import tools.beans.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ObjectMaker {

    public static List<Product> makeProducts(int size) {
        List<Product> ps = new ArrayList<Product>();
        for (int i = 0; i < size; i++) {
            Product p = makeProduct();
            ps.add(p);
        }
        return ps;
    }

    public static Product makeProduct() {
        Product product = new Product();
        product.setProductName("car");
        product.setProductPrice(new BigDecimal("10.8"));
        return product;
    }

}
