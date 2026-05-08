function PokemonCard() {
return (
    <div>
        <div>
            <img
                src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"
                alt="Pikachu"
            />
            <h2>#025 — Pikachu</h2>
            <p>Tipo: Elétrico</p>
        </div>

        <div>
            <img
                src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
                alt="Squirtle"
            />
            <h2>#007 — Squirtle</h2>
            <p>Tipo: Água</p>
        </div>

        <div>
            <img
                src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"
                alt="Charmander"
            />
            <h2>#004 — Charmander</h2>
            <p>Tipo: Fogo</p>
        </div>
    </div>
)
}

export default PokemonCard
