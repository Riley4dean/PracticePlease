fun main(){
    val song = Song("Never gonna give you up", "Rick Astley",1987, 1570716949)
}

class Song(
    val title: String,
    val artist : String,
    val yearPublished : Int,
    val playCount: Int
){
    val isPopular : Boolean get() = playCount >= 1000

    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished")
    }
}