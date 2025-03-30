# Validação Processo Seletivo

Este repositório foi criado com fins de estudo da linguagem Java, abordando conceitos fundamentais como exceções personalizadas, controle de fluxo, e manipulação de dados. Os exemplos aqui apresentados simulam cenários práticos, como validação de parâmetros e seleção de candidatos em um processo seletivo.

## Estrutura do Projeto

### 1. `Contador.java`

Este arquivo implementa uma lógica de contagem entre dois números fornecidos pelo usuário. Os principais conceitos abordados são:

- **Exceções Personalizadas**: A classe `ParametrosInvalidosException` é utilizada para validar se o segundo parâmetro é maior que o primeiro.
- **Controle de Fluxo**: Uso de estruturas como `try-catch` para tratar exceções e `for` para realizar a contagem.

### 2. `ParametrosInvalidosException.java`

Uma classe simples que estende `Exception`, representando uma exceção personalizada. Este conceito é útil para criar mensagens de erro específicas e melhorar a legibilidade do código.

### 3. `processoSeletivo.java`

Este arquivo simula um processo seletivo, abordando os seguintes conceitos:

- **Geradores Aleatórios**: Uso da classe `ThreadLocalRandom` para gerar valores de salário pretendido.
- **Controle de Fluxo**: Estruturas como `while` e `if-else` são utilizadas para selecionar candidatos com base em critérios definidos.
- **Métodos Estáticos e Não Estáticos**: Demonstra a diferença entre métodos que pertencem à classe e métodos que pertencem a instâncias.

## Como Executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado.
2. Compile os arquivos `.java` com o comando:
   ```bash
   javac -d bin src/**/*.java
   ```
3. Execute as classes principais:
   ```bash
   java -cp bin contador.Contador
   java -cp bin processoseletivo.candidatura.processoSeletivo
   ```

## Contribuição

Este repositório é apenas para fins de estudo. Sinta-se à vontade para explorar, modificar e aprender com os exemplos apresentados.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
