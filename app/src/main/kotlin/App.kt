

fun main() {
    Kop()
    Kop2()
    println("_____________")
    var a: Int = 1
    var A: Int = 5
    var b: Int = 1
    var B: Int = 5

    val aa: Int = 2
    val AA: Int = 5
    val bb: Int = 2
    val BB: Int = 5

    println(a)  //สามารถแก้ตัวเลขได้ตรงคันด้วยการทำแบบนี้ "ตัวแปร = 10"
    a = 10
    println(a)
    println(B)
    B = 20
    println(B)

}

fun Kop(){
    print("_____________")

    var Kint: Int = 20_000
    var Kboo: Boolean = true
    var KStr: String = "class24"
    var Kdo: Double = 200.1  //โค๊ด Double ต้องเป็นจุดทศนิยมเท่านั้น
    var KA: Any = "class"  //โค๊ด Any คือโค๊ดที่สามารถใส่ได้ทั้งตัวเลขและตัวอักษร

    println(Kint)  //ท่าตัวแปรของเราเยอะเราสามารถทำแบบนี้ได้แต่ท่าอยากให้กระชับ
    println(Kboo)
    println(KStr)
    println(Kdo)
    println(KA)

    print("_____________")

    println("$Kint \n $Kboo \n $KStr \n $Kdo \n $KA")  //ให้ใช้แบบนี้แทนท่าไม่อยากเขียนหลายบรรนทัด \n คือตัวที่เอาไว้เชื่อม $ คือตัวที่เอาไว้ข้างหน้าตัวแปร
}
fun Kop2(){
    var a = 10
    var b = 3

    // 1. Operator คำนวณ
    println("คำนวณ:")
    println("a + b = ${a + b}") // บวก
    println("a - b = ${a - b}") // ลบ
    println("a * b = ${a * b}") // คูณ
    println("a / b = ${a / b}") // หาร (จำนวนเต็ม)
    println("a % b = ${a % b}") // หารเอาเศษ

    println()

    // 2. Operator เพิ่มและลดค่า
    println("เพิ่มและลดค่า:")
    println("a ก่อนเพิ่ม: $a")
    println("++a = ${++a}")  // เพิ่มก่อนใช้ (ตอนนี้ a = 11)
    println("a++ = ${a++}")  // ใช้ก่อนเพิ่ม (ตอนนี้ a = 12 หลังคำสั่งนี้)
    println("ค่าหลัง a++: $a")  // ตอนนี้ a = 12
    println("--a = ${--a}")  // ลดก่อนใช้ (a = 11)
    println("a-- = ${a--}")  // ใช้ก่อนลด (a ยังแสดงเป็น 11 แต่จริง ๆ ลดแล้ว)
    println("ค่าหลัง a--: $a")  // ตอนนี้ a = 10

    println()

    // 3. Operator เปรียบเทียบ
    println("เปรียบเทียบ:")
    println("a == b : ${a == b}")  // เท่ากับ
    println("a != b : ${a != b}")  // ไม่เท่ากับ
    println("a > b  : ${a > b}")   // มากกว่า
    println("a < b  : ${a < b}")   // น้อยกว่า
    println("a >= b : ${a >= b}")  // มากกว่าหรือเท่ากับ
    println("a <= b : ${a <= b}")  // น้อยกว่าหรือเท่ากับ
}