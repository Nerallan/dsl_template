package by.nerallan.dsl_template

fun page(block: PageBuilder.() -> Unit): Page = PageBuilder().apply(block).build()
fun pageBlock(block: PageBlockBuilder.() -> Unit): PageBlock = PageBlockBuilder().apply(block).build()

class ArticleDSL {

    private fun generatePage(): Page {
        return page {
            number = 1
            pageBlocks {
                pageBlock {
                    content = "this is article content"
                }
                pageBlock {
                    content = "this is header"
                }
            }
        }
    }

    fun testPage() {
        val firstPage = generatePage()
        firstPage.toString()
    }
}