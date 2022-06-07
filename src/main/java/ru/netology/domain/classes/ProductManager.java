package ru.netology.domain.classes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.data.Repository;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProductManager {
    private Repository[] products;

    public void add (Product product) {

    }
}
