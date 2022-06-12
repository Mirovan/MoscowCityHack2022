package ru.bigint.webapp.data.stub;

import ru.bigint.webapp.data.entity.Category;
import ru.bigint.webapp.data.entity.Channel;

import java.util.ArrayList;
import java.util.List;

/**
 * ToDo: заглушка данных из БД
 */
public class ChannelStub {
    public static List<Channel> channels = List.of(
            new Channel("https://www.youtube.com/c/glebzadoya", "Глеб Задоя", 165000, 38, 2011,
                    List.of(
                            new Category(1, "Инвестиции")
                    )
            ),
            new Channel("https://www.youtube.com/c/СложныйПроцент", "Сложный Процент", 215000, 35, 2020,
                    List.of(
                            new Category(1, "Инвестиции")
                    )
            ),
            new Channel("https://www.youtube.com/c/NikolayMrochkovskiy", "Nikolay Mrochkovskiy", 729000, 37, 2008,
                    List.of(
                            new Category(1, "Инвестиции")
                    )
            ),
            new Channel("https://www.youtube.com/c/ДзенИнвестиции", "Дзен Инвестиции", 30100, 41, 2019,
                    List.of(
                            new Category(1, "Инвестиции")
                    )
            ),
            new Channel("https://www.youtube.com/channel/UCNajB3rUWROLopY8T1nJVtg", "Smarent Pro недвижимость", 45000, 29, 2019,
                    List.of(
                            new Category(2, "Недвижимость")
                    )
            ),
            new Channel("https://www.youtube.com/channel/UCaiIVOMZJVeWsFTAjY5xKLA", "MaxCapital", 92700, 44, 2013,
                    List.of(
                            new Category(1, "Инвестиции"),
                            new Category(2, "Недвижимость")
                    )
            ),
            new Channel("https://www.youtube.com/c/ИНВЕСТИЦЫН", "ИНВЕСТИЦЫН", 64100, 36, 2017,
                    List.of(
                            new Category(1, "Инвестиции")
                    )
            ),
             new Channel("https://www.youtube.com/c/АССЕНИЗАТОР", "АССЕНИЗАТОР", 432000, 65, 2019,
                    List.of(
                            new Category(1, "Инвестиции"),
                            new Category(2, "Недвижимость"),
                            new Category(3, "Интервью"),
                            new Category(4, "Политика"),
                            new Category(5, "Развлечения")
                    )
            ),
             new Channel("https://www.youtube.com/channel/UCOIM-iky4-e3k8h-O2CBOwg", "Простая Heдвижимость", 50500, 53, 2019,
                    List.of(
                            new Category(2, "Недвижимость")
                    )
            ),
            new Channel("https://www.youtube.com/c/ХОЧУКВАРТИРУ", "#ХОЧУКВАРТИРУ", 46600, 42, 2016,
                    List.of(
                            new Category(1, "Инвестиции"),
                            new Category(2, "Недвижимость")
                    )
            ),

            //ToDo: do


            new Channel("https://www.youtube.com/channel/UCbyO5fUKJOxA9ER0QNecLrA", "Задвижки по Недвижке", 437000, 42, 2011,
                    List.of(
                            new Category(1, "Инвестиции"),
                            new Category(2, "Недвижимость"),
                            new Category(3, "Интервью")
                    )
            )
    );
}
