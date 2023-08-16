package com.snm.candidateevaluationapplication.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.repository.CandidateRepository;
import com.snm.candidateevaluationapplication.repository.FeedbackRepository;
import com.snm.candidateevaluationapplication.services.CandidateService;

@Service
public class CandidateServiceImpl implements CandidateService {

	@Autowired
	CandidateRepository candidateRepository;
	
	@Autowired
	FeedbackRepository feedbackRepository;
	
	public CandidateRepository getCandidateRepositroy() {
        return candidateRepository;
    }
	
	public void setCandidateRepositroy(CandidateRepository candidateRepositroy) {
        this.candidateRepository = candidateRepositroy;
    }
	
	@Override
	public Candidate addCandidate(Candidate candidate) {
		return this.candidateRepository.addCandidate(candidate);
	}

	@Override
	public void updateCandidate(int candidateId, Candidate candidate) {
		this.candidateRepository.updateCandidate(candidateId, candidate);
	}

	@Override
	public void softDeleteCandidate(int candidateId) {
		this.candidateRepository.softDeleteCandidate(candidateId);
	}

	@Override
	public Candidate findById(int candidateId) {
		Candidate candidate = this.candidateRepository.findById(candidateId);
		candidate.setCandidateFeedbackList(this.feedbackRepository.findByCandidate(candidateId));
		return  candidate;
	}

	@Override
	public List<Candidate> findByName(String candidateName) {
		return this.candidateRepository.findByName(candidateName);
	}

	@Override
	public List<Candidate> findAll() {
		return this.candidateRepository.findAll();
	}

	/*
	 * @Override public List<Candidate> findSeleted() { // TODO Auto-generated
	 * method stub return this.candidateRepository.findSeleted(); }
	 * 
	 * @Override public List<Candidate> findNotSeleted() { // TODO Auto-generated
	 * method stub return null; }
	 */

	@Override
	public Candidate updateCand(Candidate candidate) {
		return this.candidateRepository.updateCand(candidate);

	}

	@Override
	public List<Candidate> findSeleted() {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public List<Candidate> findSeleted() {
//		// TODO Auto-generated method stub
//		return this.feedbackRepository.findByStatus();
//	}

}
