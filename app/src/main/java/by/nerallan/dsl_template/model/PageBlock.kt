package by.nerallan.dsl_template.model

data class PageBlock(
    val content: String,
    val type: PageBlockType,
    val pageBlock: PageBlock?
)
