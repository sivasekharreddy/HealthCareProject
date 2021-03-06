package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Specialization_tab")
@NoArgsConstructor
@AllArgsConstructor
public class Specialization 
{
  @Id
  @Column(name="spec_id_col")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
  
   @Column(name="spec_code_col")
   private String specCode;
   
   @Column(name="spec_name_col")
   private String specName;
   
   @Column(name="spec_note_col")
   private String specNote;
}
