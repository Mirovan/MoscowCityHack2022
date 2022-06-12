package ru.bigint.webapp.service.iface.channel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.bigint.webapp.data.entity.Channel;

import java.util.List;

public interface ChannelService {
    Channel getById(Integer id);
    Channel add(Channel channel);
    Channel update(Channel channel);
    List<Channel> getAll();

    Page<Channel> findByParam(
            Integer followersFrom,
            Integer followersTo,
            Integer fromAge,
            Integer toAge,
            Pageable pageable);

    List<Channel> findByParamStub(Integer categoryId, Integer ageFrom, Integer ageTo);
}
