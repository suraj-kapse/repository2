package com.example.demo.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Enquiry {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int enq_id;
	private String enq_name;
	private String enq_dob;
	private int enq_age;
	@OneToMany(cascade = CascadeType.ALL)
	private Address addr;
	private String enq_mobileno;
	private String alt_mobileno;
	private String enq_email;
	private String pan_no;
	private String adhar_no;
	@OneToOne(cascade = CascadeType.ALL)
	private  Occupation_master oc;
	private String income;
	private String vehicle_name;
	private String req_amount;
	private String Date_of_app;
	@OneToOne(cascade = CascadeType.ALL)
	private Status_master status;
	private String cibil_score;
	
}
