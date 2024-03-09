package me.kirenai.re.r2dbch2.router;

import me.kirenai.re.r2dbch2.handler.CustomerHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class CustomerRouter {

    @Bean
    public RouterFunction<ServerResponse> routerFunction(CustomerHandler customerHandler) {
        return RouterFunctions.route()
                .POST(customerHandler::create)
                .build();
    }

}
