package fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import tools.ObjectMaker;
import tools.beans.Product;
import tools.beans.ShoppingCart;

import java.util.List;

@Slf4j
public class FastJson {
    public static void main(String[] args) {
        parseObject2();
    }

    /**
     * JSON字符串转对象列表
     */
    static void parseObject2() {
        List<Product> products = ObjectMaker.makeProducts(5);
        ShoppingCart sc = new ShoppingCart();
        sc.setProducts(products);
        sc.setName("我的购物车");
        String json = JSON.toJSONString(sc);
        // 转换
        ShoppingCart sc2 = JSON.parseObject(json, ShoppingCart.class);
        // 打印日志
        log.info("[JSON字符串转对象列表] [对象列表:==={}===]", JSONObject.toJSON(sc2));
    }

    /**
     * JSON字符串转单个对象
     */
    static void parseObject() {
        Product p = ObjectMaker.makeProduct();
        String json = JSON.toJSONString(p);
        // 转换
        Product p2 = JSON.parseObject(json, Product.class);
        // 打印日志
        log.info("[JSON字符串转单个对象] [单个对象:==={}===]", JSONObject.toJSON(p2));
    }

    /**
     * 对象列表转JSON字符串
     */
    static void toJSON2() {
        List<Product> products = ObjectMaker.makeProducts(5);
        // 转换
        String json = JSON.toJSONString(products);
        // 打印日志
        log.info("[对象列表转JSON字符串] [json字符串:==={}===]", json);
    }

    /**
     * 单个对象转JSON字符串
     */
    static void toJSON() {
        Product p = ObjectMaker.makeProduct();
        // 转换
        String json = JSON.toJSONString(p);
        // 打印日志
        log.info("[单个对象转JSON字符串] [json字符串:==={}===]", json);
    }
}
