package example

inline fun <reified T> membersOf() = T::class.members

object Hello {
    @JvmStatic
    fun main(args: Array<String>) {
        println(membersOf<StringBuilder>())
    }
    
}

