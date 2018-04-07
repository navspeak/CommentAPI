package com.nav.target.services.mapservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nav.target.domain.Comment;
import com.nav.target.domain.DomainObject;
import com.nav.target.exception.OffensiveCommentException;
import com.nav.target.services.CommentService;
import com.nav.target.strategy.ICommentValidation;

@Service
@Profile("map")
public class CommentServiceImpl extends AbstractMapService implements CommentService{
	
	@Autowired
	private ICommentValidation commentValidator;

	@Override
	public List<DomainObject> listAll() {
		return super.listAll();
	}

	@Override
	public Comment getById(Integer id) {
		return (Comment) super.getById(id);
	}

	@Override
	public Comment saveOrUpdate(Comment comment) {
		if (commentValidator.validateComment(comment) == false)
			throw new OffensiveCommentException();
		return (Comment) super.saveOrUpdate(comment);
	}

	@Override
	public void delete(Integer id) {
		super.delete(id);
	}


}
