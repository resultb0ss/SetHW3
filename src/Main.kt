import java.util.TreeSet

fun main() {
    var mySet = TreeSet<Int>()
    mySet.addAll(arrayOf(1,2,3,4,5,6,7,8,9,10,15,20,13,14,34))

    println(removeDuplicates(mySet))


}

fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {
    return collection?.toSet()
}