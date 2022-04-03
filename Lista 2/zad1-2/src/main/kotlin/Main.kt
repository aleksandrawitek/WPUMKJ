fun main() {

    fun convertToRoman(n: Int):String
    {
        var dictionary = mapOf(1 to "I", 5 to "V", 10 to "X", 50 to "L", 100 to "C", 500 to "D", 1000 to "M")
        var roman = ""
        var i = 0
        //a - rozmiar 1,10,100, b - ilosc
        fun converter(a: Int, b: Int)
        {
            i = 0
            if (b < 4)
            {
                while(i < b)
                {
                    roman += dictionary[1*a].toString()
                    i++
                }
            }
            if (b == 4)
            {
                roman += dictionary[1*a].toString()
                roman += dictionary[5*a].toString()
            }
            if (b == 5)
            {
                roman += dictionary[5*a].toString()
            }
            if (b > 5 && b < 9)
            {
                roman += dictionary[5*a].toString()
                while(i < b - 5)
                {
                    roman += dictionary[1*a].toString()
                    i++
                }
            }
            if (b == 9)
            {
                roman += dictionary[1*a].toString()
                roman += dictionary[10*a].toString()
            }
        }
        if (n > 3999)
        {
            roman = "Proszę podać liczbę do 3999"
        }
        else
        {
            // ilosc tysiecy setek dziesiatek jednosci

            var t = n/1000
            var h = (n - t.toInt()*1000)/100
            var t2 = (n - t.toInt()*1000 - h.toInt()*100)/10
            var o = n - t.toInt()*1000 - h.toInt()*100 - t2.toInt()*10
            while(i < t)
            {
                roman += dictionary[1000].toString()
                i++
            }
            if(h != 0)
            {
                converter(100, h)
            }
            if(t2 != 0)
            {
                converter(10, t2)
            }
            if(o != 0)
            {
                converter(1, o)
            }
        }
        return roman
    }
    fun convertFromRoman(s: String): Int
    {
        var dictionary = mapOf(1 to "I", 5 to "V", 10 to "X", 50 to "L", 100 to "C", 500 to "D", 1000 to "M")
        var arabic = 0
        var length = s.length
        var i = 0
        while (i < length)
        {
            var s1 = dictionary.filterValues { it == s[i].toString() }.keys.first()

            // bierzemy dwie liczby po sobie
            if (i+1<length)
            {
                var s2 = dictionary.filterValues { it == s[i+1].toString() }.keys.first()
                // przypadek kiedy mamy wieksza lub taka sama liczbe po lewej stronie np MM = 2000 lub MX = 2010
                if (s1 >= s2)
                {
                    arabic += s1
                }
                // kiedy prawa jest mniejsza
                else
                {
                    if (s2 == 50 || s2 == 100 || s2 == 1000)
                    {
                        arabic += s2 - s1
                        i += 1
                    }
                    else
                    {
                        arabic += s2 - s1
                    }
                }
            }
            if (i+1 > length-1) {
                var s2 = dictionary.filterValues { it == s[i - 1].toString() }.keys.first()
                if (s1 <= s2) {
                    arabic += s1
                }
            }
            i +=1
        }

        return arabic
    }

    print("Twoja liczba rzymska to: " + convertToRoman(1584)+"\n")
    print("Twoja liczba arabska to: " + convertFromRoman("MDLXXXIV").toString()+"\n")

    print("Inny przykład \n")

    print("Twoja liczba rzymska to: " + convertToRoman(342)+"\n")
    print("Twoja liczba arabska to: " + convertFromRoman("CCCXLII").toString()+"\n")

    print("Inny przykład \n")

    print("Twoja liczba rzymska to: " + convertToRoman(68)+"\n")
    print("Twoja liczba arabska to: " + convertFromRoman("LXVIII").toString()+"\n")

    print("Inny przykład \n")

    print("Twoja liczba rzymska to: " + convertToRoman(900)+"\n")
    print("Twoja liczba arabska to: " + convertFromRoman("CM").toString()+"\n")


}