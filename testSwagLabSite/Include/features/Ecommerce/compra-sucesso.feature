

Feature: Compra no Ecommerce


Scenario: Fazer uma compra com sucesso no ecommerce


Given estou no Ecommerce
And clico preencho as minhas credencias
And clico no botao login
And clico no filtro e escolho Price low to high
And adiciono tres items
And clico no icon cart
And remove um item
And clico no botao Checkout
And preencho os meus dados
When clico no botao Continue
Then clico no botao Finish