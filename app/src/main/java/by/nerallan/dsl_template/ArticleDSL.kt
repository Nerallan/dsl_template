package by.nerallan.dsl_template

fun page(block: (Page) -> Unit): Page = Page().apply(block)

class ArticleDSL {

    fun generatePage() {
        val page = page {
            it.number = 1
            it.componentPayload = PageBlock("this is article content")
        }
    }
}