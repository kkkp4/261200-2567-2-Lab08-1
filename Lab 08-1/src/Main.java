public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new NumberPrinter(1));
        Thread t2 = new Thread(new NumberPrinter(2));
        Thread t3 = new Thread(new NumberPrinter(3));

        t1.start();
        t2.start();
        t3.start();
        /*1. ก่อนเพิ่ม Thread.sleep()
            -ผลลัพธ์จะปรากฏสลับกัน แต่แต่ละเธรดมักจะพิมพ์ตัวเลขเป็นกลุ่ม เช่น Thread3 ก้จะพิมพ์ออกมา 1 2 3 และต่อด้วย Thread อื่นต่อ
            -บางครั้ง เธรดหนึ่งอาจพิมพ์ตัวเลขหลายตัวก่อนที่เธรดอื่นจะเริ่มพิมพ์
            -ผลลัพธ์จะออกมาทีเดี่ยวหมดเลยไม่มีหน่วงเวงลา
          2. หลังจากเพิ่ม Thread.sleep():
            -Thread 1 2 3 จะพิมพ์เลขออกมาพร้อมกันและพิมพ์เป็นรอบๆ เช่น พิมพ์เลข 1 ทั้ง3 Thread ก้จะพิมพ์ออกมาพร้อมกันก่อนแล้วค่อยเลขถัดไป
            -ผลลัพธ์จะค่อยออกมามาเวลาที่หน่วงไว้และมาเป็นระเบียบ
            -ไม่มีThreadเดียวที่ครอบงำเป็นเวลานาน เธรดจะสลับกันบ่อยขึ้น
          Explanation of Multithreading in Java:
            - มัลติเธรดของ Java ช่วยให้สามารถเรียกใช้เธรดหลายเธรดพร้อมกันได้
            - เมื่อไม่ได้พัก เธรดอาจพิมพ์ตัวเลขหลายตัวติดต่อกันก่อนที่ตัวเลขอื่นจะเริ่มทำงาน
            - เมื่ออยู่ในโหมดพัก การสลับบริบทจะเกิดขึ้นบ่อยขึ้น ทำให้ลำดับการทำงานสับสนมากขึ้น
            - ลำดับการทำงานจะเปลี่ยนแปลงไปในแต่ละครั้งที่รันเนื่องจากความแตกต่างของกำหนดเวลาของเธรด
         */
    }
}
