# 📋 TaskApp

**TaskApp** é um aplicativo simples e intuitivo para gerenciar suas tarefas diárias. Ele permite que você adicione, conclua e exclua tarefas de forma prática, ajudando a organizar sua rotina com eficiência.

---

## 🛠️ Funcionalidades

- ✅ **Adicionar Tarefas**: Crie novas tarefas com facilidade.
- ✔️ **Concluir Tarefas**: Marque tarefas como concluídas.
- ❌ **Excluir Tarefas**: Remova tarefas que não são mais necessárias.
- 🌙 **Suporte ao Modo Escuro**: Interface adaptada para modo claro e escuro.
- 📱 **Interface Responsiva**: Design otimizado para diferentes tamanhos de tela.

---

## 🚀 Tecnologias Utilizadas

- **Kotlin**
- **Jetpack Compose**: Para criação da interface moderna e reativa.
- **Material Design 3**: Para um design elegante e consistente.
- **Hilt (Dagger)**: Para injeção de dependência.
- **MVVM Architecture**: Para separação de responsabilidades e escalabilidade.

---

## 🖥️ Pré-requisitos

Antes de começar, certifique-se de ter as seguintes ferramentas instaladas:

1. [Android Studio](https://developer.android.com/studio)
2. JDK 11 ou superior
3. Gradle configurado no ambiente

---

## 📦 Como Executar o Projeto

1. Clone o repositório:
git clone [git@github.com:sinngjpeg/todo-sample.git](https://github.com/sinngjpeg/todo-sample)

2. Abra o projeto no Android Studio.
3. Sincronize as dependências do Gradle.
4. Conecte um dispositivo ou inicie um emulador Android.
5. Execute o aplicativo clicando no botão "Run" (▶).

---

## 📚 Estrutura do Projeto

O projeto segue a arquitetura MVVM (Model-View-ViewModel) com as seguintes camadas principais:

1. **Domain**:
- Contém os modelos e regras de negócios.
2. **Data**:
- Gerencia fontes de dados, como banco de dados local ou APIs externas.
3. **Presentation**:
- Contém as telas (`Composables`) e ViewModels para interação com a interface do usuário.

---

## [🖼️ Demonstração](pplx://action/followup)

<p align="center">
  <img src="https://raw.githubusercontent.com/sinngjpeg/todolist-sample-clean-architecture/main/pictures/empty.png" alt="Tela Inicial" width="200">
  <img src="https://raw.githubusercontent.com/sinngjpeg/todolist-sample-clean-architecture/main/pictures/add_task.png" alt="Adicionando Tarefa" width="200">
  <img src="https://raw.githubusercontent.com/sinngjpeg/todolist-sample-clean-architecture/main/pictures/one_task.png" alt="Uma Tarefa Adicionada" width="200">
   <img src="https://raw.githubusercontent.com/sinngjpeg/todolist-sample-clean-architecture/main/pictures/task_done.png" alt="Uma Tarefa Concluida" width="200">
</p>

---





