# Decorator - Açaí

Ao comprar açaí, podemos adicionar complementos como leite em pó, banana, morango, mousse de maracujá, granulado, granola, leite condensado, entre outros. Cada adicional possui um custo adicional, que precisa ser lançado no sistema. Para evitar a criação de inúmeras combinações de açaí com diferentes adicionais, podemos utilizar o padrão de projeto Decorator.

Com o Decorator, começamos com um objeto base representando o açaí simples e, em tempo de execução, podemos “decorar” este objeto adicionando os complementos desejados.

## Requisitos

1. Crie uma interface `Adicional` com os métodos `getDescricao()` e `custo()`.
2. Crie uma classe `Acai` que implementa `Adicional`.
3. Crie uma classe `BaseDecorator` que implementa `Adicional` e contém um atributo `Adicional` chamado `wrappee`.
4. Crie as classes `Morango`, `Banana` e `LeiteCondensado` que estendem `BaseDecorator` e sobrescrevem os métodos `getDescricao()` e `custo()`.
5. Crie uma classe `TestaDecorator` para testar o padrão:
   - Crie um objeto `Adicional` que representa um Açaí simples.
   - Crie um objeto `Adicional` que adiciona `Morango` ao Açaí.
   - Crie um objeto `Adicional` que adiciona `Morango`, `Leite Condensado` e `Banana` ao Açaí.
