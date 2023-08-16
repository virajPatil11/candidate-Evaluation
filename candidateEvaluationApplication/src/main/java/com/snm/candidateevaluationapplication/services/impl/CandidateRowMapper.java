package com.snm.candidateevaluationapplication.services.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Candidate;

@Service
public class CandidateRowMapper implements RowMapper<Candidate>{

	@Override
	public Candidate mapRow(ResultSet rs, int cnt) throws SQLException {
		Candidate candidate = new Candidate();
		candidate.setCandidateId(rs.getInt("candidate_id"));
		candidate.setCandidateName(rs.getString("candidate_name"));
		candidate.setCandidatePhone(rs.getLong("candidate_phone"));
		candidate.setCandidateEmail(rs.getString("candidate_email"));
		candidate.setCandidateResume(rs.getString("candidate_resume"));
		candidate.setCandidateComment(rs.getString("candidate_comment"));
		candidate.setCandidateCreatedDate(rs.getString("created_date"));
		candidate.setIsCandidateActive(rs.getInt("is_active"));
		
		return candidate;
	}

}
