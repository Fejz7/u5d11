package project.u5d11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import project.u5d11.entities.Device;


public interface DeviceRepository extends JpaRepository<Device, Long> {
}
