package com.snm.candidateevaluationapplication.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.model.Feedback;
import com.snm.candidateevaluationapplication.repository.FeedbackRepository;
import com.snm.candidateevaluationapplication.services.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired
	FeedbackRepository feedbackRepository;
	
	@Override
	public List<Feedback> findAll() {
		return this.feedbackRepository.findAll();
	}

	@Override
	public void save(Feedback feedback) {
		this.feedbackRepository.save(feedback);
		
	}

//	@Override
//	public List<Feedback> findByName(String candidateName, String empName) {
//		return this.feedbackRepository.findByName(candidateName, empName);
//	}


}
