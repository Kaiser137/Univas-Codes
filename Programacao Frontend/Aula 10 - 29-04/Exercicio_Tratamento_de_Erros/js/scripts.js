const form = document.querySelector("#formPais");

form.addEventListener("submit", function (event) {
    event.preventDefault();
    const nome = document.querySelector("#nomePais");
    if (nome.value == "") {
        document.getElementById("resultado").innerHTML = `<p>Digite o nome de um país.</p>`;
        return;
    }

    fetch("https://restcountries.com/v3.1/translation/" + nome.value)
        .then(response => {
            if (!response.ok){
                if (response.status === 404) throw new Error("404");
                throw new Error("OutroErro");
            }
            return response.json();
        })
        .then(data => {
            document.getElementById("resultado").innerHTML = `<p>Nome do País: ${data[0].name.official}</p>
            <p>Capital: ${data[0].capital}</p>
            <p>População: ${data[0].population}</p>
            <p>Região: ${data[0].region}</p>`;
        })
        .catch(error => {
            if (error.message === "404") {
                document.getElementById("resultado").innerHTML = `<p>Nenhum país encontrado com esse nome.</p>`;
            } else {
                document.getElementById("resultado").innerHTML = `<p>Não foi possível conectar. Verifique sua internet.</p>`;
            }
            console.error("Detalhes do erro:", error);
        });
});