package com.Microservices.UsuarioSevice.controller.base;

import an.awesome.pipelinr.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseController {

    @Autowired
    protected Pipeline pipeline;

    protected <R> R send(Object request) {
        return pipeline.send(request);
    }
}
