package com.snm.candidateevaluationapplication.services;

import java.util.List;

import com.snm.candidateevaluationapplication.model.Feedback;

public interface ReportService {
	
	List<Feedback> findByLevel(String feedbackScreeningLevel);
	
	List<Feedback> findByEvaluator(String empName);

	List<Feedback> findByFeedbackStatus(String feedbackStatus);

}
