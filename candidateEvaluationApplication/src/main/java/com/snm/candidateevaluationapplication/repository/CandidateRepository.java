package com.snm.candidateevaluationapplication.repository;

import java.util.List;

import com.snm.candidateevaluationapplication.model.Candidate;

public interface CandidateRepository {
	
	Candidate addCandidate(Candidate candidate);
	void updateCandidate(int candidateId, Candidate candidate);

	 
	Candidate updateCand(Candidate candidate);
	
	void softDeleteCandidate(int candidateId);
	
	
	Candidate findById(int candidateId);
	
	List<Candidate> findByName(String candidateName);
	
	List<Candidate> findAll();

//	List<Candidate> findSeleted();
//    List<Candidate> findNotSeleted();

}
