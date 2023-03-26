package modal;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.mapping.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_musica")
public class Musica {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_musica;
	private String nm_musica;
	private String tm_musica;
	private float vl_musica;
	private String lg_musica;
	private String nm_produtor;
	private String nm_compositor;
	@Temporal(TemporalType.DATE)
	private LocalDate dt_lancamento;
	@ManyToMany(mappedBy="musicas")
	private List<Artista> atistas;
	@OneToMany(mappedBy="musica", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Album_Musica> albuns_musicas;
	@OneToMany(mappedBy="musica")
	private List<Genero_Musica> generoMusicas;
	
}
