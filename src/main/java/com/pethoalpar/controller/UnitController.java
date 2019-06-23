package com.pethoalpar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pethoalpar.entity.Unit;
import com.pethoalpar.service.api.IUnitService;

/**
 * @author pethoalpar
 *
 */
@RestController
@RequestMapping("/units")
public class UnitController extends AbstractDeleteController<Unit> {

	@Autowired
	private IUnitService unitService;

	@GetMapping("/all")
	public String showAll(Model model) {
		model.addAttribute("units", this.unitService.findAll());
		return "/units";
	}

}
