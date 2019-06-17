package com.pethoalpar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pethoalpar.entity.SensorType;

/**
 * @author pethoalpar
 *
 */
@RestController
@RequestMapping("/sensortype")
public class SensorTypeController extends AbstractDeleteController<SensorType> {

}
