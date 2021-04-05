package by.nerallan.dsl_template

class PageBlockBuilder {

    var content = ""
    var type: PageBlockType = PageBlockType.UNDEFINED

    fun build(): PageBlock = PageBlock(content, type)
}