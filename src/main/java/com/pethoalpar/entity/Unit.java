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
@Table(name = "units")
public class Unit extends AbstractEntity {

	@Column
	@NotEmpty(message = "Please provide a name")
	@NotNull
	private String name;

	@Column
	@NotEmpty(message = "Please provide a valid code")
	@NotNull
	private String code;

	public Unit() {
		super();
	}

	public Unit(@NotEmpty(message = "Please provide a name") @NotNull String name,
			@NotEmpty(message = "Please provide a valid code") @NotNull String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
