package oi.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	//private List  h ;
	public TopicController() {
		
	}
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		
		return topicService.getAllTopic();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		
		return topicService.getTopic(id);
	}
	
	//@RequestMapping(method=RequestMethod.Post   , value="/topics"){
	@RequestMapping(method=RequestMethod.POST ,value="/topics")
		public  void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
		}
	
	@RequestMapping(method=RequestMethod.PUT ,value="/topics/{id}")
	public  void updateTopic(@RequestBody Topic topic ,@PathVariable String id) {
	topicService.updateTopic(id ,topic);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE ,value="/topics/{id}")
	public  void deleteTopic(@RequestBody Topic topic ,@PathVariable String id) {
	topicService.deleteTopic(id ,topic);
	}
	
/*public List<Topic> getAllTopic() {
	
		return  Arrays.asList(
				new Topic(1 ,"topocel 1","for test only"),
				
				new Topic(13 ,"topocdf 1","for tfdest only"),
				new Topic(4 , "topoc 1","fdor test only")
						)	;
	
}*/
	
	
		
		
	}
