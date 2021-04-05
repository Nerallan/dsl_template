package by.nerallan.dsl_template

fun page(block: Page.() -> Unit): Page = Page().apply(block)
fun pageBlock(block: PageBlock.() -> Unit): PageBlock = PageBlock().apply(block)

class ArticleDSL {

    fun generatePage(): Page {
        return page {
            number = 1
            pageBlocks = pageBlock {
                content = "this is article content"
            }
        }
    }

    fun testPage() {
        val firstPage = generatePage()
        firstPage.number = 3
    }
}