package pro.sky.demostore.cart.domain;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Cart {
    private final List<Integer> items = new ArrayList<>();

    public List<Integer> getItems() {
        return items;
    }

    public List<Integer> add(List<Integer> id) {
        if (id != null) {
            items.addAll(id);
        }
        return items;
    }

    public List<Integer> getList() {
        return items;
    }
}