package by.nerallan.dsl_template

fun page(block: Page.() -> Unit): Page = Page().apply(block)
fun pageBlock(block: PageBlock.() -> Unit): PageBlock = PageBlock().apply(block)

class ArticleDSL {

    fun generatePage() {
        val page = page {
            number = 1
            pageBlocks = listOf(
                pageBlock {
                    content = "this is article content"
                },
                pageBlock {
                    content = "this is first article header"
                },
                pageBlock {
                    content = "imageUri"
                }
            )
        }
    }
}