fun main() {
    //������ �1.�������� ��������

    val amount = 1000;
    val commissionPercent = 0.75
    val commissionMin = 35.0

    var totalCommission = (amount / 100) * commissionPercent
    if (totalCommission < commissionMin) {
        totalCommission = commissionMin
    }
    println("$totalCommission ������")


    //������ �2.����/��������

    val likes = 12
    val remains = likes % 10
    val remainsToo = likes % 100

    if (remains != 1 || remainsToo == 11) {
        println("����������� $likes �����")
    } else {
        println("����������� $likes ��������")
    }


    //������ �3.�������

    val purchaseAmount = 200_000
    val discount = 100
    val borderMin = 1000
    val borderMax = 10_000
    val percent = 5
    val regularCustomer = true
    val intermediateResult = (purchaseAmount / 100) * percent

    var result = purchaseAmount
    if (purchaseAmount <= borderMin) result =
        purchaseAmount else if (purchaseAmount > borderMin && purchaseAmount <= borderMax)
        result = purchaseAmount - discount else if (purchaseAmount > borderMax) result =
        intermediateResult else if (regularCustomer)
        result = (intermediateResult / 100) * 1
    println("$result ������")


}