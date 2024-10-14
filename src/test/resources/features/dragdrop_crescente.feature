#language: pt
Funcionalidade: Aplicar o drag and drop
    Eu como analista de testes
    Quero acessar a aplicação demoqa
    Para utilizar o drag and drop automatico

    Esquema do Cenário: Colocar itens em modelo crescente utilizando o drag and drop
        Dado que eu acesse a aplicacao demoqa
        E o menu <menu> deve estar disponivel
        Quando eu clico no menu <menu>
        Entao eu clico no submenu <submenu>
        E a tela deve conter um container com uma lista vertical contendo seis elementos
        E os elementos devem estar organizados em ordem crescente

        Exemplos:
            | menu         | submenu    |
            | interactions | sortable   |