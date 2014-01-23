package com.pietervaneeckhout.blog.dao.impl;

import com.pietervaneeckhout.blog.dao.postDAO;
import com.pietervaneeckhout.blog.model.Post;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pveeckhout
 */
@Repository
public class PostDAOImpl extends GenericDAOImpl<Post> implements postDAO {

    public PostDAOImpl() {
        super(Post.class);
    }
    
}
