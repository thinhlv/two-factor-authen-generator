package FAAuthenticator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by PC on 12/11/2017.
 */
@RestController
public class FAAuthenController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/faauthenticator")
    public FAAuthen greeting(@RequestParam(value="secret_key", defaultValue="NULL") String name) {
        return new FAAuthen(name);
    }
}
