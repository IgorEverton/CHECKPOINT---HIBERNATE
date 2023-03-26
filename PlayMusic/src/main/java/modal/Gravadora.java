package modal;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_gravadora")
public class Gravadora {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_gravadora;
	private String nm_gravadora;
	private String website;
	@OneToMany(mappedBy="gravadora",cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private List<Album> albums;
	
}
