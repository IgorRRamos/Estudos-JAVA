/*
A inicialização de uma classe consiste na execução de seus inicializadores estáticos e os inicializadores para
staticcampos (variáveis de classe) declarados na classe. Os inicializadores estáticos são executados na ordem
em que aparecem no código fonte.
Considere o exemplo do código a seguir, quando a JVM inicializa o Mainclasse, primeiro inicializa todas as suas
superclasses, começando com Object- A . (í a questão: es. , , , íntepeo. . E. . es. sobre a questão .
(em, proprio, e os comandos e Desde então ObjectNão tem superclasse, a recursão pára por aí. Em seguida, a JVM
inicializa Mainexecutando os inicializadores de variáveis de classe e inicializadores estáticos na ordem em que
aparecem no código fonte. Neste exemplo, o inicializador de variável de classe para xé executado primeiro,
seguido de staticbloqueio do initializer e, finalmente, o inicializador de variáveis de classe
para z- A . (í a questão: es. , , , íntepeo. . E. . es. sobre a questão . (em, proprio, e os comandos e Depois
que a classe é totalmente inicializada, mainO método pode ser executado.
 */

class Main extends Object {
    // Class variable initializers and static initializers are executed in this order
    static int x = 1;  // Initializer for static field x
    static int y;  // No initializer for static field y
    // Static initializer
    static {
        y = x + 1;
    }
    static int z = x + y;  // Initializer for static field z
    public static void main(String[] args) {
        // Main method is executed after the class is initialized
    }
}