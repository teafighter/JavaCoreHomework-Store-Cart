package pro.sky.demostore.cart.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.demostore.cart.domain.Cart;
import pro.sky.demostore.cart.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;

    public CartServiceImpl(Cart cart) { // инжектим корзину через конструктор
        this.cart = cart;
    }

    @Override
    public List<Integer> add(List<Integer> id) {
        return cart.add(id);
    }

    @Override
    public List<Integer> get() {
        return cart.getList();
    }
}
