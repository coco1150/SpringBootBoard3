package com.mysite.sbb.question;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
	Question findBySubject(String subject);

	Question findBySubjectAndContent(String subject, String content);

	List<Question> findBySubjectLike(String subject);

	Page<Question> findAll(Pageable pageable);

	@Query("select q from Question q " + "left join fetch q.author " +"left join fetch q.answerList a " + "left join fetch a.user " + "where q.id = :id")
	Optional<Question> findByIdWithAnswersAndAuthor(@Param("id") Integer id);
}
