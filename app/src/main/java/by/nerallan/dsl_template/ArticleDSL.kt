package by.nerallan.dsl_template

fun page(block: (Page) -> Unit): Page = Page().apply(block)
fun pageBlock(block: (PageBlock) -> Unit): PageBlock = PageBlock().apply(block)

class ArticleDSL {

    fun generatePage() {
        val page = page { page ->
            page.number = 1
            page.componentPayload = pageBlock {
                it.content = "this is article content"
            }
        }
    }
}