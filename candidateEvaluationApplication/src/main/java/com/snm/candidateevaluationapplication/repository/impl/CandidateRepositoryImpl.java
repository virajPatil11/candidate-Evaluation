package com.snm.candidateevaluationapplication.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.repository.CandidateRepository;
import com.snm.candidateevaluationapplication.services.impl.CandidateRowMapper;

@Repository
public class CandidateRepositoryImpl implements CandidateRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String sqlQuery;
	
	@Autowired
	CandidateRowMapper candidateRowMapper;

	@Override
	public Candidate addCandidate(Candidate candidate) {
		sqlQuery = "INSERT INTO cea_candidate (candidate_name, candidate_phone, candidate_email, candidate_resume, candidate_comment) VALUES (?, ?, ?, ?, ?)";
		int i =this.jdbcTemplate.update(sqlQuery, candidate.getCandidateName(), candidate.getCandidatePhone(), candidate.getCandidateEmail(), candidate.getCandidateResume(), candidate.getCandidateComment());
//		System.out.println(i);
		// this execution is done the same users using there emailid and there active
        // status so based on email id again we retrieve data for the id purpose
		sqlQuery = "SELECT * FROM cea_candidate WHERE candidate_email=? AND is_active=1";
		return this.jdbcTemplate.queryForObject(sqlQuery, candidateRowMapper, candidate.getCandidateEmail());
	}

	@Override
	public void updateCandidate(int candidateId, Candidate candidate) {
		sqlQuery = "UPDATE cea_candidate SET candidate_name=?, candidate_phone=?, candidate_email=?, candidate_resume=?, candidate_comment=? WHERE candidate_id=?";
		int i =this.jdbcTemplate.update(sqlQuery, candidate.getCandidateName(), candidate.getCandidatePhone(), candidate.getCandidateEmail(), candidate.getCandidateResume(), candidate.getCandidateComment(), candidateId);
		
	}
	
	@Override
	public Candidate updateCand(Candidate candidate) {
		sqlQuery = "UPDATE cea_candidate SET candidate_name=?, candidate_phone=?, candidate_email=?, candidate_resume=?, candidate_comment=? WHERE candidate_id=? AND is_active=1";
		int i =this.jdbcTemplate.update(sqlQuery, candidate.getCandidateName(), candidate.getCandidatePhone(), candidate.getCandidateEmail(), candidate.getCandidateResume(), candidate.getCandidateComment(), candidate.getCandidateId());
		
		sqlQuery = "SELECT * FROM cea_candidate WHERE candidate_email=? AND is_active=1";
		return this.jdbcTemplate.queryForObject(sqlQuery, candidateRowMapper, candidate.getCandidateEmail());
	}

	@Override
	public void softDeleteCandidate(int candidateId) {
		sqlQuery = "UPDATE cea_candidate SET is_active=0 WHERE is_active=1 AND candidate_id=?";
		this.jdbcTemplate.update(sqlQuery, candidateId);
//		this.deleteCandidate(candidateId);
		

//		sqlQuery = "DELETE FROM cea_feedback WHERE feedback_candidate_id = (SELECT candidate_id FROM cea_candidate WHERE candidate_id=?)";
//		this.jdbcTemplate.update(sqlQuery, candidateId);
	}

	@Override //retrieve candidate data from database in candidate feedback details
	public Candidate findById(int candidateId) {
		sqlQuery = "SELECT * FROM cea_candidate WHERE candidate_id=?";
		return this.jdbcTemplate.queryForObject(sqlQuery, candidateRowMapper, candidateId);
	}

	@Override
	public List<Candidate> findByName(String candidateName) {
		sqlQuery = "SELECT * FROM cea_candidate WHERE is_active=1 AND (candidate_name LIKE '"+candidateName+"%' OR candidate_name LIKE '%"+candidateName+"%')";
		List<Candidate> candList = this.jdbcTemplate.query(sqlQuery, candidateRowMapper);
		return candList;
	}

	@Override
	public List<Candidate> findAll() {
		sqlQuery = "SELECT * FROM cea_candidate WHERE is_active=1";
		List<Candidate> candList = this.jdbcTemplate.query(sqlQuery, candidateRowMapper);
		return candList;
	}



	/*
	 * @Override public List<Candidate> findSeleted() {
	 * sqlQuery="UPDATE cea_feedback SET isSelected = 1 WHERE feedbackStatus = 'selected' AND feedback_id  IS NULL"
	 * ; List<Candidate> list = this.jdbcTemplate.query(sqlQuery,
	 * candidateRowMapper); return list; }
	 * 
	 * @Override public List<Candidate> findNotSeleted() { // TODO Auto-generated
	 * method stub return null; }
	 */
	

}
