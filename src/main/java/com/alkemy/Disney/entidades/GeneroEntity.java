package com.alkemy.Disney.entidades;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "genero")

@Getter
@Setter
public class GeneroEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String imagen;
	private String nombre;

}
