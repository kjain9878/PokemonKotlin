package `in`.co.kshitijjain.pokemonkotlin.pokemon.model

data class Result(val url: String, val name: String) {
    companion object {
        fun create(url: String, name: String): Result {
            return Result(url, name)
        }
    }
}