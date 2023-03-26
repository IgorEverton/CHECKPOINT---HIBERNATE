package modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="tb_cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private String ds_email;
	private String nm_cliente;
	private String ds_senha;
	private int ds_idade;
	private int ds_enderecoIp;
	private String ds_infoCliente;
	private String tp_device;
}
