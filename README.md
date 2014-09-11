COMMIT "Troca de template e adequação para angularJS"

- Troca do templante para templante com menu responsivo;
- index.html com acesso já ao restfull webservice;

QUESTÕES QUE SURGIRAM:

- Fazer template com o bootstrap eh um cú, teria que pesquisar se tem uma solução melhor, ex. Express.
- Para minimizar uma possível separação de módulos no futuro, fiz uma interface para entidade, sugestões?
- O cadu deu a ideia de usarmos um serviço na nuvem, sugestões?
 
Deêm uma olhada no código q parece foda no começo mas eh dah hora pra caralho qdo vc entende como funciona.

COMMIT SERVIÇO INICIAL

- criação do primeiro serviço: listagem de metas
- busca das metas via angular e criação dos controlers em js
- configuração do plugin do maven flyway e criação da tabela tab_meta
- criação do pacote infraestrutura e adição das exceptions
