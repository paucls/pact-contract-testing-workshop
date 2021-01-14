package paucls.pactworkshop.catalog.app

import org.springframework.stereotype.Service

@Service
class ProductService(
        private val productRepository: ProductRepository
) {
    fun getAllProducts(): List<Product> {
        return productRepository.getAllProducts()
    }

    fun getProduct(id: Int): Product {
        return productRepository.getProduct(id)
    }

    fun favouriteProduct(id: Int) {
        val product = productRepository.getProduct(id)
        product.isFavouriteProduct = true
        productRepository.save(product)
    }
}
