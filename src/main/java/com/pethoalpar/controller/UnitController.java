package com.pethoalpar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pethoalpar.entity.Unit;

/**
 * @author pethoalpar
 *
 */
@RestController
@RequestMapping("/unit")
public class UnitController extends AbstractDeleteController<Unit> {

}
