package com.sunbeam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.daos.ReviewDao;
import com.sunbeam.pojos.Review;


@Service
public class ReviewService {
	@Autowired
	private ReviewDao reviewDao;
	
	public List<Review> findAllReviews() {
		List<Review> list = reviewDao.findAll();
		return list;
	}

	public List<Review> findReviewsByUserId(int userId) {
		List<Review> list = reviewDao.findByUserId(userId);
		return list;
	}

	public Review findReviewById(int reviewId) {
		Review review = reviewDao.findById(reviewId);
		return review;
	}

	public int saveReview(Review review) {
		int count = reviewDao.save(review);
		return count;
	}

	public int deleteReviewById(int reviewId) {
		int count = reviewDao.deleteById(reviewId);
		return count;
	}
	
//	public int editreviewById(Review review)
//	{ 
//		int count = reviewDao.update(review);
//		return count;
//	}
//	
	
	public int updatereview(Review review) 
	{ 
		int count = reviewDao.update(review);
		return count;
	}
}














