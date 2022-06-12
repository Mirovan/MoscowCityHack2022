package ru.bigint.webapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ru.bigint.webapp.data.entity.Channel;
import ru.bigint.webapp.data.entity.SearchQuery;
import ru.bigint.webapp.service.iface.channel.ChannelService;

import java.util.List;


@Controller
public class IndexController {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    private final ChannelService channelService;

    public IndexController(ChannelService channelService) {
        this.channelService = channelService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index(@RequestParam(required = false) Integer categoryId,
                              @RequestParam(required = false) Integer ageFrom,
                              @RequestParam(required = false) Integer ageTo
    ) {
        ModelAndView modelAndView = new ModelAndView();

        List<Channel> channels = channelService.findByParamStub(categoryId, ageFrom, ageTo);

        SearchQuery searchQuery = new SearchQuery();
        searchQuery.setAgeFrom(ageFrom);
        searchQuery.setAgeTo(ageTo);
        searchQuery.setCategoryId(categoryId);

        modelAndView.addObject("channels", channels);
        modelAndView.addObject("searchQuery", searchQuery);

        modelAndView.setViewName("index");
        return modelAndView;
    }

}
