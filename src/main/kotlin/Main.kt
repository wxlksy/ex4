//Создать приложение, с помощью которого пользователь, введя два числа и символ операции, узнает результат.
// Символами операции могут быть: / — деление, * — умножение, + — сложение, - — вычитание. Числа могут быть вещественными.
// Числа и знак операции разделяются между собой одним пробелом.
// Ввод производится в формате - ЧИСЛО1 ЧИСЛО2 ОПЕРАЦИЯ

//Выполнил: Самойлов Кирилл Сергеевич ИП-22-7К

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