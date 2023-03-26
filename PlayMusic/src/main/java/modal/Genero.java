package modal;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_genero")
public class Genero {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_genero;
	private String nm_genero;
	@OneToMany(mappedBy="genero")
	private List<Genero_Musica> generoMusicas;
	
}
