package com.pethoalpar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pethoalpar.entity.Device;

/**
 * @author pethoalpar
 *
 */
@RestController
@RequestMapping("/device")
public class DeviceController extends AbstractDeleteController<Device> {

}
