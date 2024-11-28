package com.ucsal.arqsoftware.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_physical_spaces")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PhysicalSpace {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include
	private Long id;
	
	@Setter
	private String name;
	
	@Setter
	private String location;
	
	@Setter
	private PhysicalSpaceType type;
	
	@Setter
	private Integer capacity;
	
	@Setter
	private Boolean availability;
	
	@Setter
	private String resources;
	
	public PhysicalSpace() {
	}
	
}
