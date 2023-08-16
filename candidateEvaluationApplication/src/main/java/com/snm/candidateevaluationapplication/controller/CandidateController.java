package com.snm.candidateevaluationapplication.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.snm.candidateevaluationapplication.model.Candidate;
import com.snm.candidateevaluationapplication.services.CandidateService;

@Controller
@RequestMapping(value = "/candidate")
public class CandidateController {

	@Autowired
	CandidateService candidateService;

	/*
	 * To get candidate list after login
	 */
	@GetMapping(value = "/candidate-list") // /candidate/candidate-list
	// we want to view and date name together so we can use model and view
	public ModelAndView candidateList() {
		ModelAndView modelAndView = new ModelAndView();
		List<Candidate> candidateList = this.candidateService.findAll();
		modelAndView.setViewName("candidate-list"); // candidate-list.jsp
		modelAndView.addObject("candList", candidateList);
		return modelAndView;
	}

	@GetMapping(value = "/candidate-delete/{candidateId}") // /candidate/candidate-delete/{candidateId}
	public String candidateSoftDelete(@PathVariable int candidateId) {
		this.candidateService.softDeleteCandidate(candidateId);
		return "redirect:/candEvalApp/candidate/candidate-list";
	}

//	@GetMapping(value = "/candidate-edit/{candidateId}") 	// /candidate/candidate-edit/{candidateId}
//	public String candidateEdit(@PathVariable int candidateId, Model model) {
////		model.addAttribute("candidate-form", candidateForm());
//		return "";
//	}

	// Candidate Details
	@GetMapping(value = "/candidate-details/{candidateId}") // /candidate/candidate-details/{candidateId}
	public ModelAndView candidateDetails(@PathVariable int candidateId) {
		ModelAndView modelAndView = new ModelAndView();
		Candidate candidate = this.candidateService.findById(candidateId);
		modelAndView.addObject("candidate", candidate);
		modelAndView.setViewName("candidate-feedback-details");
		return modelAndView;
	}

	@GetMapping(value = "/candidate-form")
	public String candidateForm() {
		return "candidate-form";
	}

//	@GetMapping(value = "/candidate-update-form/{candidateId}")
//	public ModelAndView candidateUpdateForm(@PathVariable int candidateId, ModelAndView modelAndView) {
////		ModelAndView modelAndView = new ModelAndView();
//		Candidate candidate = candidateService.findById(candidateId);
//		Candidate updatedCandidate = this.candidateService.updateCand(candidate);
//		modelAndView.addObject("candidate", updatedCandidate);
//		modelAndView.setViewName("candidate-update-form");
//		return modelAndView;
//	}
//	
//	@PostMapping(value = "/candidate-update")
//	public String candUpdate(@ModelAttribute("candidate") Candidate candidate) {
//		candidateService.updateCand(candidate); 
//		return "redirect:/candEvalApp/candidate/candidate-list";
//	}

	
//	 * It displays object data into form for the given id. The @PathVariable puts
//	 * URL data into variable.
	  
	  @RequestMapping(value="/candidate-update-form/{candidateId}")
	  public String candidateUpdateForm(@PathVariable int candidateId, Model model){ 
		// Retrieve the existing candidate from the database
		 Candidate candidate = candidateService.findById(candidateId);
	  model.addAttribute("candidate", candidate); 
	  return "candidate-update-form"; 
	  }
	 //* It updates model object.
	 


	 
	 
	 

	@PostMapping(value = "/candidate-search")
	public ModelAndView candidateSearch(@RequestParam String candidateName) {
		ModelAndView modelAndView = new ModelAndView();
		List<Candidate> candidateList = candidateService.findByName(candidateName);
		modelAndView.setViewName("candidate-list"); // candidate-list.jsp
		modelAndView.addObject("candList", candidateList);
		return modelAndView;
	}

	/*
	 * For Resume upload functionality
	 */

	public static String uploadDirectory = "C:\\Users\\a886844\\eclipse-workspace\\JavaFSDBootcampJuly2023\\candidateEvaluationApplication\\src\\main\\webapp\\WEB-INF\\resources\\resume";

	@PostMapping("/candidate-save")
	public String save(Candidate candidate, @RequestParam("candResume") MultipartFile multipartFile, Model model)
			throws IOException {
		System.out.println(candidate);
		candidate = candidateService.addCandidate(candidate);
		// after insertion database give us id that is used to create new file which is
		// upload others
		System.out.println(candidate);
		// when client send data to u 1st data without id there when u put data then
		// database give updated data to u at same time
		String extension = multipartFile.getOriginalFilename()
				.substring(multipartFile.getOriginalFilename().lastIndexOf("."));
		// using id and MultipartFile file we create new file in our directory
		String filename = candidate.getCandidateName() + "_" + candidate.getCandidateId() + "" + extension;
		filename = filename.replaceAll(" ", "_");
		Path fileNameAndPath = Paths.get(uploadDirectory, filename);
		Files.write(fileNameAndPath, multipartFile.getBytes());
		// whatever write data into file so whatever data send by the client byte write
		// into file to store data
		candidate.setCandidateResume(filename); // set the name here
		candidateService.updateCandidate(candidate.getCandidateId(), candidate); // updateQuery
		return "redirect:/candEvalApp/candidate/candidate-list";

	}
	
//	 @PostMapping(value="/candidate-update-form/{candidateId}/update-save") 
//	 public String updateSave(@PathVariable("candidateId") int candidateId, @ModelAttribute("candidate") Candidate candidate, @RequestParam("candResume") MultipartFile multipartFile, Model model) throws IOException {
//		 System.out.println("Before" +candidate);
//		candidate = candidateService.updateCand(candidate);
//		System.out.println("After" +candidate);
//		String extension = multipartFile.getOriginalFilename()
//				.substring(multipartFile.getOriginalFilename().lastIndexOf("."));
//		String filename = candidate.getCandidateName() + "_" + candidate.getCandidateId() + "" + extension;
//		filename = filename.replaceAll(" ", "_");
//		Path fileNameAndPath = Paths.get(uploadDirectory, filename);
//		Files.write(fileNameAndPath, multipartFile.getBytes());
//		candidate.setCandidateResume(filename); // set the name here
//		this.candidateService.updateCandidate(candidate.getCandidateId(), candidate); // updateQuery
//		return "redirect:/candEvalApp/candidate/candidate-list";	
//		
//	 }
	
	 @PostMapping(value="/candidate-update-form/{candidateId}/update-save") 
	 public String updateSave(@PathVariable int candidateId, @ModelAttribute("candidate") Candidate candidate, @RequestParam("candResume") MultipartFile resumeFile, Model model) throws IOException {
		// Retrieve the existing candidate from the database
	        Candidate existingCandidate = candidateService.findById(candidateId);
	        
	     // Update the candidate details from the form data
	        existingCandidate.setCandidateName(candidate.getCandidateName());
	        existingCandidate.setCandidatePhone(candidate.getCandidatePhone());
	        existingCandidate.setCandidateEmail(candidate.getCandidateEmail());

	        existingCandidate.setCandidateComment(candidate.getCandidateComment());


	     // Handle the resume file
	        if (!resumeFile.isEmpty()) {
	            String extension = StringUtils.getFilenameExtension(resumeFile.getOriginalFilename());
	            String filename = existingCandidate.getCandidateName() + "_" + candidate.getCandidateId() + "." + extension;
	    		filename = filename.replaceAll(" ", "_");
	            Path fileNameAndPath = Paths.get(uploadDirectory, filename);
	            Files.write(fileNameAndPath, resumeFile.getBytes());
	            existingCandidate.setCandidateResume(filename);
	        }
		 
		this.candidateService.updateCand(existingCandidate);
		return "redirect:/candEvalApp/candidate/candidate-list";
	 }
	 
	 
	 @GetMapping("/resume/{candidateResume}")
	 @ResponseBody
	    public byte[] viewResume(@PathVariable String candidateResume) throws IOException {
	        Path resumePath = Paths.get(uploadDirectory, candidateResume);

	        // Set the appropriate Content-Type based on the file extension
	        MediaType mediaType = MediaType.parseMediaType("application/pdf"); // Adjust as needed for other file types

	        return Files.readAllBytes(resumePath);
	    }
	 

	 
	 
	 

		
		/*
		 * @GetMapping("/selected") public String selected(Model model) {
		 * List<Candidate> list = candidateService.findSeleted();
		 * model.addAttribute("candidate-list", list); return
		 * "redirect:/candEvalApp/candidate/candidate-list"; }
		 * 
		 * @GetMapping("/notselected") // we want to view and date name together so we
		 * can use model and view public ModelAndView notSelected() { ModelAndView
		 * modelAndView = new ModelAndView(); List<Candidate> candidateList =
		 * this.candidateService.findAll(); mv.setViewName("candidate-list"); //
		 * candList is the name which we have to use in template to retrieve data.
		 * modelAndView.addObject("candList", candidateList); return modelAndView; }
		 */
		 



}
