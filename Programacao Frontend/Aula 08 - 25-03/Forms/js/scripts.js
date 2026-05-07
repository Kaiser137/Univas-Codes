const form = document.querySelector("#formInscricao");

form.addEventListener("submit", function (event) {
    event.preventDefault();
    const nome = document.querySelector("#nomeCompleto");
    const email = document.querySelector("#email");
    let contaTudo = 0;

    if (nome.value == "") {
        console.log("Nome nao preenchido!");
        const erro = document.querySelector("#erronomeCompleto");
        erro.textContent = "Nome não preenchido!";
    } else {
        console.log("Nome: ", nome.value);
        contaTudo = contaTudo + 1;
    }

    if (email.value == "") {
        console.log("Email não preenchido!")
        const erro = document.querySelector("#erroemail");
        erro.textContent = "E-mail não preenchido!";
    } else {
        console.log("Email: ", email.value);
        contaTudo = contaTudo + 1;
    }

    const senha = document.querySelector("#senha");

    if (senha.value.length >= 6) {
        console.log("A senha é: ", senha.value);
        contaTudo = contaTudo + 1;
    } else {
        console.log("A senha precisa de mais de 6 caracteres!");
        const erro = document.querySelector("#errosenha");
        erro.textContent = "A senha precisa de mais de 6 caracteres!";
    }

    const dataAtual = new Date();
    const inputDataNascimento = document.querySelector("#dataNascimento");
    const dataNascimento = new Date(inputDataNascimento.value);
    const [mesAtual, diaAtual, anoAtual] = [
        dataAtual.getMonth(),
        dataAtual.getDate(),
        dataAtual.getFullYear(),
    ];

    const [mesNascimento, diaNascimento, anoNascimento] = [
        dataNascimento.getUTCMonth(),
        dataNascimento.getUTCDate(),
        dataNascimento.getUTCFullYear(),
    ];

    if (inputDataNascimento.value == "") {
        console.log("Preencha sua data de nascimento!");
        const erro = document.querySelector("#errodataNascimento");
        erro.textContent = "Preencha sua data de nascimento!";
    } else {
        if (anoAtual - anoNascimento > 16) {
            console.log("Acesso permitido!");
        contaTudo = contaTudo + 1;
        } else if (anoAtual - anoNascimento == 16) {
            if (mesAtual - mesNascimento < 0) {
                console.log("Acesso negado!");
            } else if (mesAtual - mesNascimento == 0) {
                if (diaAtual - diaNascimento < 0) {
                    console.log("Acesso negado!");
                } else {
                    console.log("Acesso permitido!");
        contaTudo = contaTudo + 1;
                }
            } else {
                console.log("Acesso permitido!");
        contaTudo = contaTudo + 1;
            }
        } else {
            console.log("Acesso negado!");
        }
    }

    const horario = document.querySelector("#horarioPreferido");

    if(horario.value == ""){
        console.log("Selecione um horário!");
        const erro = document.querySelector("#errohorarioPreferido");
        erro.textContent = "Preencha seu horário preferido!";
    } else {
    console.log("Horário preferido: ", horario.value);
        contaTudo = contaTudo + 1;
    }

    const url = document.querySelector("#githubPortfolio");

    if (url.value.includes("https://")) {
        console.log("URL aceita!");
        contaTudo = contaTudo + 1;
    } else {
        console.log("URL negada!");
        const erro = document.querySelector("#errogithubPortfolio");
        erro.textContent = "URL sem https://";
    };

    const selectCurso = document.querySelector("#selectCurso");

    if (selectCurso.value == "Selecione um curso") {
        console.log("Selecione um curso!");
        const erro = document.querySelector("#errocurso");
        erro.textContent = "Selecione um curso!";
    } else {
        console.log("Curso: ", selectCurso.value);
        contaTudo = contaTudo + 1;
    }

    const manha = document.querySelector("#manha");
    const tarde = document.querySelector("#tarde");

    if (!manha.checked && !tarde.checked) {
        console.log("Selecione um turno!");
        const erro = document.querySelector("#erroturno");
        erro.textContent = "Selecione um turno!";
    } else {
        console.log("Turno selecionado!");
        contaTudo = contaTudo + 1;
    }

    const html = document.querySelector("#html");
    const css = document.querySelector("#css");
    const js = document.querySelector("#js");

    if (!html.checked && !css.checked && !js.checked) {
        console.log("Selecione um interesse!");
        const erro = document.querySelector("#errointeresses");
        erro.textContent = "Selecione um interesse!";
    } else {
        console.log("Interesse selecionado!");
        contaTudo = contaTudo + 1;
    }

    const motivacao = document.querySelector("#motivacao");

    if (motivacao.value.length > 19) {
        console.log("Sua motivação eh: ", motivacao.value);
        contaTudo = contaTudo + 1;
    } else {
        console.log("Faça uma motivação com mais de 20 caracteres!");
        const erro = document.querySelector("#erromotivacao");
        erro.textContent = "Faça uma motivação com mais de 20 caracteres!";
    }

    const termosAceito = document.querySelector("#termosAceito");
    const termosNaoAceito = document.querySelector("#termosNaoAceito");

    if (termosAceito.checked && termosNaoAceito.checked) {
        console.log("Tá de sacanagem?");
        const erro = document.querySelector("#errotermos");
        erro.textContent = "Tá de sacanagem?";
    } else if (termosNaoAceito.checked) {
        console.log("Termos não aceitos!")
        contaTudo = contaTudo + 1;
    } else if (termosAceito.checked) {
        console.log("Termos aceitos!");
        contaTudo = contaTudo + 1;
    } else {
        console.log("Aceite ou não aceite os termos!");
        const erro = document.querySelector("#errotermos");
        erro.textContent = "Aceite ou não aceite os termos!";
    }

    if (contaTudo == 11) {
        form.style.display = 'none';
        const resultadoDiv = document.createElement('div');

        const turno = manha.checked ? 'Manhã' : (tarde.checked ? 'Tarde' : '');
        const interesses = [];
        if (html.checked) interesses.push('HTML');
        if (css.checked) interesses.push('CSS');
        if (js.checked) interesses.push('JavaScript');
        const termos = termosAceito.checked ? 'Aceito' : (termosNaoAceito.checked ? 'Não aceito' : '');

        resultadoDiv.innerHTML = `
            <h2>Dados da Inscrição:</h2>
            <p><strong>Nome:</strong> ${nome.value}</p>
            <p><strong>E-mail:</strong> ${email.value}</p>
            <p><strong>Senha:</strong> ********</p>
            <p><strong>Data de nascimento:</strong> ${inputDataNascimento.value ? dataNascimento.toLocaleDateString() : ''}</p>
            <p><strong>Horário preferido:</strong> ${horario.value}</p>
            <p><strong>Portfolio:</strong> ${url.value ? `<a href="${url.value}" target="_blank" rel="noopener">${url.value}</a>` : ''}</p>
            <p><strong>Curso:</strong> ${selectCurso.value}</p>
            <p><strong>Turno:</strong> ${turno}</p>
            <p><strong>Interesses:</strong> ${interesses.join(', ')}</p>
            <p><strong>Motivação:</strong> ${motivacao.value}</p>
            <p><strong>Termos:</strong> ${termos}</p>
        `;

        form.parentNode.appendChild(resultadoDiv);
    }



});