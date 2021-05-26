package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Occupation_master {
	@Id
	private int oc_id;
	private String oc_name;

}
