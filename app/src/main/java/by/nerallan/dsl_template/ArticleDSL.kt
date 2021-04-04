package by.nerallan.dsl_template

fun page(block: (Page) -> Unit): Page {
    val page = Page()
    block(page)
    return page
}

class ArticleDSL {

    fun generatePage() {
        // imperative style. with consistent spelling
        val pageBlock = PageBlock("this is article content")
        var page = Page(number = 1, componentPayload = pageBlock)

        // declarative style
        var page2 = page {
            it.number = 1
            it.componentPayload = pageBlock
        }
    }
}