package pro.sky.demostore.cart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.demostore.cart.service.CartService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class CartController {
    private final CartService cartService;

    public CartController(CartService cartService) { // инжектим через конструктор наш сервис корзины
        this.cartService = cartService;
    }

    @GetMapping(path = "/add")
    public List<Integer> add(@RequestParam("id") List<Integer> id) {
        return cartService.add(id);
    }

    @GetMapping(path = "/get")
    public List<Integer> get() {
        return cartService.get();
    }
}
