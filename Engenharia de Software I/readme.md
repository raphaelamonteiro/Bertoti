# Aula I
We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. 
In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. 
Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

## Comentário:
Baseado no trecho, é possível notar que a engenharia de software, embora semelhante á área da programação possui características distintas, pois é mais relacionada ao tempo, escala e trade-offs, além da tomada de decisões mais complexas baseadas em estimativas imprecisas.
Um engenheiro de software, tem que pensar em quais linguagens vão atender melhor a demanda e também suportar as melhorias que virão com o tempo sendo elas complexas ou não, onde essa tecnologia consiga ter um desempenho bom e capacidade de escalabilidade, sendo uma decisão extremamente difícil e complexa, as vezes demandando investimentos mais altos, mas que se pagam em pouco tempo devido a capacidade da tecnologia de lidar com a problemática proposta.

# Aula II (continuação)
Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). 
The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

## Comentário 
Sabe-se que a programação está diretamente relacionada á engenharia de software, e de fato, a programação é extremamente importante para um engenheiro de software. 
Entretanto, não pode-se resumir á isso, pois a engenharia de software não é programação, assim como cubos não são quadrados. 
A engenharia de software não está apenas relacionada á criar um novo software, mas também, ao desenvolvimento, modificação e manutenção do mesmo. 
É de extrema importância compreender que certas funcionalidades da sua aplicação funcionam melhor em certas linguagem, e  é preciso desenvolver elas de forma que elas consiga comunicar entre si
A engenharia de software abrange muito mais que a programação, é muito mais que somente solucionar algum problema atráves de um código, é pensar quais melhores tecnologias para ter essa resolução, se essa tecnologia consegue se adaptar as possíveis demandas e mudanças do futuro e pensar além da solução mais fácil ou mais barata, é documentar o que o sistema precisa fazer e como ele vai fazer, é ter uma metologia de descrever requisitos, regras de negocio para se ter um desenvolvimento de um software de qualidade e que todos os programadores consigam trabalhar de maneiram mais coesa e eficiente.

# Aula III
## Exemplos de trade-offs com requisitos não funcionais
### 1. Desempenho vs. Segurança
Trade-off: Para melhorar o desempenho, o desenvolvedor opta por minimizar a complexidade dos processos de criptografia ou reduzir o número de verificações de segurança.
Entretanto, isso pode diminuir a segurança do sistema, tornando-o mais vulnerável a ataques.

### 2. Usabilidade vs. Segurança
Trade-off: Tornar o sistema extremamente seguro, com a implementação de múltiplas camadas de segurança (como autenticação biométrica, códigos de verificação etc.) pode tornar a experiência do usuário mais complexa e frustrante, prejudicando a usabilidade e tornando o sistema mais difícil de ser acessado, levando os usuários a evitarem o uso adequado da ferramenta e uma possível perda de clientes. 

### 3. Disponibilidade vs. Manutenibilidade
Trade-off: Para garantir alta disponibilidade do sistema, é possível reduzir a frequência de manutenções e atualizações, o que, por sua vez, pode tornar o sistema mais difícil de manter e atualizar no longo prazo, além de acumular dívidas técnicas.

###  4. Custo vs. Desempenho
Trade-off: Com um orçamento limitado reduzir custos pode significar optar por infraestrutura de menor desempenho, como servidores mais baratos ou menos redundância, o que pode impactar o tempo de resposta do sistema e seu desempenho.

####  5. Desempenho vs. Facilidade de Desenvolvimento (C++ vs. Python)
C++ é uma linguagem de baixo nível que permite um controle fino sobre recursos e memória, o que pode resultar em um desempenho extremamente alto. 

No entanto, isso também torna o desenvolvimento mais complexo e propenso a erros, como vazamentos de memória.
Python, por outro lado, é uma linguagem de alto nível, fácil de aprender e usar, e permite um desenvolvimento mais rápido e com menos código. 

Trade-off: 
- **Escolhendo C++:** Você ganha em desempenho e controle sobre o hardware, o que é crucial para aplicações que exigem alta eficiência e precisam lidar com recursos limitados, como jogos, sistemas embarcados, e software de tempo real. Porém, o desenvolvimento se torna mais complexo, exigindo mais esforço para gerenciar a memória manualmente, depurar problemas de alocação e lidar com detalhes de baixo nível. Isso aumenta a chance de erros como vazamentos de memória e torna o código mais difícil de manter.

- **Escolhendo Python:** Você sacrifica o desempenho e o controle fino dos recursos, mas ganha em facilidade e velocidade de desenvolvimento. Python é mais simples, com uma sintaxe mais limpa e uma grande quantidade de bibliotecas prontas para uso, o que acelera o processo de criação de protótipos e desenvolvimento de aplicações. No entanto, para aplicações que exigem desempenho máximo, Python pode não ser a melhor escolha, pois sua execução é mais lenta em comparação a C++.

## Atividade III:
Analisar os trade-offs de requisitos não-funcionais utilizados por uma arquitetura de empresa que utiliza tecnologia (exemplo: Netflix)

### Empresa escolhida: Spotify 

Sobre a empresa: O Spotify é um serviço de streaming de áudio e que possui popularidade global. 
Com uma plataforma de **milhões de utilizadores, milhões de horas de episódios de podcasts e de mais de 70 milhões de músicas, é uma das plataformas de streaming com mais sucesso mundialmente, com aproximadamente 356 milhões de utilizadores, 158 milhões dos quais são utilizadores com uma subscrição premium paga.** 

O Spotify veio revolucionar a maneira como a música era distribuída aos utilizadores, e à medida que começaram a aparecer novas tecnologias, como a forma como são transmitidos os dados, codificação das músicas, etc, o Spotify foi-se adaptando e hoje em dia é **considerado dos melhores e maiores serviços de streaming de música.**

Arquitetura: 
O Spotify usa arquitetura cliente-servidor para clientes móveis, e uma **rede peer-to-peer (P2P)** para os restantes clientes. Desta forma, os utilizadores fazem download do conteúdo e partilham uns com os outros.

Analisar os trade-offs dos requisitos não-funcionais utilizados pela arquitetura do Spotify envolve avaliar como a empresa 
equilibra diferentes aspectos do sistema para oferecer uma experiência robusta e escalável aos usuários. 

### 1. **Escalabilidade**
   **Descrição**: A capacidade de lidar com um grande número de usuários e aumentar ou diminuir recursos conforme necessário.
   **Trade-offs**:
   - **Prós**:
     - O Spotify precisa de uma arquitetura altamente escalável para suportar milhões de usuários simultâneos, especialmente durante picos de uso.
     - O uso de microservices e de uma arquitetura distribuída permite a escalabilidade horizontal, onde serviços podem ser escalados independentemente.
   - **Contras**:
     - Uma arquitetura escalável muitas vezes é mais complexa de desenvolver e manter, exigindo habilidades avançadas de engenharia.
     - Pode haver uma sobrecarga adicional em termos de comunicação e coordenação entre microservices, o que pode introduzir latência.

### 2. **Disponibilidade**
   **Descrição**: A capacidade do sistema de estar disponível e operacional o máximo de tempo possível.
   **Trade-offs**:
   - **Prós**:
     - Alta disponibilidade é crítica para garantir que os usuários possam acessar o serviço a qualquer momento, de qualquer lugar.
     - A arquitetura distribuída com redundância e failover automático contribui para uma alta disponibilidade.
   - **Contras**:
     - Para garantir alta disponibilidade, a arquitetura precisa ser projetada para lidar com falhas, o que pode aumentar a complexidade e os custos de infraestrutura.
     - A implementação de estratégias de recuperação de desastres e redundância pode aumentar a sobrecarga e o consumo de recursos.

### 3. **Desempenho e Latência**
   **Descrição**: O tempo que o sistema leva para responder a solicitações e fornecer conteúdo aos usuários.
   **Trade-offs**:
   - **Prós**:
     - O Spotify deve fornecer uma experiência de streaming rápida e sem interrupções, o que requer baixa latência e alto desempenho.
     - O uso de CDN (Content Delivery Networks) e cache distribuído ajuda a reduzir a latência para usuários globalmente.
   - **Contras**:
     - Para alcançar baixa latência, pode ser necessário replicar dados em vários locais, o que aumenta a complexidade e o custo de sincronização de dados.
     - Melhorar o desempenho pode significar comprometer a consistência imediata em sistemas distribuídos, optando por consistência eventual em algumas situações.

### 4. **Resiliência**
   **Descrição**: A capacidade do sistema de se recuperar de falhas e continuar operando normalmente.
   **Trade-offs**:
   - **Prós**:
     - Resiliência é essencial para garantir que o Spotify continue funcionando mesmo em caso de falhas de componentes individuais ou ataques.
     - Mecanismos como Circuit Breaker, retries e fallback garantem que o sistema se recupere de falhas temporárias.
   - **Contras**:
     - Implementar resiliência adiciona complexidade ao código e pode introduzir latências adicionais quando circuit breakers são acionados.
     - Sistemas resilientes podem exigir mais recursos (CPU, memória, etc.) para lidar com a recuperação de falhas.

### 5. **Manutenibilidade**
   **Descrição**: A facilidade com que o sistema pode ser mantido, corrigido e atualizado.
   **Trade-offs**:
   - **Prós**:
     - A adoção de microservices e arquitetura modular aumenta a manutenibilidade, permitindo que equipes independentes trabalhem em diferentes partes do sistema.
     - Atualizações e correções podem ser realizadas em serviços específicos sem impactar o sistema como um todo.
   - **Contras**:
     - A alta manutenibilidade em uma arquitetura de microservices pode vir ao custo de maior complexidade operacional e sobrecarga na gestão de dependências entre serviços.
     - Há um trade-off entre a simplicidade e a divisão granular dos serviços, que pode tornar a manutenção mais difícil se não for bem gerenciada.

### 6. **Consistência**
   **Descrição**: Garantir que todos os dados sejam consistentes em todo o sistema, especialmente em um ambiente distribuído.
   **Trade-offs**:
   - **Prós**:
     - Consistência forte garante que todos os usuários vejam o mesmo estado dos dados simultaneamente, o que é crucial para certos cenários, como gerenciamento de playlists e contagem de reproduções.
   - **Contras**:
     - Em um sistema distribuído, alcançar consistência forte pode afetar a disponibilidade e o desempenho devido à latência na comunicação entre diferentes datacenters.
     - Muitas vezes, o Spotify opta por consistência eventual para melhorar a escalabilidade e desempenho, aceitando que os dados possam estar temporariamente inconsistentes.

### 7. **Segurança**
   **Descrição**: Proteção do sistema contra acessos não autorizados e ataques.
   **Trade-offs**:
   - **Prós**:
     - Segurança é fundamental para proteger dados dos usuários e garantir conformidade com regulações de privacidade.
     - Medidas como criptografia de dados em trânsito e em repouso, autenticação multifator, e monitoramento contínuo são essenciais.
   - **Contras**:
     - Medidas de segurança adicionais podem aumentar a latência e reduzir a experiência do usuário, como a necessidade de autenticação adicional.
     - Implementar segurança robusta pode aumentar a complexidade e custo de desenvolvimento e operação.

### Conclusão
A arquitetura do Spotify precisa equilibrar cuidadosamente esses requisitos não-funcionais para garantir uma experiência de usuário de alta qualidade. Cada decisão sobre escalabilidade, disponibilidade, desempenho, resiliência, manutenibilidade, consistência e segurança envolve trade-offs que impactam o sistema de maneiras diferentes. A chave para o sucesso do Spotify é gerenciar esses trade-offs de maneira eficaz para atender às expectativas dos usuários enquanto mantém a operação do serviço a nível global.

| Identificação | Requisito não funcional |
|--- |--- |
|RNF 01	| sistema de autenticação de usuário (Segurança)|
|RNF 02	| Serviço de busca(base de dados)|
|RNF 03	| Telas de interação responsivas(usabilidade)|
|RNF 04	| Integração spotify e facebook()|
|RNF 05	| Interface simples e interativa ao usuário (usabilidade)|
|RNF 06	| Vinhetas durante a programação musical para quem está no modelo “Free”|
|RNF 07	| Limitações de uso ao plano gratuito(usabilidade-controle de liberdade de usuário)|
|RNF 08	| Vincular contas com PSN.|
  


##
# Anotações:
Trade-off são as escolhas e as renúncias que vem com elas, que todo engenheiro de software precisa fazer durante o planejamento, desenvolvimento e manutenção de um software. Um exemplo clássico de trade-off é a escolha da linguagem de programação a ser utilizada durante o desenvolvimento, cada linguagem possui suas vantagens e desvantagens, e é necessário analizar as necessidades do cliente e fazer a escolha que melhor as atenda, para que o software consiga realizar o seu propósito.

### Processo de trade-off de arquitetura de software:
1. Identificação de Requisitos e Restrições:
- Identificação de requisitos funcionais e não funcionais do sistema.
- Considere as restrições de recursos, como orçamento, tempo, tecnologias disponíveis e conhecimento da equipe.

2. Análise de Requisitos Conflitantes:
- Identificação dos requisitos que podem entrar em conflito ou competir entre si.
- Por exemplo, pode haver um trade-off entre desempenho e consumo de recursos, ou entre flexibilidade e simplicidade.

3. Priorização de Requisitos:
- Classificação dos requisitos de acordo com sua importância e impacto no sistema.
- Determine quais requisitos são críticos e quais podem ser negociados ou ajustados.

4. Avaliação de Alternativas:
- Explorar diferentes abordagens para atender aos requisitos.
- Considere alternativas de design que abordem os trade-offs identificados.

5. Análise de Impacto:
- Avaliar o impacto de cada alternativa nos requisitos e nas restrições.
- Considere como as escolhas afetarão o desempenho, a segurança, a manutenibilidade, entre outros atributos.

6. Modelagem e Simulação:
- Utilizar técnicas de modelagem e simulação para prever o comportamento do sistema sob diferentes condições.
- Isso pode incluir modelagem de desempenho, análise de riscos, entre outras abordagens.

7. Tomada de Decisão:
- Com base na análise, tomar decisões informadas sobre a arquitetura do sistema.
- Se necessário, envolva partes interessadas para validar as escolhas e obter feedback.

8. Documentação e Comunicação:
- Registro das decisões de arquitetura, destacando os trade-offs feitos.

9. Avaliação Contínua:
- Reavaliar periodicamente as decisões de arquitetura à medida que o projeto progride e novas informações se tornam disponíveis.
- é de extrema imprtância estar sempre preparado para ajustar a arquitetura conforme necessário.

### O processo de trade-off de arquitetura de software é uma parte essencial do desenvolvimento de sistemas complexos e ajuda a garantir que as decisões tomadas estejam alinhadas com os objetivos do projeto e as restrições existentes.
fonte: https://pt.linkedin.com/pulse/trade-off-cada-escolha-%C3%A9-uma-ren%C3%BAncia-cleber-da-silveira-wfupf

### Requisitos (necessidades do cliente):
- Funcionais: tarefas e ações do sistema, geralmente exemplificadas por verbos (exemplo: realizar cadastro)
- Não funcionais: qualidades do sistema (exemplo: portabilidade)
