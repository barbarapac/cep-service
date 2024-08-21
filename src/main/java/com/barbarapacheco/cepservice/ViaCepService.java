package com.barbarapacheco.cepservice;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;

@Dependent //@Alternative
@Named(value = "ViaCepService")
public class ViaCepService extends AbstractCepService {

    public ViaCepService() {
        super("https://viacep.com.br");
    }

    @Override
    protected String buildPath(String cep) {
        return String.format("ws/%s/json", cep);
    }    
}
