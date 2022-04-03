fun main() {
    fun isCyclic(i: String):Boolean {
        //sprawdzenie czy naturalna
        if (i.contains("-.,"))
        {
            println("Liczba nie jest naturalna, podaj prawidłową liczbę!")
            return false
        }
        else
        {
            return true
        }
    }
    isCyclic("-430")
    isCyclic("50.5")
    isCyclic("400")
}