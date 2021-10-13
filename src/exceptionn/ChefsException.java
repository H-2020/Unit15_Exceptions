package exceptionn;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChefsException extends Throwable {

    private LocalDateTime throwDateTime;

    public ChefsException(String message, LocalDateTime throwDateTime) {
        super(throwDateTime.toString() + message);
        this.throwDateTime = throwDateTime;
    }
}
