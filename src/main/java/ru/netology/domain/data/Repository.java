package ru.netology.domain.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.netology.domain.classes.Product;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Repository {
    private Product[] product;


}
