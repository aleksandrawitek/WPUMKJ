fun main() {
    fun isCyclic(i: String):Boolean
    {
        //sprawdzenie czy naturalna
        if (i.contains("-") || i.contains(".") || i.contains(",")  )
        {
            println("Liczba nie jest naturalna, podaj prawidłową liczbę!")
            return false
        }

        else
        {
            var length = i.length
            var j = 1
            while (j <= length)
            {
                var multiplicity = (i.toInt()*j).toString()
                var mul_len = multiplicity.length
                // każda wielokrotność liczby cyklicznek musi być tej samej długości co liczba wyjściowa

                if (mul_len != length)
                {
                    return false
                    break
                }
                else
                {
                    for (char in i)
                    {
                        val x = multiplicity.indexOf(char)
                        // jesli cyfry nie ma to jej indeks wynosi -1
                        if (x == -1)
                        {
                            return false
                            break
                        }
                    }
                }

                j++
            }
            return true
        }
    }
    //println(isCyclic("-430"))
    //println(isCyclic("50.5"))
    println(isCyclic("142857"))
}