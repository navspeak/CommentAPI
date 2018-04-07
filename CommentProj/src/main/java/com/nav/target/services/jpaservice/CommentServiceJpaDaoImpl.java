package com.nav.target.services.jpaservice;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.nav.target.domain.Comment;
import com.nav.target.services.CommentService;

@Service
@Profile("jpa")
public class CommentServiceJpaDaoImpl extends AbstractJpaService implements CommentService{

	@Override
	public List<Comment> listAll() {
		EntityManager em = emf.createEntityManager();
		return em.createQuery("from Comment", Comment.class).getResultList();
	}

	@Override
	public Comment getById(Integer id) {;
		EntityManager em = emf.createEntityManager();
		return em.find(Comment.class, id);
	}

	@Override
	public Comment saveOrUpdate(Comment domainObject) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Comment savedComment = em.merge(domainObject);
        em.getTransaction().commit();
        return savedComment;
	}

	@Override
	public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.remove(em.find(Comment.class, id));
        em.getTransaction().commit();
	}


}
