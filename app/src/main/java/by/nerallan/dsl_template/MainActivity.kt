package by.nerallan.dsl_template

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import by.nerallan.dsl_template.dsl.footerBlock
import by.nerallan.dsl_template.dsl.headerBlock
import by.nerallan.dsl_template.dsl.page
import by.nerallan.dsl_template.dsl.textBlock
import by.nerallan.dsl_template.model.Page

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val page = page {
            number = 1
            pageBlocks {
                headerBlock(text = "this is article header")
                textBlock(text = "this is article content")
                textBlock(text = "this is article another content")
                textBlock(text = "this is article another content")
                footerBlock(text = "this is end!")
            }
        }
        logArticle(page)
    }

    private fun logArticle(page: Page) {
        println("page entities count -> ${page.pageBlocks.count()}")
        page.pageBlocks.forEach{
            Log.d("TAG", "Type -> ${it.type}, Content -> ${it.content} ")
        }
    }
}