package infnet.com.projetobloco.api.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "alimentos")
public class Alimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigo;
    private String nomeAlimento;
    private long quantidade; 
}
