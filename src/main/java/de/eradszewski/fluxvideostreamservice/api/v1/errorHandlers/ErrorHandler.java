package de.eradszewski.fluxvideostreamservice.api.v1.errorHandlers;

import de.eradszewski.fluxvideostreamservice.exceptions.VideoNotFoundException;
import de.eradszewski.fluxvideostreamservice.model.helpers.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ErrorHandler {

    public static Mono<ServerResponse> handleError(Throwable throwable) {
        if (throwable instanceof VideoNotFoundException)
            return handleNotFound();
        return ServerResponse.badRequest().build();
    }

    public static Mono<ServerResponse> handleNotFound() {

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
        String errorDate = dateFormat.format(new Date());
        Error errorResponse = Error.builder()
                .status(404)
                .error("Video not found")
                .timestamp(errorDate)
                .build();
        return ServerResponse.status(HttpStatus.NOT_FOUND)
                .contentType(MediaType.APPLICATION_JSON)
                .body(Mono.just(errorResponse), Error.class);
    }
}
