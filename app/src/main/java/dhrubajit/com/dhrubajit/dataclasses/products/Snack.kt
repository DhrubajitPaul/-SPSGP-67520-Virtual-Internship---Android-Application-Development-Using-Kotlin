package dhrubajit.com.dhrubajit.dataclasses.products

data class Snack(
    override var name: String,
    override var description: String,
    override var sku: String,
    override var price: Float,
    override var image: String
): Product()