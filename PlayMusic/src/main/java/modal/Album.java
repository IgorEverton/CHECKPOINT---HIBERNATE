package modal;


import java.util.Calendar;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@SequenceGenerator(name="tb_album", sequenceName="tb_sq_album", allocationSize=1)
@Entity(name="tb_album")
public class Album {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_album;
	private String nm_album;
	private String tp_album;
	private Calendar dt_lancamento;
	private Calendar dt_gravacao;
	@ManyToOne
	@JoinColumn(name="id_artista")
	private Artista artista;
	@OneToMany(mappedBy="album", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Album_Musica> albuns_musicas;
	@ManyToOne
	@JoinColumn(name="id_gravadora")
	private Gravadora gravadora;
	

}
