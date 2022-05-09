package net.anisan;

import io.micronaut.http.annotation.*;

@Controller("/demoapp")
public class DemoappController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}