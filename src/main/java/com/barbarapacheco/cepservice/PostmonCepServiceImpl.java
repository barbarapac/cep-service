package com.barbarapacheco.cepservice;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

@Dependent //@Alternative
@Named(value = "PostmonCepServiceImpl") 
public class PostmonCepServiceImpl extends AbstractCepService {

    public PostmonCepServiceImpl() {
        super("https://api.postmon.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("/v1/cep/%s", cep);
    }    
}
