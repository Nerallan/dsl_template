package by.nerallan.dsl_template

class PageBlockBuilder {

    var content = ""

    fun build(): PageBlock = PageBlock(content)
}