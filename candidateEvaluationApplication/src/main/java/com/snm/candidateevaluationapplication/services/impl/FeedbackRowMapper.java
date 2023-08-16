package com.snm.candidateevaluationapplication.services.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.model.Employee;
import com.snm.candidateevaluationapplication.model.Feedback;

@Service
public class FeedbackRowMapper implements RowMapper<Feedback> {

	@Override
	public Feedback mapRow(ResultSet rs, int cnt) throws SQLException {
	
				Feedback feedback = new Feedback();
				feedback.setFeedbackId(rs.getInt("feedback_id"));
				feedback.setFeedbackEvalutorId(rs.getInt("feedback_evaluator_id"));
				feedback.setFeedbackCandidateId(rs.getInt("feedback_candidate_id"));
				feedback.setFeedbackScreeningLevel(rs.getString("feedback_screening_level"));
				feedback.setFeedbackStatus(rs.getString("feedback_status"));
				feedback.setFeedbackComment(rs.getString("feedback_comment"));
				feedback.setFeedbackDatetime(rs.getString("feedback_date"));
				
				Candidate candidate = new Candidate();
				candidate.setCandidateId(rs.getInt("candidate_id"));
				candidate.setCandidateName(rs.getString("candidate_name"));
				candidate.setCandidatePhone(rs.getLong("candidate_phone"));
				candidate.setCandidateEmail(rs.getString("candidate_email"));
				candidate.setCandidateResume(rs.getString("candidate_resume"));
				candidate.setCandidateComment(rs.getString("candidate_comment"));
				candidate.setCandidateCreatedDate(rs.getString("created_date"));
				candidate.setIsCandidateActive(rs.getInt("is_active"));
				
				feedback.setFeedbackCandidate(candidate);
				
				Employee emp = new Employee();
				emp.setEmpId(rs.getInt("emp_id"));
				emp.setEmpName(rs.getString("emp_name"));
				emp.setEmpPhone(rs.getLong("emp_phone"));
				emp.setEmpEmail(rs.getString("emp_email"));
				emp.setEmpGcmLevel(rs.getInt("emp_gcm_level"));
				emp.setEmpDasId(rs.getString("emp_das_id"));
				emp.setEmpPassword(rs.getString("emp_password"));
				emp.setEmpRole(rs.getString("emp_role"));
				emp.setEmpManagerId(rs.getInt("emp_manager_id"));
				
				
				feedback.setFeedbackEvalutor(emp);
			
				return feedback;
	}

}
