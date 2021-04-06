package by.nerallan.dsl_template

fun page(block: PageBuilder.() -> Unit): Page = PageBuilder().apply(block).build()
fun pageBlock(block: PageBlockBuilder.() -> Unit): PageBlock =
    PageBlockBuilder().apply(block).build()

 fun textBlock(text: String) = pageBlock {
    type = PageBlockType.TEXT
    content = text
}

fun headerBlock(text: String) = pageBlock {
    type = PageBlockType.HEADER
    content = text
}

fun imageBlock(url: String) = pageBlock {
    type = PageBlockType.IMAGE
    content = url
}

fun complexBlock(pageBlock: PageBlock) = pageBlock {
    type = PageBlockType.COMPLEX
    content = "this is image description"
    innerBlock = pageBlock
}