package com.alkemy.Disney.entidades;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import lombok.*;

@Entity
@Table(name = "personajes")
@Getter
@Setter
public class PersonajeEntity {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	private String nombre;
	private int edad;
	private int peso;
	private String historia;
	
	
	@ManyToMany(mappedBy ="personajes", cascade = {
			
			CascadeType.PERSIST,
			CascadeType.MERGE
	})
	private Set<PeliculaEntity> peliculas = new HashSet<>(); 
	
}