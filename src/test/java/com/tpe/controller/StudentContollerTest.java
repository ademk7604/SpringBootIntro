package com.tpe.controller;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.tpe.repository.StudentRepository;



@ExtendWith(MockitoExtension.class)
public class StudentContollerTest {
	
	@Mock
	StudentRepository studentRepository;
	
	
	
	
	
	@InjectMocks 			    	// mock bit obje ile bu sekilde enjekte ediliyor
	StudentController underTest;    // studentRepository objesini  underTest icine enjekte etmis olacak

}
