package Lib;
/**
 * Checked Exception ที่จะถูกโยนเมื่อดำเดินการไม่ถูกต้อง
 */
public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}