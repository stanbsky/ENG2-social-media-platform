package uk.ac.york.eng2.thm.controllers;

import com.google.common.collect.Multimap;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.ac.york.eng2.thm.dto.Top10DTO;
import uk.ac.york.eng2.thm.events.HashtagIQS;

@Controller("/trending")
public class TrendingController {

    private static final Logger logger = LoggerFactory.getLogger(TrendingController.class);

    @Inject
    private HashtagIQS hashtagIQS;

    @Get("/")
    public Top10DTO getTop10() {
        Multimap<Long, Long> counts = hashtagIQS.getHashtagCounts();
        logger.warn("counts: {}", counts);
        return new Top10DTO(counts);
    /*public LinkedHashMap<Long, List<Long>> getTop10() {
        Multimap<Long, Long> counts = hashtagIQS.getHashtagCounts();
        logger.warn("counts: {}", counts);
        LinkedHashMap<Long, List<Long>> result = new LinkedHashMap<>();
        for (Long key : counts.keySet()) {
            Collection<Long> values = counts.get(key);
            result.put(key, new ArrayList<>(values));
        }
        return result;*/
//        Multimap<Long, Long> map = MultimapBuilder.treeKeys(Collections.reverseOrder()).arrayListValues().build();
//        map.put
//
//
//        return counts.entrySet().stream()
//                .limit(10)
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, HashMap::new));
    }
}
