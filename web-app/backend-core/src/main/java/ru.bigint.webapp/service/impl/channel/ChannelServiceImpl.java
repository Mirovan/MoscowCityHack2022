package ru.bigint.webapp.service.impl.channel;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.bigint.webapp.data.dao.channel.ChannelDAO;
import ru.bigint.webapp.data.entity.Category;
import ru.bigint.webapp.data.entity.Channel;
import ru.bigint.webapp.data.stub.ChannelStub;
import ru.bigint.webapp.service.iface.channel.ChannelService;

import java.util.List;
import java.util.stream.Collectors;

@Service
//("categoryService")
public class ChannelServiceImpl implements ChannelService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private final ChannelDAO channelDAO;

    public ChannelServiceImpl(ChannelDAO channelDAO) {
        this.channelDAO = channelDAO;
    }

    @Override
    public Channel getById(Integer id) {
        return channelDAO.findById(id).get();
    }

    @Override
    public Channel add(Channel channel) {
        channel = channelDAO.save(channel);
        return channel;
    }

    @Override
    public Channel update(Channel channel) {
        channel = channelDAO.save(channel);
        return channel;
    }

    @Override
    public List<Channel> getAll() {
        return channelDAO.findAll();
    }

    @Override
    public Page<Channel> findByParam(
            Integer followersFrom,
            Integer followersTo,
            Integer fromAge,
            Integer toAge,
            Pageable pageable) {
        return null;
    }

    @Override
    public List<Channel> findByParamStub(Integer categoryId, Integer ageFrom, Integer ageTo) {
        return ChannelStub.channels.stream()
                .filter(item -> ageFrom == null || item.getAge() >= ageFrom)
                .filter(item -> ageTo == null || item.getAge() <= ageTo)
                .filter(item -> categoryId == null || item.getCategories().stream()
                        .map(Category::getId)
                        .collect(Collectors.toList())
                        .contains(categoryId)
                )
                .collect(Collectors.toList());
    }
}