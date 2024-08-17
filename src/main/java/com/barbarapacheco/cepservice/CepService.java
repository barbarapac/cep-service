package com.barbarapacheco.cepservice;

import com.barbarapacheco.model.Endereco;

public interface CepService {
    Endereco buscaEndereco(String cep);
}
