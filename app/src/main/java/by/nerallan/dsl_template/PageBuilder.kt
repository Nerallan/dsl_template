package by.nerallan.dsl_template

class PageBuilder {

    var number: Int = -1
    var pageBlocks: MutableList<PageBlock> = mutableListOf()

    fun pageBlocks(block: ArrayList<PageBlock>.() -> Unit) {
        pageBlocks.addAll(ArrayList<PageBlock>().apply(block))
    }

    fun build(): Page = Page(number, pageBlocks)
}