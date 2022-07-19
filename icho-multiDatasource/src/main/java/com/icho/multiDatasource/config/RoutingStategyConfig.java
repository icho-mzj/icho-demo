package com.icho.multiDatasource.config;

import com.icho.multiDatasource.core.ITulingRouting;
import com.icho.multiDatasource.core.RoutingDsAndTbStrategy;
import com.icho.multiDatasource.core.RoutingDsStrategy;
import com.icho.multiDatasource.core.RoutingTbStategy;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by smlz on 2019/4/17.
 */
@Configuration
public class RoutingStategyConfig {

    @Bean
    @ConditionalOnProperty(prefix = "tuling.dsroutingset",name = "routingStategy",havingValue ="ROUTING_DS_TABLE_STATEGY")
    public ITulingRouting routingDsAndTbStrategy() {
        return new RoutingDsAndTbStrategy();
    }

    @Bean
    @ConditionalOnProperty(prefix = "tuling.dsroutingset",name = "routingStategy",havingValue ="ROUTGING_DS_STATEGY")
    public ITulingRouting routingDsStrategy() {
        return new RoutingDsStrategy();
    }

    @Bean
    @ConditionalOnProperty(prefix = "tuling.dsroutingset",name = "routingStategy",havingValue ="ROUTGIN_TABLE_STATEGY")
    public ITulingRouting routingTbStategy() {
        return new RoutingTbStategy();
    }
}
