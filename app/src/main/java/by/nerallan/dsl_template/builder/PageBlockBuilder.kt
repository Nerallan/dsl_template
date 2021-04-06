package by.nerallan.dsl_template.builder

import by.nerallan.dsl_template.ArticleDSL
import by.nerallan.dsl_template.model.PageBlock
import by.nerallan.dsl_template.model.PageBlockType

@ArticleDSL
class PageBlockBuilder {

    var content = ""
    var type: PageBlockType = PageBlockType.UNDEFINED
    var innerBlock: PageBlock? = null

    fun build(): PageBlock = PageBlock(content, type, innerBlock)
}