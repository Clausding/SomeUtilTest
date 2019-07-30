package tools.beans;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {

    private static final long serialVersionUID = -8104928456673816768L;

    private String productName;
    private BigDecimal productPrice;

}
