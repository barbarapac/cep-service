# Consumo de Serviços de CEP com o Framework Quarkus
Atividade da disciplina de Arquitetura de Software com Framework Java.

## Descrição
Este projeto tem como objetivo demonstrar a injeção de dependências utilizando a especificação CDI (Contexts and Dependency Injection). São aplicadas anotações de escopo (como @Dependent, @RequestScoped, @SessionScoped ou @ApplicationScoped) para determinar qual classe de serviço de CEP será instanciada durante a injeção de dependência, como no exemplo: @Inject CepService cepService.

## Serviços utilizados:
- [Postmon API](https://api.postmon.com.br)
- [ViaCEP API](https://viacep.com.br)

## Requisitos para a compilação do projeto:
- Instalação IDE Apache NetBeans:
  > [Baixar NetBeans](https://netbeans.apache.org/front/main/download/)
- Instalação Apache Maven:
  > [Baixar Maven](https://maven.apache.org/download.cgi) (consulte este [vídeo tutorial](https://www.youtube.com/watch?v=-ucX5w8Zm8s) para suporte na instalação e configuração do Apache Maven.);
- Instalação Java JDK 21 ou superior:
  > [Baixar JDK](https://www.oracle.com/java/technologies/downloads/)

### Instruções para a execução do projeto:
- Abra o IDE NetBeans.
- Carregue o projeto na IDE: File -> Open Project.
- Após o carregamento, execute o build do projeto (clique com o botão direito sobre o nome do projeto e selecione Build).
- Na pasta raiz do projeto, abra o terminal e execute o comando: `mvn compile quarkus:dev`.
- O projeto será iniciado em http://localhost:8080/cep/cep_a_consultar.
