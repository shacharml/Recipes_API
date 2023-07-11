package com.ShacharAnetDev.Recipes_API.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String desciption;
	private String ingridiance;
	private String urlImage;
	
	
}
