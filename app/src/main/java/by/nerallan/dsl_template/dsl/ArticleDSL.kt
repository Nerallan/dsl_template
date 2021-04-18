package by.nerallan.dsl_template.dsl

import by.nerallan.dsl_template.builder.PageBLockContainer
import by.nerallan.dsl_template.builder.PageBuilder
import by.nerallan.dsl_template.model.Page
import by.nerallan.dsl_template.model.PageBlock
import by.nerallan.dsl_template.model.PageBlockType

fun page(block: PageBuilder.() -> Unit): Page = PageBuilder().apply(block).build()

fun PageBLockContainer.textBlock(text: String) = pageBlock {
    type = PageBlockType.TEXT
    content = text
}

fun PageBLockContainer.headerBlock(text: String) = pageBlock {
    type = PageBlockType.HEADER
    content = text
}

fun PageBLockContainer.footerBlock(text: String) = pageBlock {
    type = PageBlockType.FOOTER
    content = text
}

fun PageBLockContainer.imageBlock(url: String) = pageBlock {
    type = PageBlockType.IMAGE
    content = url
}

fun PageBLockContainer.complexBlock(pageBlock: PageBlock) = pageBlock {
    type = PageBlockType.COMPLEX
    content = "this is image description"
    innerBlock = pageBlock
}