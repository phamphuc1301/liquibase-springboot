## Response
1.  Về việc viết Junit Test
    1. Đề bài yêu cầu viết Junit test cho 3 method đầu tiên. nhưng em chỉ viết 1 method (Add employee)
    1. Tuy nhiên method viết xử lý try catch không hợp lý. Khi try catch ở hàm test, nếu sảy ra Exception logic code sẽ nhảy vào hàm catch và báo pass test case.
    1. Khi add null Employee sẽ xảy ra lỗi NullPointerException khi get các attribute nhưng khi vào catch lại throw lỗi SQLException. Việc này gây khó khăn khi trace lại lỗi nếu đoạn logic này có exception.
1. Việc sử dụng log. chỉ tạo ra Clas LogUtils mà không sử dụng log ở toàn bộ tầng DAO
