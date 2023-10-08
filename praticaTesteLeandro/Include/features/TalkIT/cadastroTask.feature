

Feature: Realizar o login e cadastro de uma tarefa

  Scenario: Criar conta, fazer login e registar uma tarefa
  
  
  Given estou no site TaskIT
  And clico no botao Ok, I wanna sign up now
  And na pop-up preencho com os campos com os meus dados de registo
  And clico no botao Save
  And clico no menu logout
  And clico no menu sigin
  And preencho com as credenciais
  And clico no botao signin
  And clico no botao Let's add some tasks!
  When clico no botao + Add a task
  Then abri a tela de cadastro de atividades e fecho browser