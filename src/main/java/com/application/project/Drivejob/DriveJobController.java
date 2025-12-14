package com.application.project.Drivejob;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/drivejobs")
public class DriveJobController {

    private final DriveJobService service;

    public DriveJobController(DriveJobService service) {
        this.service = service;
    }

    @GetMapping
    public List<DriveJob> getAll() {
        return service.getAllDriveJobs();
    }

    @GetMapping("/{id}")
    public DriveJob getById(@PathVariable Integer id) {
        return service.getDriveJobById(id);
    }

    @PostMapping
    public DriveJob create(@RequestBody DriveJob driveJob) {
        return service.createDriveJob(driveJob);
    }

    @PutMapping("/{id}")
    public DriveJob update(@PathVariable Integer id, @RequestBody DriveJob driveJob) {
        return service.updateDriveJob(id, driveJob);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteDriveJob(id);
    }
}
