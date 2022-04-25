package currencyexchange.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor

@Entity
@Table(name = "currency")
public class Currency {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "id", unique = true)
    private Long id;

    @NotNull
    @Column(name = "name")
    private String fullCurrencyName;

    @NotNull
    @Column(name = "short")
    private String shortCurrencyName;

    @NotNull
    @Column(name = "conversion")
    private float conversionFactor;

}
