package br.com.cotiinformatica.domain.entities;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import br.com.cotiinformatica.domain.enums.StatusPedido;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name = "tb_pedidos")
@Data
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	@Column(columnDefinition = "uuid")
	private UUID id;
	
	@Column(length = 100, nullable = false)
	private String cliente;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private LocalDateTime dataHora;
	
	@Column(nullable = false, precision = 15, scale = 2)
	private BigDecimal valor;

	@Enumerated(EnumType.ORDINAL)
	@Column(nullable = false)
	private StatusPedido status;


	public Pedido() {
		// TODO Auto-generated constructor stub
	}


	public Pedido(UUID id, String cliente, LocalDateTime dataHora, 
BigDecimal valor, StatusPedido status) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.dataHora = dataHora;
		this.valor = valor;
		this.status = status;
	}


	public UUID getId() {
		return id;
	}


	public void setId(UUID id) {
		this.id = id;
	}


	public String getCliente() {
		return cliente;
	}


	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}


	public BigDecimal getValor() {
		return valor;
	}


	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}


	public StatusPedido getStatus() {
		return status;
	}


	public void setStatus(StatusPedido status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Pedido [id=" + id + ", cliente=" + cliente 
+ ", dataHora=" + dataHora + ", valor=" + valor 
+ ", status=" + status + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(id, other.id);
	}
}


