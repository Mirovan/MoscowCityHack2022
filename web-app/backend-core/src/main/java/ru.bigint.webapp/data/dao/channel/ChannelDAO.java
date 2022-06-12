package ru.bigint.webapp.data.dao.channel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.bigint.webapp.data.entity.Channel;

@Repository
        //("gameDAO")
public interface ChannelDAO extends JpaRepository<Channel, Integer>, JpaSpecificationExecutor<Channel> {
}