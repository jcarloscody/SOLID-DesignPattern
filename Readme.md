# SOLID

## **Princípios de Orientação a Objetos**
- Coesão
- Encapsulamento
- Acoplamento

## `Coesão`
- união harmônica entre uma coisa e outra
- [Classe Funcionario]()
- classes ñ coesas tendem a crescer indefinitivamente, o que as tornam difíceis de manter
-  Cada classe deve ser responsável por apenas uma coisa, e deve executar esta tarefa muito bem

## `Encapsulamento`
- Incluir ou proteger alguma coisa em uma cápsula.
- é blindar uma classe evitando influências externas nos seus dados.
- classes ñ encapsuladas viola regras de negócios.
- O fato de criar getters e setters para tudo, na verdade, quebra o encapsulamento da nossa classe.
- Ao encapsular o acesso a determinados dados, liberando acesso apenas ao necessário, os objetos da nossa classe se tornam mais fáceis de serem utilizados.

## `Acoplamento`
- ação de acoplar. agrupamento aos pares.
- é a ideia de termos dois componentes que estão interligados entre si, causando uma dependencias entre eles. uma classe A que chama outra classe B.
- a problematica se dar quando uma classe depende muito de outra e qualquer mudança gera um impacto muito forte. 
- classes acopladas causam fragilidade no código da aplicação, o que dificulta sua manutenção.
- É fato que, se estamos organizando o nosso código, seguindo as recomendações da orientação a objetos, algum acoplamento acontecerá. Algumas classes precisarão de outras, para que não tenham muitas responsabilidades. Cabe a nós medir quando faz sentido adicionar tal acoplamento com as dependências e como depender do que é seguro, ao invés de classes concretas


## `S -> Single  Responsibility principle, Princípio da Responsabilidade única`
- uma classe deveria ter apenas um único motivo para mudar. - Robert Martin


## `O -> `