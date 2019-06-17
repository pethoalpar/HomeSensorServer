package com.pethoalpar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pethoalpar.entity.Measurement;

/**
 * @author pethoalpar
 *
 */
@RestController
@RequestMapping("/measurement")
public class MeasurementController extends AbstractDeleteController<Measurement> {

}
