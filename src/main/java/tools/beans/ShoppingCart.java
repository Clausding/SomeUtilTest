package tools.beans;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ShoppingCart implements Serializable {

    private static final long serialVersionUID = -6773112862455977328L;

    private String name;

    private List<Product> products;

}
