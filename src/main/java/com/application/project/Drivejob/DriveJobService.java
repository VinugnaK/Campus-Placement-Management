package com.application.project.Drivejob;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DriveJobService {

    private final DriveJobRepository repository;

    public DriveJobService(DriveJobRepository repository) {
        this.repository = repository;
    }

    public List<DriveJob> getAllDriveJobs() {
        return repository.findAll();
    }

    public DriveJob getDriveJobById(Integer id) {
        Optional<DriveJob> job = repository.findById(id);
        return job.orElse(null);
    }

    public DriveJob createDriveJob(DriveJob driveJob) {
        return repository.save(driveJob);
    }

    public void deleteDriveJob(Integer id) {
        repository.deleteById(id);
    }

    public DriveJob updateDriveJob(Integer id, DriveJob updatedJob) {
        return repository.findById(id).map(job -> {
            job.setDriveId(updatedJob.getDriveId());
            job.setJobId(updatedJob.getJobId());
            job.setPackageValue(updatedJob.getPackageValue());
            job.setTenthCutOffPercentage(updatedJob.getTenthCutOffPercentage());
            job.setTwelfthCutOffPercentage(updatedJob.getTwelfthCutOffPercentage());
            job.setBacklogsEligibility(updatedJob.getBacklogsEligibility());
            job.setCgpaCutoff(updatedJob.getCgpaCutoff());
            job.setBranch(updatedJob.getBranch());
            return repository.save(job);
        }).orElseGet(() -> {
            updatedJob.setId(id);
            return repository.save(updatedJob);
        });
    }
}
