package by.nerallan.dsl_template.generator

import by.nerallan.dsl_template.dsl.*
import by.nerallan.dsl_template.model.Page

class ArticleGenerator {

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

    fun testPage() {
        val firstPage = generatePage()
        firstPage.toString()
    }
}