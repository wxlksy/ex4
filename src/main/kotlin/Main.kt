fun main()
{
    println("Введите выражение:")
    val s = readLine()?.split(" ")

    if (s != null && s.size == 3)
    {
        val s1 = s[0].toDouble()
        val s2 = s[1].toDouble()
        val operate = s[2]

        val res = when (operate)
        {
            "+" -> s1 + s2
            "-" -> s1 - s2
            "*" -> s1 * s2
            "/" -> s1 / s2
            else -> "Неизвестная операция"
        }
        println(res)
    }

    else
    {
        println("Введите выражение в правильном формате")
    }
}
