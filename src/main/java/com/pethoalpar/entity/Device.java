package com.pethoalpar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author pethoalpar
 *
 */
@Entity
@Table(name = "devices")
public class Device extends AbstractEntity {

	@Column
	@NotEmpty(message = "Please provide a name")
	@NotNull
	private String name;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = SensorType.class)
	@JoinColumn(name = "sensor_type_id", referencedColumnName = "ID")
	private SensorType sensorType;

	public Device() {
		super();
	}

	public Device(@NotEmpty(message = "Please provide a name") @NotNull String name, SensorType sensorType) {
		super();
		this.name = name;
		this.sensorType = sensorType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public SensorType getSensorType() {
		return this.sensorType;
	}

	public void setSensorType(SensorType sensorType) {
		this.sensorType = sensorType;
	}

}
