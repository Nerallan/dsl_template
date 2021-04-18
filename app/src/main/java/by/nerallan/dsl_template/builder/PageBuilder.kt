package by.nerallan.dsl_template.builder

import by.nerallan.dsl_template.annotation.ArticleDSL
import by.nerallan.dsl_template.model.Page
import by.nerallan.dsl_template.model.PageBlock

@ArticleDSL
class PageBuilder {

    var number: Int = -1
    private var pageBlocks: MutableList<PageBlock> = mutableListOf()

    fun pageBlocks(block: PageBLockContainer.() -> Unit) {
        val pageBLockContainer = PageBLockContainer().apply(block)
        pageBlocks.addAll(pageBLockContainer.content)
    }

    fun build(): Page = Page(number, pageBlocks)
}

class PageBLockContainer {

    val content = mutableListOf<PageBlock>()

    @ArticleDSL
    inline fun pageBlock(block: PageBlockBuilder.() -> Unit): PageBlock {
        return PageBlockBuilder().apply(block)
            .build()
            .also{ content.add(it) }
    }
}