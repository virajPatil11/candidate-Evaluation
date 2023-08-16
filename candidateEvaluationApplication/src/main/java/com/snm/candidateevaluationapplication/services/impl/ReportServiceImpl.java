package com.snm.candidateevaluationapplication.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Feedback;
import com.snm.candidateevaluationapplication.repository.ReportRepository;
import com.snm.candidateevaluationapplication.services.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	ReportRepository reportRepository;

	@Override
	public List<Feedback> findByLevel(String feedbackScreeningLevel) {
		return this.reportRepository.findByLevel(feedbackScreeningLevel);
	}

	@Override
	public List<Feedback> findByEvaluator(String empName) {
		return this.reportRepository.findByEvaluator(empName);
	}

	@Override
	public List<Feedback> findByFeedbackStatus(String feedbackStatus) {
		return this.reportRepository.findByFeedbackStatus(feedbackStatus);
	}

}
