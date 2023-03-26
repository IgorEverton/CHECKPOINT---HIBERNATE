package modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
@Entity(name="tb_genero_musica")
public class Genero_Musica {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_genero_musica;
	@ManyToOne
	@JoinColumn(name="id_genero")
	private Genero genero;
	@ManyToOne
	@JoinColumn(name="id_musica")
	private Musica musica;
}
