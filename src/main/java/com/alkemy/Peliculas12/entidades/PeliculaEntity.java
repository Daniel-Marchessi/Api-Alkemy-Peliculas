package com.alkemy.Peliculas12.entidades;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "peliculas")
@Getter
@Setter
public class PeliculaEntity {
	
	@Id
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long ID;
	
	private String imagen;
	private String titulo;

	private int calificacion;
	
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "genero_id", insertable= false, updatable = false )
	private GeneroEntity genero;
	
	
	@Column(name = "genero_id", nullable = false)
	private Long GeneroID;
	

	@ManyToMany (
			
			cascade = {
					
					CascadeType.PERSIST,
					CascadeType.MERGE
			}
			
			)
	
	@JoinTable(name = "pelicula_personaje",
				joinColumns = @JoinColumn(name = "pelicula_id"),
				inverseJoinColumns = @JoinColumn(name = " persojane_id")
			
			)
	
	private Set<PersonajeEntity> personajes = new HashSet<>();
	
	
	
	
	
	
	
	
}