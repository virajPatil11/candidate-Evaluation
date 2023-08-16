package com.snm.candidateevaluationapplication.services;

import java.util.List;

import com.snm.candidateevaluationapplication.model.Candidate;

public interface CandidateService {
	
	Candidate addCandidate(Candidate candidate);
	
	void updateCandidate(int candidateId, Candidate candidate);
	
	Candidate updateCand(Candidate candidate);
	
	void softDeleteCandidate(int candidateId); 	// Delete
	
	
	Candidate findById(int candidateId);
	
	List<Candidate> findByName(String candidateName); 	// Search
	
	List<Candidate> findAll();

	List<Candidate> findSeleted();

//	List<Candidate> findSeleted();
//	List<Candidate> findNotSeleted();
	
	

}
