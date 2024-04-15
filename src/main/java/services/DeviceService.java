package services;

import org.springframework.stereotype.Service;
import project.u5d11.entities.Device;
import project.u5d11.repositories.DeviceRepository;


@Service
public class DeviceService {
    private final DeviceRepository deviceRepository;


    public DeviceService(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public Device saveDevice(Device device) {

        return deviceRepository.save(device);
    }
}
