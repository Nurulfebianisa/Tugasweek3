 fun main() {


     val Statuspembeli: String = "member"
     val pembelian: Int = 500000
     val hargaPembelian: Double= 625000.0
     val diskon5Persen: Double = hargaPembelian - (hargaPembelian*0.05)
     val diskon10Persen: Double = hargaPembelian - (hargaPembelian*0.1)
     val diskon15Persen: Double = hargaPembelian - (hargaPembelian*0.15)

     if (Statuspembeli == "member" && hargaPembelian <= pembelian){
         println("Pembeli 1 mendapat diskon 5% dari 625000"+ ",Jadi totalnya : "+diskon5Persen)
     }else if (Statuspembeli != "member" && hargaPembelian >= pembelian) {
         println("Pembeli 1 mendapat diskon 10% dari 625000" + ",Jadi totalnya : " + diskon10Persen)
     }else if (Statuspembeli == "member" && hargaPembelian >= pembelian) {
         println("Pembeli 1 mendapat diskon 15% dari 62500" + " ,Jadi totalnya : 625000 - 93750 = " + diskon15Persen)
     }else{
     }
}


