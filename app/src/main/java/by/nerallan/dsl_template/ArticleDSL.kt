package by.nerallan.dsl_template

fun page(block: PageBuilder.() -> Unit): Page = PageBuilder().apply(block).build()
fun pageBlock(block: PageBlockBuilder.() -> Unit): PageBlock =
    PageBlockBuilder().apply(block).build()

class ArticleDSL {

    private fun generatePage(): Page {
        return page {
            number = 1
            pageBlocks {
                headerBlock(text = "this is header")
                textBlock(text = "this is article content")
                textBlock(text = "this is another article content")
                complexBlock(
                    imageBlock(url = "imageUri")
                )
            }
        }
    }

    private fun textBlock(text: String) = pageBlock {
        type = PageBlockType.TEXT
        content = text
    }

    private fun headerBlock(text: String) = pageBlock {
        type = PageBlockType.HEADER
        content = text
    }

    private fun imageBlock(url: String) = pageBlock {
        type = PageBlockType.IMAGE
        content = url
    }

    private fun complexBlock(pageBlock: PageBlock) = pageBlock {
        type = PageBlockType.COMPLEX
        content = "this is image description"
        innerBlock = pageBlock
    }

    fun testPage() {
        val firstPage = generatePage()
        firstPage.toString()
    }
}