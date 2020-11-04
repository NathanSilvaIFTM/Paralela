# Prova 01
# Resolvendo Produtor Consumidor usando Wait Notify
# O projeto se resume a uma lista de elementos em que o produtor deseja colocar itens e o consumidor retirar, o produtor so pode colocar itens quando a lista estiver   # vazia e o cliente so pode retirar itens quando ela estiver cheia.
# Tecnologias usadas : Java.

### Declarando as classes Produtor e Consumidor implementando a interface runnable, criando a lista e passando como parametro em cada construtor.

![01](https://user-images.githubusercontent.com/72080383/98089575-ae4ee880-1e61-11eb-9e55-731a11d3f120.png)
![02](https://user-images.githubusercontent.com/72080383/98089653-cfafd480-1e61-11eb-9d68-84b1ec219d46.png)

### Metodo produtor, o metodo utiliza synchronized na lista para que apenas um thread a utilize, apos checar se a lista está vazia ou cheia, se estiver cheia entra em wait ate o consumidor retirar itens da lista, se estiver vazia coloca itens ate a lista ficar cheia e da um notify para o consumidor retirar itens.

![03](https://user-images.githubusercontent.com/72080383/98090269-8f048b00-1e62-11eb-9f2c-28ecc0d7c0b4.png)

### Metodo consumidor, no metodo e checada se a lista esta vazia se estiver, a lista entra em wait ate o produtor adicionar elementos e dar o notify, se estiver cheia o consumidor retira os elementos da lista e da um notify para que o produtor comece a colocar elementos na lista.

![04](https://user-images.githubusercontent.com/72080383/98090819-5618e600-1e63-11eb-9f3a-0182dd866858.png)

### Ouput: A lista começa vazia, consumir fica em wait ate o produtor encher a lista e dar notify, em seguida o produtor fica em wait ate o consumidor esvaziar a lista e dar notify.

![06](https://user-images.githubusercontent.com/72080383/98091574-5ebdec00-1e64-11eb-9d68-7114cc2d397b.png)
