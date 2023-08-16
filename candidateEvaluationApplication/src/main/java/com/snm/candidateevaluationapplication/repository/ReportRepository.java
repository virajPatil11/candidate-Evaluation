package com.snm.candidateevaluationapplication.repository;

import java.util.List;

import com.snm.candidateevaluationapplication.model.Feedback;

public interface ReportRepository {
	
	List<Feedback> findByLevel(String feedbackScreeningLevel);
	
	List<Feedback> findByEvaluator(String empName);

	List<Feedback> findByFeedbackStatus(String feedbackStatus);

}
