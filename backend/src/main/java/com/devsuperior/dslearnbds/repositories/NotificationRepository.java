package com.devsuperior.dslearnbds.repositories;

import com.devsuperior.dslearnbds.dto.NotificationDTO;
import com.devsuperior.dslearnbds.entities.Course;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    Page<Notification> findByUser(User user, Pageable pageable);

    @Query("SELECT obj FROM Notification obj WHERE "
            + "(obj.user = :user) AND "
            + "(:unreadOnly = false OR obj.read = false) "
            + "ORDER BY obj.moment DESC")
    Page<Notification> find(User user, boolean unreadOnly, Pageable pageable);

}
