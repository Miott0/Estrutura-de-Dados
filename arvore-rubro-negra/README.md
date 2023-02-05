# Árvore Rubro Negra

### Propriedades
Árvore rubro-negra é um modelo de árvore de busca binária onde o nó possui um campo
extra: cor (vermelha ou preta). As cores do nós são restringidas da raiz até a ultima folha. Essa
estrutura assegura que a árvore será balanceada, onde o comprimento dos seus caminhos não
seja maior que duas vezes o de qualquer outro caminho que ela possua - 2log(n+1).
Cada nó possui os atributos: cor, chave, esquerda, direita e pai. Se um nó pai ou filho não
existir, o ponteiro apontará para Nil(nulo).
Para ser uma árvore rubro-negra ela precisa seguir algumas propriedades

• Todo nó tem que ser vermelho ou preto.

• A raiz sempre será preta.

• Toda folha Nil (nulo) é preta.

• Se um nó é vermelho, seus filhos são pretos.

• Para cada nó, todos os caminhos simples do nó até folhas descendentes contêm o
mesmo número de nós pretos.

### Rotação
Operações de insert e delete que são feitas em uma árvore comum, modificam a estrutura da
árvore. Acontece que quando a árvore sofre essas alterações pode acabar acontecendo que
viole a regra das cores. Para que esse problema não ocorra, devemos mudar a estrutura dos
ponteiros. Essa mudança é feita através da rotação, criando métodos locais. Existem dois tipos
de rotação: Para direita e para esquerda

### Inserção
A inserção na árvore rubro-negra de n nós no tempo O(log n). Para inserir o no na árvore como
se ela fosse uma árvore binária comum e depois colorimos o nó de vermelho. Para garantir
que a propriedade de cores, é um usado um procedimento para recolorir de novamente os nós
e executar as rotações

### Remoção
A remoção se inicia como em outras árvores binárias convencionais. Então após a
remoção é possível que a propriedade das cores fique alterada e a árvore fique
desbalanceada, sendo necessário fazer a fixação das suas posições.
Se a remoção for feita em nó vermelho, a integridade da árvore e suas propriedades não
serão afetadas. Caso seja um nó preto, em pelo menos um caminho a quantidade de nó
pretas será afetada o que vai desbalancear a árvore, assim algumas operações de
rotações e trocas de cores deveram ser realizadas para “concertar” a árvore. A remoção
de um nó pode ocorrer quando esse nó tenha no máximo um filho que não seja folha.
