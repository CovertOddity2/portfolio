package com.pietervaneeckhout.blog.service.impl;

import com.pietervaneeckhout.blog.dao.impl.PostDAOImpl;
import com.pietervaneeckhout.blog.service.PostManager;
import com.pietervaneeckhout.blog.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostManagerImpl extends GenericManagerImpl<Post, PostDAOImpl> implements PostManager {
    
}