# Factory Method
![Factory Method](factory-method.png)
## [Mục lục](#mục-lục)
- [Tổng quan](#tổng-quan)
- [Motivation](#motivation)
- [Đặc điểm](#đặc-điểm)
    - [Cấu trúc](#cấu-trúc)
    - [Các thành phần](#các-thành-phần)
    - [Cách sử dụng](#cách-sử-dụng)
    - [Ứng dụng](#ứng-dụng)
    - [Ưu điểm](#ưu-điểm)
    - [Nhược điểm](#nhược-điểm)
    - [Ví dụ minh họa](#ví-dụ-minh-họa)
    - [Các mẫu liên quan](#các-mẫu-liên-quan)
- [Kết luận]()

## [Tổng quan]()

```
Factory Method định nghĩa một giao diện(interface) cho việc tạo một đối tượng, nhưng sẽ để các lớp con quyết định xem lớp nào sẽ được tạo. Nó giao việc khởi tạo một đối tượng cụ thể cho lớp con quyết định
```

## [Motivation]()


## [Mục đích]()
- Tạo ra một cách khỏi tạo object mới thông qua một Ỉnterface chung
- Cho phép lớp con quyết định lớp nào sẽ được tạo từ đó giảm sự phụ thuộc và dễ dàng có thể mở rộng
- Che giấu quá trình xử lý logic của phương thức khởi tạo
- Cung cấp một cách để mở rộng một lớp mà không cần thay đổi cấu trúc của nó
- Giảm khả năng gây lỗi trong quá trình khởi tạo object
     

## [Đặc điểm]()

### [Cấu trúc]()
![Cấu trúc](factory-method-structure.png)
### [Các thành phần]()
* Thành phần:
  - Product: 
### [Cách sử dụng]()

### [Ứng dụng]()

### [Ưu điểm]()
- Có thể chắc chắn đảm bảo rằng lớp Singleton chỉ có một instance
- Cung cấp một điểm truy cập toàn cục tới instance đó(global access point) và có thể kiểm soát hoàn toàn việc truy cập đó
- Thể hiện Singleton chỉ được khởi tạo duy nhất một lần khi nó được yêu cầu lần đầu tiên
- Có thể giảm số lượng namespace trong chương trình
### [Nhược điểm]()
- Vi phạm SRP (Single Responsibility Principle) vì Singleton cần phải quản lý cả việc tạo thể hiện và việc thực thi chức năng của nó
- Khó kiểm soát việc mở rộng lớp Singleton
- Singleton có thể thể hiện thiết kế kém
- Có thể sinh ra khó khăn trong việc unit test client code vì nhiều test framework dựa vào kế thừa khi sản sinh các mock object
### [Ví dụ minh họa]()
```java
public class Singleton {
    private static Singleton instance;
    private Singleton() {
    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### [Các mẫu liên quan]()

## [Kết luận]()
```
Singleton là một mẫu thiết kế cấu trúc creational pattern, mục đích của nó là để đảm bảo rằng một lớp chỉ có một thể hiện(instance) duy nhất. Vì thể hiện này có tiềm năng ứng dụng và sử dụng trong suốt chương trình, nên mẫu thiết kế này cũng cấp một điểm để truy cập toàn cục tới nó
```