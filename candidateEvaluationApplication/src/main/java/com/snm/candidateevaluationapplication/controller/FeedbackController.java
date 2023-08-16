package com.snm.candidateevaluationapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.model.Feedback;
import com.snm.candidateevaluationapplication.services.CandidateService;
import com.snm.candidateevaluationapplication.services.FeedbackService;

@Controller
@RequestMapping(value = "/feedback")
public class FeedbackController {
//	
//	@Autowired
//	Feedback feedback;
	
	@Autowired 
	FeedbackService feedbackService;
	
	@Autowired
	CandidateService candidateService;
	
	@Autowired
	@Qualifier("screeningLevels")
	List<String> screeningLevels;
	
	@GetMapping(value = "/feedback-list")
	public ModelAndView feedbackList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("feedback-list");
		List<Feedback> feedbackList = this.feedbackService.findAll();
		modelAndView.addObject("fbList", feedbackList);
		return modelAndView;
	}
	
	@GetMapping(value = "/feedback-form/{candidateId}")
	public ModelAndView feedbackForm(@PathVariable int candidateId) {
		List<String> screeningLevels =new ArrayList<>(this.screeningLevels);//copy  of actual levels
		Candidate candidate = this.candidateService.findById(candidateId);
		List<String> completedScreeningLevels = candidate.getCandidateFeedbackList().stream().map(f -> f.getFeedbackScreeningLevel()).toList();
		screeningLevels.removeAll(completedScreeningLevels);
		
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("candidate", candidate);
		modelAndView.setViewName("feedback-form");
		modelAndView.addObject("screeningLevels", screeningLevels);
		return modelAndView;
	}
	
	
	 @PostMapping("/feedback-save") 
	 public String save(Feedback feedback) {
		 System.out.println(feedback);
	 this.feedbackService.save(feedback); 
	 return 	 "redirect:/candEvalApp/candidate/candidate-details/"+feedback.getFeedbackCandidateId(); 
//	 return  "redirect:/candEvalApp/candidate/candidate-list";
	 }
	 
//		@PostMapping(value = "/feedback-search")
//		public ModelAndView feedbackSearch(@RequestParam String candidateName, @RequestParam String empName) {
//			ModelAndView modelAndView = new ModelAndView();
//			List<Feedback> feedbackList = feedbackService.findByName(candidateName, empName);
//			modelAndView.setViewName("feedback-list"); // candidate-list.jsp
//			modelAndView.addObject("fbList", feedbackList);
//			return modelAndView;
//		}
	  
	  
	  
	
	  
}
