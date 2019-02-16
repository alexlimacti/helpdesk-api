package com.indeas.helpdesk.api.reporitory;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.indeas.helpdesk.api.entity.ChangeStatus;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
	
	public Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatus(String ticketId);

	public Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String ticketId);

}
