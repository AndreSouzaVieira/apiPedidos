package br.com.cotiinformatica.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfiguration {

	@Bean
	OpenAPI customOpenApi() {
		var openApi = new OpenAPI().components(new Components())
				.info(new Info()
						.title("API Pedidos - Treinamento TJ/PR")
						.description("Curso Java Arquiteto - COTI Informática")
						.version("v1"));
		
		return openApi;
	}
	
	@Operation(
			summary = "Cadastro de solicitação de pedido.",
			description = "Cria uma nova solicitação de pedido no sistema."
		)
		@PostMapping
		public ResponseEntity<String> post() {
			return ResponseEntity.ok("Pedido cadastrado com sucesso!");
		}
		@Operation(
			summary = "Alteração de solicitação de pedido.",
			description = "Modifica uma solicitação de pedido já existente no sistema."
		)
		@PutMapping
		public ResponseEntity<String> put() {
			return ResponseEntity.ok("Pedido atualizado com sucesso!");
		}
		@Operation(
			summary = "Exclusão de solicitação de pedido.",
			description = "Remove uma solicitação de pedido já no sistema."
		)
		@DeleteMapping
		public ResponseEntity<String> delete() {
			return ResponseEntity.ok("Pedido excluído com sucesso!");
		}
		@Operation(
			summary = "Consulta de solicitações de pedido.",
			description = "Retorna uma lista contendo solicitações de pedidos cadastrados no sistema."
		)
		@GetMapping
		public ResponseEntity<String> getAll() {
			return ResponseEntity.ok("Pedidos obtidos com sucesso!");
		}
	}

	
	

