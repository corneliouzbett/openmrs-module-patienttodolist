package org.openmrs.module.patienttodolist;

import org.openmrs.BaseOpenmrsData;
import org.openmrs.Patient;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Task")
@Table(name = "tasks")
public class Task extends BaseOpenmrsData {
	
	@Id
	@GeneratedValue
	@Column(name = "task_id")
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
	@Basic
	@Column(name = "name")
	private String name;
	
	@Basic
	@Column(name = "description", length = 5000)
	private String description;
	
	@Basic
	@Column(name = "created_at")
	private Date createdAt;
	
	@Basic
	@Column(name = "completed")
	private Boolean completed;
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String getUuid() {
		return super.getUuid();
	}

	@Override
	public void setUuid(String uuid) {
		super.setUuid(uuid);
	}

	public Task() {
	}
	
	public Patient getPatient() {
		return patient;
	}
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Boolean getCompleted() {
		return completed;
	}
	
	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}
}
