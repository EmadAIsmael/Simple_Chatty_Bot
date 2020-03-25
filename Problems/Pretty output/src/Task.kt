data class Comment(val id: Int, val body: String, val author: String)

fun printComments(commentsData: Array<Comment>) {
    // write you code here
    for ((_, text, author) in commentsData)
        println("Author: $author; Text: $text")
}
