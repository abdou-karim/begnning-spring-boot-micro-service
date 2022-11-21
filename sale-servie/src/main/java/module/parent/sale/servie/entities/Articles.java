package module.parent.sale.servie.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Articles {

    private Long id;

    private String name;

    private float price;
}
