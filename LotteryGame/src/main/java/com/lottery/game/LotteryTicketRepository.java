package com.lottery.game;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Tauheed yar khan
 * Simple In memory Database Responsitory for holding the data.
 * Could be extended to provide different implementations.
 **/
public interface LotteryTicketRepository extends CrudRepository<LotteryTicket,Long>  {

}
