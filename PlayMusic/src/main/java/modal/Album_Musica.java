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
@Entity(name="tb_album_musica")
public class Album_Musica {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_album_musica;
	@ManyToOne
	@JoinColumn(name="id_album")
	private Album album;
	
	@ManyToOne
	@JoinColumn(name="id_musica")
	private Musica musica;

}
