package module.parent.sale.servie.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    private Long id;

    private String fullNameBuyer;

    private List<Articles> articles = new ArrayList<>();
}
