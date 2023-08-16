package com.snm.candidateevaluationapplication.model;

public class Feedback {
	
	private int feedbackId;
	private int  feedbackEvalutorId;
	private int feedbackCandidateId;
	private String feedbackScreeningLevel;
	private String feedbackStatus;
	private String feedbackComment;
	private String feedbackDatetime;
	
	// Extra Properties to maintain feedback details in application. (HAS-A)
	private Candidate feedbackCandidate;
	private Employee feedbackEvalutor;
	/**
	 * @return the feedbackId
	 */
	public int getFeedbackId() {
		return feedbackId;
	}
	/**
	 * @param feedbackId the feedbackId to set
	 */
	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}
	/**
	 * @return the feedbackEvalutorId
	 */
	public int getFeedbackEvalutorId() {
		return feedbackEvalutorId;
	}
	/**
	 * @param feedbackEvalutorId the feedbackEvalutorId to set
	 */
	public void setFeedbackEvalutorId(int feedbackEvalutorId) {
		this.feedbackEvalutorId = feedbackEvalutorId;
	}
	/**
	 * @return the feedbackCandidateId
	 */
	public int getFeedbackCandidateId() {
		return feedbackCandidateId;
	}
	/**
	 * @param feedbackCandidateId the feedbackCandidateId to set
	 */
	public void setFeedbackCandidateId(int feedbackCandidateId) {
		this.feedbackCandidateId = feedbackCandidateId;
	}
	/**
	 * @return the feedbackScreeningLevel
	 */
	public String getFeedbackScreeningLevel() {
		return feedbackScreeningLevel;
	}
	/**
	 * @param feedbackScreeningLevel the feedbackScreeningLevel to set
	 */
	public void setFeedbackScreeningLevel(String feedbackScreeningLevel) {
		this.feedbackScreeningLevel = feedbackScreeningLevel;
	}
	/**
	 * @return the feedbackStatus
	 */
	public String getFeedbackStatus() {
		return feedbackStatus;
	}
	/**
	 * @param feedbackStatus the feedbackStatus to set
	 */
	public void setFeedbackStatus(String feedbackStatus) {
		this.feedbackStatus = feedbackStatus;
	}
	/**
	 * @return the feedbackComment
	 */
	public String getFeedbackComment() {
		return feedbackComment;
	}
	/**
	 * @param feedbackComment the feedbackComment to set
	 */
	public void setFeedbackComment(String feedbackComment) {
		this.feedbackComment = feedbackComment;
	}
	/**
	 * @return the feedbackDatetime
	 */
	public String getFeedbackDatetime() {
		return feedbackDatetime;
	}
	/**
	 * @param feedbackDatetime the feedbackDatetime to set
	 */
	public void setFeedbackDatetime(String feedbackDatetime) {
		this.feedbackDatetime = feedbackDatetime;
	}
	/**
	 * @return the feedbackCandidate
	 */
	public Candidate getFeedbackCandidate() {
		return feedbackCandidate;
	}
	/**
	 * @param feedbackCandidate the feedbackCandidate to set
	 */
	public void setFeedbackCandidate(Candidate feedbackCandidate) {
		this.feedbackCandidate = feedbackCandidate;
	}
	/**
	 * @return the feedbackEvalutor
	 */
	public Employee getFeedbackEvalutor() {
		return feedbackEvalutor;
	}
	/**
	 * @param feedbackEvalutor the feedbackEvalutor to set
	 */
	public void setFeedbackEvalutor(Employee feedbackEvalutor) {
		this.feedbackEvalutor = feedbackEvalutor;
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", feedbackEvalutorId=" + feedbackEvalutorId
				+ ", feedbackCandidateId=" + feedbackCandidateId + ", feedbackScreeningLevel=" + feedbackScreeningLevel
				+ ", feedbackStatus=" + feedbackStatus + ", feedbackComment=" + feedbackComment + ", feedbackDatetime="
				+ feedbackDatetime + ", feedbackCandidate=" + feedbackCandidate + ", feedbackEvalutor="
				+ feedbackEvalutor + "]";
	}
	
	
	
}
