package project.u5d11.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.u5d10.entities.Device;
import project.u5d10.services.DeviceService;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceService deviceService;


    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping
    public ResponseEntity<Device> createDevice(@RequestBody Device device) {
        Device savedDevice = deviceService.saveDevice(device);
        return new ResponseEntity<>(savedDevice, HttpStatus.CREATED);
    }
}
