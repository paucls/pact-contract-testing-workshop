package paucls.pactworkshop.catalog.api

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import paucls.pactworkshop.catalog.app.Product
import paucls.pactworkshop.catalog.app.ProductService

@RestController
class ProductController(private val productService: ProductService) {

    @RequestMapping("/")
    fun index(): String = "Catalog service!"

    @RequestMapping(value = ["/products"])
    fun getAllProducts(): List<Product> {
        return productService.getAllProducts()
    }

    // Not what the frontend expects
    @RequestMapping(value = ["/product/{id}"])
    fun getProduct(@PathVariable id: Int): Product {
        return productService.getProduct(id)
    }
}
