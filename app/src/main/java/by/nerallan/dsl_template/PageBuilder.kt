package by.nerallan.dsl_template

class PageBuilder {

    var number: Int = -1
    var pageBlock: PageBlock? = null

    fun build(): Page = Page(number, pageBlock)
}