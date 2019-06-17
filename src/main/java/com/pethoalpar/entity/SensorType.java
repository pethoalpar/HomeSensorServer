package com.pethoalpar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author pethoalpar
 *
 */
@Entity
@Table(name = "sensor_types")
public class SensorType extends AbstractEntity {

	@Column
	@NotEmpty(message = "Please provide a name")
	@NotNull
	private String name;

	@Column
	private String description;

	public SensorType(@NotEmpty(message = "Please provide a name") @NotNull String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public SensorType() {
		super();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
