package org.serratec.pizzaria.repository;

import org.serratec.pizzaria.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{ //botar grudado, custa ponto

}
