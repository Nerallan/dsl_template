package by.nerallan.dsl_template

class PageBuilder {

    var number: Int = -1
    var pageBlocks: MutableList<PageBlock> = mutableListOf()

    fun pageBlock(block: PageBlockBuilder.() -> Unit) {
        pageBlocks.add(PageBlockBuilder().apply(block).build())
    }

    fun build(): Page = Page(number, pageBlocks)
}