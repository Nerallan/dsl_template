package by.nerallan.dsl_template.builder

import by.nerallan.dsl_template.ArticleDSL
import by.nerallan.dsl_template.model.Page
import by.nerallan.dsl_template.model.PageBlock

@ArticleDSL
class PageBuilder {

    var number: Int = -1
    private var pageBlocks: MutableList<PageBlock> = mutableListOf()

    fun pageBlocks(block: ArrayList<PageBlock>.() -> Unit) {
        pageBlocks.addAll(ArrayList<PageBlock>().apply(block))
    }

    fun build(): Page = Page(number, pageBlocks)
}