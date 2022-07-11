package com.alkemy.Peliculas12.entidades;


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
	private Long ID;
	
	private String Imagen;
	private String Nombre;
	private int Edad;
	private int Peso;
	private String Historia;
	
	
	@ManyToMany(mappedBy ="personajes", cascade = CascadeType.ALL)
	private Set<PeliculaEntity> peliculas = new HashSet<>(); 
	
}