package com.pethoalpar.entity;

import java.util.Date;

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
@Table(name = "measurments")
public class Measurement extends AbstractEntity {

	@Column
	@NotEmpty(message = "Please provide a name")
	@NotNull
	private String name;

	@Column
	@NotEmpty(message = "Please provide a value")
	@NotNull
	private Integer value;

	@Column
	@NotEmpty(message = "Please provide a value")
	@NotNull
	private Date timeStamp;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Unit.class)
	@JoinColumn(name = "unit_id", referencedColumnName = "ID")
	private Unit unit;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Device.class)
	@JoinColumn(name = "device_id", referencedColumnName = "ID")
	private Device device;

	public Measurement() {
		super();
	}

	public Measurement(@NotEmpty(message = "Please provide a name") @NotNull String name,
			@NotEmpty(message = "Please provide a value") @NotNull Integer value,
			@NotEmpty(message = "Please provide a value") @NotNull Date timeStamp, Unit unit, Device device) {
		super();
		this.name = name;
		this.value = value;
		this.timeStamp = timeStamp;
		this.unit = unit;
		this.device = device;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return this.value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Date getTimeStamp() {
		return this.timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Unit getUnit() {
		return this.unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

}
