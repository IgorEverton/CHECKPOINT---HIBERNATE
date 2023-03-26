package modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_artista_musica")
public class Artista_Musica {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_artista_musica;
	@ManyToOne
	@JoinColumn(name="id_artista")
	private Album album;
	
	@ManyToOne
	@JoinColumn(name="id_musica")
	private Musica musica;

}
