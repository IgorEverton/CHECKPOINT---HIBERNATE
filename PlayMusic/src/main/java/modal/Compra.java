package modal;

import java.time.LocalDate;
import java.util.Calendar;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name="tb_compra")
public class Compra {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id_musica_compra;
	private String tp_pagamento;
	@Temporal(TemporalType.DATE)
	private Calendar  dt_pagamento;
	@Temporal(TemporalType.TIME)
	private Calendar  hr_pagamento;
	@ManyToOne
	@JoinColumn(name="ds_email")
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(name="id_musica")
	private Musica musica;
	
}
