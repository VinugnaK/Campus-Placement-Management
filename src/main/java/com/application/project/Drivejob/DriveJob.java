package com.application.project.Drivejob;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "drivejob")
public class DriveJob {

    @Id
    private Integer id;   // No auto-increment

    private Integer driveId;
    private Integer jobId;

    @Column(name = "`package`")
    @JsonProperty("package")
    private String packageValue;

    private Integer tenthCutOffPercentage;
    private Integer twelfthCutOffPercentage;
    private Integer backlogsEligibility;
    private Integer cgpaCutoff;
    private String branch;

    public DriveJob() {}

    public DriveJob(Integer id, Integer driveId, Integer jobId, String packageValue,
                    Integer tenthCutOffPercentage, Integer twelfthCutOffPercentage,
                    Integer backlogsEligibility, Integer cgpaCutoff, String branch) {
        this.id = id;
        this.driveId = driveId;
        this.jobId = jobId;
        this.packageValue = packageValue;
        this.tenthCutOffPercentage = tenthCutOffPercentage;
        this.twelfthCutOffPercentage = twelfthCutOffPercentage;
        this.backlogsEligibility = backlogsEligibility;
        this.cgpaCutoff = cgpaCutoff;
        this.branch = branch;
    }

    // Getters and Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getDriveId() { return driveId; }
    public void setDriveId(Integer driveId) { this.driveId = driveId; }

    public Integer getJobId() { return jobId; }
    public void setJobId(Integer jobId) { this.jobId = jobId; }

    public String getPackageValue() { return packageValue; }
    public void setPackageValue(String packageValue) { this.packageValue = packageValue; }

    public Integer getTenthCutOffPercentage() { return tenthCutOffPercentage; }
    public void setTenthCutOffPercentage(Integer tenthCutOffPercentage) { this.tenthCutOffPercentage = tenthCutOffPercentage; }

    public Integer getTwelfthCutOffPercentage() { return twelfthCutOffPercentage; }
    public void setTwelfthCutOffPercentage(Integer twelfthCutOffPercentage) { this.twelfthCutOffPercentage = twelfthCutOffPercentage; }

    public Integer getBacklogsEligibility() { return backlogsEligibility; }
    public void setBacklogsEligibility(Integer backlogsEligibility) { this.backlogsEligibility = backlogsEligibility; }

    public Integer getCgpaCutoff() { return cgpaCutoff; }
    public void setCgpaCutoff(Integer cgpaCutoff) { this.cgpaCutoff = cgpaCutoff; }

    public String getBranch() { return branch; }
    public void setBranch(String branch) { this.branch = branch; }
}
