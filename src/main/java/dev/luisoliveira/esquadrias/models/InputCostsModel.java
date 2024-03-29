package dev.luisoliveira.esquadrias.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import dev.luisoliveira.esquadrias.enums.MeasurementUnit;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "TB_INPUT_COSTS")
public class InputCostsModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID inputCostsId;
    private BigDecimal value;
    private String measure;
    private MeasurementUnit unit;
    private double yield;
    private BigDecimal yieldPerUnit;

}
