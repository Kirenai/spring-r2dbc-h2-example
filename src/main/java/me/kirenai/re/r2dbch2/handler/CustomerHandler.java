package me.kirenai.re.r2dbch2.handler;

import lombok.RequiredArgsConstructor;
import me.kirenai.re.r2dbch2.entity.Customer;
import me.kirenai.re.r2dbch2.repository.CustomerRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.status;

@Component
@RequiredArgsConstructor
public class CustomerHandler {

    private final CustomerRepository customerRepository;

    public Mono<ServerResponse> create(ServerRequest serverRequest) {
        return serverRequest.bodyToMono(Customer.class)
                .flatMap(this.customerRepository::save)
                .flatMap(customer -> status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).bodyValue(customer));
    }

}
