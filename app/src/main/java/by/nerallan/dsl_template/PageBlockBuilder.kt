package by.nerallan.dsl_template

@ArticleDSL
class PageBlockBuilder {

    var content = ""
    var type: PageBlockType = PageBlockType.UNDEFINED
    var innerBlock: PageBlock? = null

    fun build(): PageBlock = PageBlock(content, type, innerBlock)
}