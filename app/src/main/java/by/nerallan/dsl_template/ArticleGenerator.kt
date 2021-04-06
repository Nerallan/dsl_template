package by.nerallan.dsl_template

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

                // @ArticleDsl doesn't allow to define number value (composite annotated block in each other),
                // due it belongs to PageBuilder and not to ArrayList<PageBlock>
//                pageBlock {
//                    pageBlocks {
//                        number = 2
//                    }
//                }
            }
        }
    }

    fun testPage() {
        val firstPage = generatePage()
        firstPage.toString()
    }
}