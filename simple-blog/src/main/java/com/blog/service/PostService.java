package com.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.vo.Post;

@Service
public class PostService {
	private static List<Post> posts;

	public Post getPost(int id) {
		Post post = posts.get(id-1);
		
		return post;
	}
	
	public List<Post> getPosts() {
		posts = new ArrayList<>();
		posts.add(new Post(1L,"Mike", "Mike's Post", "Welcome to My Blog"));
		posts.add(new Post(2L,"Jason", "It's Jason", "Hi, My name is Jason"));
		
		return posts;
	}
}