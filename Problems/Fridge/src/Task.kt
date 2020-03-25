fun Fridge.take(productName: String): Product {
    this.open()
    val p = find(productName)
    this.close()

    return p
}
