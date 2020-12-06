package com.patterns.movietickets.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.patterns.movietickets.dao.TicketDao;
import com.patterns.movietickets.bo.Ticket;


@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketDao dao;

	@Override
	public void purchaseTicket(Ticket ticket) {
		// Process Payment
		com.patterns.movietickets.entities.Ticket ticketEntity = new com.patterns.movietickets.entities.Ticket();
		//ticketEntity.setId(ticket.getId());
		ticketEntity.setMovie(ticket.getMovieName());
		ticketEntity.setScreen(ticket.getScreenNo());
		ticketEntity.setSeat(ticket.getSeatNo());
		dao.create(ticketEntity);
		// Email Ticket or Text Message the ticket
	}

}
