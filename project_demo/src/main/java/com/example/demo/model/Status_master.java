package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Status_master {
	@Id
	private int status_id;
	private String status_name;
	private int status_code;
}
