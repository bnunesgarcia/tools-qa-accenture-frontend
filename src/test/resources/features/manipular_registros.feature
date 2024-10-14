#language: pt
Funcionalidade: Acessar a aplicação demoqa para manipular registros
    Eu como analista de testes
    Quero acessar a aplicação demoqa
    Para manipular registros no menu Web Tables

    Esquema do Cenário: Criar um novo registro no menu Web Tables
        Dado que eu acesse a aplicacao demoqa
        E o menu <menu> deve estar disponivel
        Quando eu clico no menu <menu>
        Entao eu clico no submenu <submenu>
        E o botao <botao> deve esta disponivel
        E eu clico no botao <botao>
        E um popup para preenchimento de novo registro aparece
        E eu preencho o Nome
        E eu preencho o sobrenome
        E eu preencho o email
        E eu preencho a idade
        E eu preencho o salario
        E eu preencho o departamento
        E eu realizo o submit da criacao do novo registro
        E eu valido que os dados foram inseridos na tabela de registros

        Exemplos:
            | menu     | submenu    | botao |
            | elements | web tables | add   |

    Esquema do Cenário: Alterar registro criado
        Dado que eu acesse a aplicacao demoqa
        E o menu <menu> deve estar disponivel
        Quando eu clico no menu <menu>
        Entao eu clico no submenu <submenu>
        E o botao <botao> deve esta disponivel
        E eu clico no botao <botao>
        E um popup para preenchimento de novo registro aparece
        E eu preencho o Nome
        E eu preencho o sobrenome
        E eu preencho o email
        E eu preencho a idade
        E eu preencho o salario
        E eu preencho o departamento
        E eu realizo o submit da criacao do novo registro
        E eu valido que os dados foram inseridos na tabela de registros
        E eu acesso a tela de editar dados
        E eu edito o nome
        E eu edito o sobrenome
        E eu realizo o submit da alteracao do registro
        E eu valido que os dados foram alterados corretamente

        Exemplos:
            | menu     | submenu    | botao |
            | elements | web tables | add   |

    Esquema do Cenário: Criar 12 registros
        Dado que eu acesse a aplicacao demoqa
        E o menu <menu> deve estar disponivel
        Quando eu clico no menu <menu>
        Entao eu clico no submenu <submenu>
        E o botao <botao> deve esta disponivel
        E eu clico no botao <botao>
        E um popup para preenchimento de novo registro aparece
        E eu preencho o campo nome com o <nome>
        E eu preencho o campo sobrenome com o <sobrenome>
        E eu preencho o campo email com o email <email>
        E eu preencho a campo idade com a idade <idade>
        E eu preencho o campo salario com o salario <salario>
        E eu preencho o campo departamento com o departamento <departamento>
        E eu realizo o submit da criacao do novo registro
        E eu deleto o registro inserido
        E eu valido que o registro náo esta mais disponivel na tabela

        Exemplos:
            | menu     | submenu    | botao | nome    | sobrenome | email             | idade | salario | departamento |
            | elements | web tables | add   | Bruno   | Garcia    | email1@teste.com  | 36    | 1000    | TI           |
            | elements | web tables | add   | Breno   | Nunes     | email2@teste.com  | 25    | 2000    | RH           |
            | elements | web tables | add   | Gael    | Garcia    | email3@teste.com  | 28    | 3000    | RH           |
            | elements | web tables | add   | Monica  | Garcia    | email4@teste.com  | 45    | 4000    | Financeiro   |
            | elements | web tables | add   | Benicio | Garcia    | email5@teste.com  | 32    | 1000    | TI           |
            | elements | web tables | add   | Laura   | Gomes     | email6@teste.com  | 20    | 2000    | Financeiro   |
            | elements | web tables | add   | Leia    | Nunes     | email7@teste.com  | 18    | 3000    | TI           |
            | elements | web tables | add   | Lidia   | Oliveira  | email8@teste.com  | 37    | 4000    | Estoque      |
            | elements | web tables | add   | Paulo   | Garcia    | email9@teste.com  | 42    | 5000    | Redes        |
            | elements | web tables | add   | Ricardo | Gomes     | email10@teste.com | 50    | 2000    | Marketing    |
            | elements | web tables | add   | Paula   | Cristina  | email11@teste.com | 35    | 4000    | Marketing    |
            | elements | web tables | add   | Miguel  | Gomes     | email12@teste.com | 36    | 1000    | TI           |