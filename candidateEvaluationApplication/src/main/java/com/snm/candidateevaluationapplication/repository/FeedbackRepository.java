package com.snm.candidateevaluationapplication.repository;

import java.util.List;

import com.snm.candidateevaluationapplication.model.Candidate;
//import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.model.Feedback;

public interface FeedbackRepository {
	
	List<Feedback> findAll();
	
	void save(Feedback feedback);
	
	List<Feedback> findByCandidate(int candidateId);

//	List<Feedback> findByName(String candidateName, String empName);


	
	


	




}
