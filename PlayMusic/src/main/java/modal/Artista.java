package modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@SequenceGenerator(name="artista", sequenceName="tb_sq_artista", allocationSize=1)
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_artista")
public class Artista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_artista;
	private String nm_artista;
	private String tp_artista;
	@OneToMany(mappedBy="artista", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Album> album;
	@ManyToMany
	@JoinTable(name="tb_musica_artista",
	joinColumns=@JoinColumn(name="id_artista"),
	inverseJoinColumns=@JoinColumn(name="id_musica"))
	private List<Musica> musicas;
}
