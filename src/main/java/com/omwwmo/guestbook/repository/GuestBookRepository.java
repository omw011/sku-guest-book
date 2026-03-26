package com.omwwmo.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omwwmo.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {

}
