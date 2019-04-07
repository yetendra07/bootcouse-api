package oi.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class TopicService {

	
	
	private List<Topic> topics= new ArrayList<>( Arrays.asList(
					new Topic("spring" ,"spring MVC","for test only"),
					new Topic("java" ,"java 8","lemda expresion"),
					new Topic("python", "scripting","with R langauge")
					)	);
	
	public List<Topic> getAllTopic() {
	return topics;
	}
	
	public Topic getTopic( String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();// @formatter:off
		 
		// @formatter:on

		}
	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String id, Topic topic) {
		
		//for(int i:topics) {
for(int i=0; i <topics.size(); i++) {
	//	String ids1=t.getId();
	Topic t=topics.get(i);
	
	if(t.getId().equals(id)) {
				topics.set(i, topic);
				
				
			}
			
		}
	}

	public void deleteTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0; i <topics.size(); i++) {
			
			Topic t=topics.get(i);
			
			if(t.getId().equals(id)) {
						topics.remove(i);
						
						
					}
					
				}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}




