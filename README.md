 HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG
KHOA CÔNG NGHỆ THÔNG TIN
----------

 

BÁO CÁO BÀI TẬP LỚN
HỌC PHẦN: PHÂN TÍCH THIẾT KẾ HỆ THỐNG THÔNG TIN
ĐỀ TÀI: 3. Hệ thống quản lý rạp chiếu phim 

	
Nhóm bài tập lớn                 	:    16
Nhóm học phần

1. Đào Ngọc Huy
2. Đỗ Ngọc Quang
3. Đỗ Văn Hùng	:    03

-    B19DCCN305
-    B19DCCN521
-    B19DCCN292
    
Module cá nhân	M3: ◦ quản lí thông tin nhà cung cấp phim, 
◦ nhập phim từ nhà cung cấp, 
◦ xem thống kê phim theo doanh thu.




1. Biểu đồ UC và mô tả (3 chức năng)
a)	Quản lí thông tin nhà cung cấp phim
Quản lí đăng nhập vào hệ thống -> đề xuất  use case quản lí đăng nhập
Giao diện thêm nhà cung cấp -> đề xuất use case thêm nhà cung cấp
Giao diện tìm và chọn nhà cung cấp -> đề xuất use case tìm nhà cung cấp
Giao diện sửa nhà cung cấp -> đề xuất usecase sửa nhà cung cấp
Giao diện xoá nhà cung cấp -> đề xuất usecase xoá nhà cung cấp
Vì chức năng đăng nhập của quản lí tương tự chức năng đăng nhập của thành viên hệ thống nên use case quản lí đăng nhập có quan hệ kế thừa usecase đăng nhập của thành viên hệ thống
Do việc đăng nhập là bắt buộc để hoàn thành việc quản lí thông tin nhà cung cấp nên usecase quản lí thông tin nhà cung cấp include usecase đăng nhập
Do việc tìm nhà cung cấp là bắt buộc để sửa hoặc xoá một nhà cung cấp nên các use case sửa nhà cung cấp và xoá nhà cung cấp include use case tìm nhà cung cấp
Vì khi chọn chức năng quản lí thông tin nhà cung cấp người dùng có thể chọn thêm hoặc sửa hoặc xoá nhà cung cấp nên các use case này lần lượt có quan hệ extend với usecase quản lí thông tin nhà cung cấp
Vì cần có nhà cung cấp gửi thông tin thì Quản lí mới có thể thực hiện thêm, sửa được -> đề xuất actor ẩn nhà cung cấp

Do đó ta có lược đồ usecase như hình vẽ:
 ![image](https://user-images.githubusercontent.com/60811649/201270258-4347b80f-9313-4fad-853c-cf768a14da27.png)

Trong đó:
Use case quản lí đăng nhập: cho phép quản lí đăng nhập vào hệ thống
Use case quản lí thông tin nhà cung cấp phim: cho phép quản lí thêm hoặc sửa hoặc xoá thông tin của nhà cung cấp phim
Use case thêm nhà cung cấp phim: cho phép quản lí thêm mới thông tin của một nhà cung cấp phim
Use case tìm nhà cung cấp phim: cho phép quản lí tìm kiếm và chọn một nhà cung cấp phim
Use case sửa nhà cung cấp phim: cho phép quản lí chỉnh sửa thông tin của một nhà cung cấp phim
Usecase tìm xoá cung cấp phim: cho phép quản lí xoá thông tin của một nhà cung cấp phim
b)	Nhập phim từ nhà cung cấp
Để nhập phim từ nhà cung cấp thì quản lí cần thông tin phim từ nhà cung cấp do nhà cung cấp không trực tiếp sử dụng -> đề xuất actor ẩn nhà cung cấp

Quản lí đăng nhập vào hệ thống -> đề xuất  usecase quản lí đăng nhập
Giao diện tìm và chọn nhà cung cấp -> đề xuất usecase tìm nhà cung cấp phim
Giao diện thêm phim -> đề xuất usecase nhập phim từ nhà cung cấp
Vì chức năng đăng nhập của quản lí tương tự chức năng đăng nhập của thành viên hệ thống nên use case quản lí đăng nhập có quan hệ kế thừa usecase đăng nhập của thành viên hệ thống
Do việc đăng nhập là bắt buộc để hoàn thành việc nhập phim từ nhà cung cấp nên usecase nhập phim từ nhà cung cấp include usecase đăng nhập
Do việc tìm nhà cung cấp phim là bắt buộc để có thể nhập phim từ nhà cung cấp nên use case nhập phim từ nhà cung cấp include usecase tìm nhà cung cấp

Do đó ta có lược đồ usecase như hình vẽ: 
![image](https://user-images.githubusercontent.com/60811649/201270273-7f53796f-b152-4b04-b528-38b45919aca2.png)

 
Trong đó:
Use case quản lí đăng nhập: cho phép quản lí đăng nhập vào hệ thống
Use case tìm nhà cung cấp: cho phép quản lí tìm kiếm và chọn một nhà cung cấp
Use case Nhập phim từ nhà cung cấp: cho phép quản lí thêm thông tin của một bộ phim dựa trên thông tin của nhà cung cấp

c)	Xem thống kê theo doanh thu
Quản lí đăng nhập vào hệ thống -> đề xuất  usecase quản lí đăng nhập
Giao diện xem thống kê -> đề xuất usecase chọn thông tin thống kê
Giao diện xem thống kê phim theo doanh thu -> đề xuất usecase xem thống kê phim theo doanh thu
Giao diện thống kê trong tháng -> đề xuất usecase xem thống kê phim theo doanh thu trong tháng
Giao diện thống kê trong ngày -> đề xuất usecase xem thống kê phim theo doanh thu trong ngày
Giao diện thống kê trong khoảng thời gian -> đề xuất usecase xem thống kê phim theo doanh thu trong khoảng thời gian

Do việc đăng nhập là bắt buộc để hoàn thành việc quản lí thông tin nhà cung cấp nên usecase quản lí thông tin nhà cung cấp include use case đăng nhập
Do phải chọn chức năng chọn thông tin thống kê thì mới được chọn chức năng xem thống kê theo doanh thu nên use case xem thống kê theo doanh thu include use case chọn thông tin thống kê
Do các use case thống kê trong tháng, thống kê trong ngày, thống kê trong khoảng thời gian đều là tuỳ chọn của use case xem thống kê theo doanh thu nên các use case trên có quan hệ extend với use case xem thống kê theo doanh thu
Ta thấy các use case thống kê trong tháng, thống kê trong ngày, thống kê trong khoảng thời gian giống nhau -> đề xuất use case trừu tượng thống kê theo thời gian
Do đó ta có lược đồ usecase như hình vẽ: 
 ![image](https://user-images.githubusercontent.com/60811649/201270294-5fdd53ac-c8c8-4447-8ff9-5ed56d60a80e.png)

Trong đó:
Use case quản lí đăng nhập: cho phép quản lí đăng nhập vào hệ thống
Use case chọn thông tin thống kê: cho phép quản lí chọn các loại thống kê
Use case xem thống kê phim theo doanh thu: cho phép quản lí xem thống kê các bộ phim phim theo doanh thu
Use case thống kê trong tháng: cho phép quản lí xem thống kê của phim theo doanh thu trong tháng được chọn
Use case thống kê trong ngày: cho phép quản lí xem thống kê của phim theo doanh thu trong ngày được chọn
Use case thống kê trong khoảng thời gian: cho phép quản lí xem thống kê của phim theo doanh thu trong khoảng thời gian được chọn
Use case thống kê theo thời gian: cho phép quản lí xem thống kê của phim theo doanh thu dựa trên một khoảng thời gian


2. Kịch bản chuẩn và ngoại lệ (3 chức năng)
Sceratino	Quản lí thông tin nhà cung cấp phim
actor	Quản lí, nhà cung cấp
Pre-condition	Quản lí được nhà cung cấp yêu cầu thêm hoặc xoá hoặc thay đổi thông tin và được gửi thông tin cần thay đổi, Quản lí đăng nhập hệ thống
Post-condition	Thông tin của nhà cung cấp trên hệ thống đã được thêm hoặc sửa hoặc xoá theo yêu cầu
Main event	1 Quản lí nhập user name, password đăng nhập vào hệ thống
2 Giao diện chính của quản lí hiện ra gồm:
-	Chức năng quản lí thông tin nhà cung cấp phim
3 Quản lí chọn chức năng quản lí thông tin nhà cung cấp phim
4 Giao diện quản lí thông tin nhà cung cấp phim hiện ra gồm:
-	Danh sách các nhà cung cấp phim đã có trên hệ thống
STT	Tên	Địa chỉ	Email	Số điện thoại
1	Galaxy	Số 3-Trần phú - Hà Đông-Hà nội	galaxy333@gmail.com	0933000144
2	The movie	Số 41- Phú Đô-Mỹ Đình-Hà Nội	bestmovie1@gmail.com	03386444993
3	Top 1 movie	Số 31 - Quang Trung-Hà Đông-Hà Nội	Top1movie@gmail.com	0922344699
-	Nút thêm nhà cung cấp
-	Nút Sửa nhà cung cấp
-	Nút xoá nhà cung cấp
-	Nút xác nhận
5 Quản lí chọn chức năng sửa nhà cung cấp
6 Giao diện tìm và chọn nhà cung cấp hiện ra gồm ô nhập mã, tên và nút tìm
7 Quản lí nhập The movie vào ô tên và click tìm
8 Giao diện hiện kết quả tìm kiếm nhà cung cấp phim
STT	Tên	Địa chỉ	Email	Số điện thoại
1	The movie	Số 41- Phú Đô-Mỹ Đình-Hà Nội	bestmovie1@gmail.com	03386444993
9 Quản lí chọn nhà cung cấp The movie( dòng 1)
10 Giao diện sửa nhà cung cấp hiện ra gồm:
-	Các ô nhập tên, địa chỉ, email, số điện thoại, mô tả của nhà cung cấp
-	Nút xác nhận lưu
11 Quản lí nhập The best movie và ô tên và bestmovie@gmail.com vào ô email và click xác nhận lưu
12 Giao diện quản lí thông tin nhà cung cấp phim hiện ra
STT	Tên	Địa chỉ	Email	Số điện thoại
1	Galaxy	Số 3-Trần phú - Hà Đông-Hà nội	galaxy333@gmail.com	0933000144
2	The best movie	Số 41- Phú Đô-Mỹ Đình-Hà Nội	bestmovie@gmail.com	03386444993
3	Top 1 movie	Số 31 - Quang Trung-Hà Đông-Hà Nội	Top1movie@gmail.com	0922344699
-	Nút xác nhận lưu
13 Quản lí click vào nút xác nhận lưu
14 Hệ thống thông báo lưu thành công và quay trở lại giao diện chính của quản lí(bước 2)
Ngoại lệ	8 Không có nhà cung cấp nào hiện lên
8.1 Quản lí click vào ok của thông báo
8.2 Hệ thống hiện giao diện tìm nhà cung cấp
8.3 Quản lí nhập và click tìm
8.4 Hệ thống hiện kết quả như bước 8


Sceratino	Nhập phim từ nhà cung cấp
actor	Quản lí, nhà cung cấp
Pre-condition	Phim của nhà cung cấp đã được thêm trên hệ thống, Quản lí đăng nhập hệ thống
Post-condition	Phim của nhà cung cấp được nhập thành công
Main event	1 Quản lí nhập user name, password đăng nhập vào hệ thống
2 Giao diện chính của quản lí hiện ra gồm:
-	Chức năng Nhập phim từ nhà cung cấp
3 Quản lí chọn chức năng Nhập phim từ nhà cung cấp
4 Giao diện Tìm và chọn cung cấp phim hiện ra gồm ô nhập mã, tên và nút tìm 
5 Quản lí nhập galaxy vào ô tên và click tìm
6 Hệ thống hiển thị giao diện kết quả tìm kiếm nhà cung cấp phim gồm:



-	Danh sách các nhà cung cấp phim
STT	Tên	Địa chỉ	Email	Số điện thoại
1	Galaxy	Số 3-Trần phú - Hà Đông-Hà nội	galaxy333@gmail.com	0933000144
-	Nút xác nhận lưu
7 Quản lí chọn nhà cung cấp Galaxy
8 Giao diện tìm và chọn phim hiện ra gồm ô nhập tên, mã và nút tìm
9 Quản lí nhập spiderman vào ô tên và click tìm  
10 Hệ thống hiển thị giao diện kết quả tìm kiếm phim gồm:
-	Danh sách các phim
STT	tên	Thể loại	Năm sản xuất	Ngày bắt đầu chiếu	Quốc gia	Giá nhập
1	Spiderman no way home	Hành động, viễn tưởng	2020	22-9-2022	Mỹ	80.000.000
2	Amazing spiderman 1	Hành động, viễn tưởng	2015	10-9-2022	Mỹ	90.000.000
3	Spiderman far for home	Hành động, viễn tưởng	2018	15-9-2022	Mỹ	70.000.000
-	Nút xác nhận
11 Quản lí chọn phim có tên Spiderman no way home(dòng 1)
12 Thông tin chi tiết của phim hiện ra gồm tên phim, ảnh phim, thể loại , đạo diễn, diễn viên, nội dung phim, quốc gia, năm sản xuất, thời lượng, thời gian công chiếu, giá nhập phim và nút chọn nhập phim
13 Quản lí click vào nhập phim 
14  Giao diện kết quả tìm kiếm phim hiện ra
STT	tên	Thể loại	Năm sản xuất	Ngày bắt đầu chiếu	Quốc gia
1	Amazing spiderman 1	Hành động, viễn tưởng	2015	10-9-2022	Mỹ
2	Spiderman far for home	Hành động, viễn tưởng	2018	15-9-2022	Mỹ
-	Nút xác nhận
15 Quản lí chọn xác nhận
16 Hệ thống hiển thị giao diện tìm và chọn phim:
STT	tên	Thể loại	Năm sản xuất	Ngày bắt đầu chiếu	Quốc gia
1	Spiderman no way home	Hành động, viễn tưởng	2020	22-9-2022	Mỹ
2	Amazing spiderman 1	Hành động, viễn tưởng	2015	10-9-2022	Mỹ
3	Spiderman far for home	Hành động, viễn tưởng	2018	15-9-2022	Mỹ
-	Nút xác nhận
17 Quản lí chọn xác nhận
18 Hệ thống quay trở lại giao diện tìm nhà cung cấp:
STT	Tên	Địa chỉ	Email	Số điện thoại
1	Galaxy	Số 3-Trần phú - Hà Đông-Hà nội	galaxy333@gmail.com	0933000144
-	Nút xác nhận lưu
18 Hệ thống thông báo lưu thành công và quay trở lại giao diện chính của quản lí (bước 2)
Ngoại lệ	6 Không có nhà cung cấp nào hiện lên
6.1 Quản lí click vào ok của thông báo
6.2 Hệ thống hiện giao diện tìm nhà cung cấp
6.3 Quản lí nhập và click tìm
6.4 Hệ thống hiện kết quả như bước 6


10 Không có phim nào hiện lên
10.1 Quản lí click vào ok của thông báo
10.2 Hệ thống hiện giao diện tìm nhà cung cấp
10.3 Quản lí nhập và click tìm
10.4 Hệ thống hiện kết quả như bước 10



Sceratino	Xem thống kê phim theo doanh thu
actor	Quản lí 
Pre-condition	Quản lí đăng nhập hệ thống, 
Post-condition	Quản lí xem thành công thống kê
Main event	1 Quản lí nhập user name, password đăng nhập vào hệ thống
2 Giao diện chính của quản lí hiện ra gồm menu các chức năng: Nhập phim từ nhà cung cấp, Quản lí nhà cung cấp, Xem thống kê…
3 Quản lí chọn chức năng Xem thống kê 
4 Hệ thống hiển thị giao diện chọn thông tin thống kê gồm danh sách các loại thống kê như: thống kê phim theo doanh thu, thống kê phim theo số vé, thống kê nhà cung cấp phim theo doanh thu…
5 Quản lí chọn xem thống kê phim theo doanh thu
6 Hệ thống hiển thị giao diện xem thống kê phim theo doanh thu gồm menu các chức năng: xem thống kê trong tháng, xem thống kê trong ngày, xem thống kê trong khoảng thời gian
7 Quản lí chọn xem thống kê trong tháng
8 Hệ thống hiển thị giao diện xem thống kê trong tháng gồm: ô nhập tháng,ô nhập thứ tự, nút thoát
9 Quản lí nhập tháng 9 vào ô nhập tháng và nhập giảm dần vào ô thứ tự
10 Hệ thống hiển thị danh sách các phim theo thứ tự và tháng đã chọn:
STT	Tên	Thể loại	Nhà cung cấp	Số suất chiếu	Số vé	Doanh thu(usd)
1	Avenger end game	Viễn tưởng	Galaxy	10000	100000	10.000.000
2	Spider man no way home	Viễn tưởng	The best movie	11000	120000	9.000.000
3	Cù lao xác sống	Kinh dị	Galaxy	9000	90000	7.000.000
11 Quản lí chọn phim Avenger end game(dòng 1)
12 Hệ thống hiển thị thống kê chi tiết của phim Avenger end game và nút thoát:
Tên	Avenger end game
Thể loại	Viễn tưởng
Nhà cung cấp	Galaxy
Số suất chiếu	10000
Số vé	100000
Doanh thu(usd)	10.000.000
-	Nút thoát
13 Quản lí chọn thoát
14 Hệ thống quay trở lại giao diện xem thống kê trong tháng
15 Quản lí chọn thoát
16 Hệ thống quay trở lại giao diện xem thống kê phim theo doanh thu
Ngoại lệ	

3.Trích lớp thực thể liên quan (chung)
Các danh từ trừu tượng: hệ thống, trang web, báo cáo thống kê, thông tin -> loại
Các danh từ liên quan đến người: 
Thành viên hệ thống -> Thanhvien : tên, tên đăng nhập, mật khẩu, ngày sinh, địa chỉ, email, điện thoại, vị trí
Quản lí -> Quanli: kế thừa lớp Thanhvien
Nhân viên bán vé -> NhanVienBanVe: kế thừa lớp ThanhVien
Khách hàng->KhachHang: kế thừa lớp Thanhvien

Các danh từ liên quan đến vật:
Phòng chiếu -> PhongChieu: tên, sức chứa, mô tả
Ghế ngồi -> GheChieu: tên, hàng, số
Loại Ghế -> LoaiGhe: tên , giá
Rạp phim->Rap: tên, mô tả, DiaChi
Các danh từ liên quan đến thông tin:

Nhà cung cấp -> NhaCungCap: tên, địa chỉ, email, số điện thoại, mô tả 
Phim -> Phim: Tên, mô tả, ngày công chiếu, đạo diễn, diễn viên,  năm sản xuất
Thể loại -> TheLoai: tên, mô tả
Vé chiếu -> VeChieu: tên, loại, giá
Thống kê phim theo doanh thu -> TkePhimTheoDoanhThu: kế thừa lớp Phim. tongSoVe, doanhThu, soSuatChieu
Thống kê phim trong tháng -> TkePhimTrongThang: kế thừa lớp TkePhimTheoDoanhThu, tháng
Thống kê phim trong ngày -> TkePhimTrongNgay: kế thừa lớp TkePhimTheoDoanhThu, ngày
Thống kê phim trong khoảng thời gian: -> TkePhimTrongKhoangTg: kế thừa lớp TkePhimTheoDoanhThu, Ngày bắt đầu, ngày kết thúc
Xác định quan hệ số lượng giữa các thực thể:
Một nhà cung cấp có nhiều phim -> quan hệ giữa Phim và NhaCungCap là 1-n
Một Phim có nhiều Thể loại, một thể loại có nhiều phim->Phim –TheLoai là n-n -> đề xuất lớp TheLoai –Phim xác định duy nhất một phim và một thể loại
Một Phim có thể có nhiều suất chiếu , một suất chiếu chỉ có một phim -> quan hệ giữa SuatChieu và Phim là 1-n
Một Phòng chiếu có thể có nhiều Suất chiếu -> quan hệ giữa SuatChieu và PhongChieu là 1-n
Một Phòng chiếu gồm nhiều ghế chiếu -> quan hệ giữa GheChieu và Phòng Chieu là 1-n
Một Suất chiếu có thể có nhiều vé chiếu -> quan hệ giữa VeChieu và SuatChieu là 1-n
Một vé chiếu xác định một ghế chiếu -> quan hệ giữa VeChieu và GheChieu là 1-1
Một Loại ghế gồm nhiều ghế chiếu -> quan hệ giữa LoaiGhe và GheChieu là 1-n
Một khách hàng có thể mua nhiều vé -> quan hệ giữa VeChieu và KhachHang là 1-n
Một vé chiếu được bán bởi 1 nhân viên bán hàng -> quan hệ giữa VeChieu và NhanVienBanHang là 1-1
Một rạp gồm nhiều phòng chiếu -> quan hệ giữa RapPhim và PhongChieu là 1-n
Xác định quan hệ đối tượng giữa các thực thể:
Phòng chiếu là thành phần của Rạp phim
Ghế chiếu là thành phần của Phòng chiếu
Thông tin của Ghế chiếu có trong Vé chiếu
Thông tin của Suất chiếu có trong Vé chiếu
Thông tin của Phòng chiếu có trong 	Suất chiếu
Thông tin của Phim có trong Suất chiếu
Thông tin của nhà cung cấp có trong Phim
Phim và Thể loại liên kết tạo ra TheLoai-Phim duy nhất
Thông tin của Loại ghế nằm trong ghế chiếu
Lớp TkePhimTheoDoanhThu kế thừa lớp phim
TkePhimTrongThang, TkePhimTrongNgay, TkePhimTrongKhoangTg kế thừa TkePhimTheoDoanhThu
 ![image](https://user-images.githubusercontent.com/60811649/201270328-392f219c-042f-4d02-b41a-36bece41f910.png)

4. Biểu đồ trạng thái (3 chức năng)
a.	Quản lí thông tin nhà cung cấp
Từ giao diện đăng nhập nếu người dùng điền thông tin đăng nhập hợp lệ và click đăng nhập thì sẽ hiện ra giao diện chính của quản lí 

Từ giao diện chính của quản lí nếu người dùng click quản lí thông tin nhà cung cấp thì hệ thống sẽ chuyển sang giao diện quản lí thông tin nhà cung cấp

Từ giao diện quản lí thông tin nhà cung cấp nếu người dùng chọn thêm nhà cung cấp thì hệ thống sẽ chuyển sang giao diện thêm nhà cung cấp

Từ giao diện thêm nhà cung cấp nếu người dùng điền thông tin nhà cung cấp hợp lệ và click lưu thì sẽ chuyển sang giao diện quản lí thông tin nhà cung cấp

Từ giao diện quản lí thông tin nhà cung cấp nếu người dùng chọn sửa nhà cung cấp thì hệ thống sẽ chuyển sang giao diện tìm nhà cung cấp

Từ giao diện tìm nhà cung cấp nếu người dùng chọn một nhà cung cấp thì hệ thống sẽ chuyển sang giao diện sửa nhà cung cấp

Từ giao diện sửa nhà cung cấp nếu người dùng điền thông tin nhà cung cấp hợp lệ và click lưu thì sẽ chuyển sang giao diện tìm nhà cung cấp

Từ giao diện tìm nhà cung cấp nếu người dùng chọn lưu thì hệ thống sẽ chuyển sang giao diện quản lí nhà cung cấp

Từ giao diện quản lí thông tin nhà cung cấp nếu người dùng chọn xóa nhà cung cấp thì hệ thống sẽ chuyển sang giao diện tìm nhà cung cấp

Từ giao diện tìm nhà cung cấp nếu người dùng chọn một nhà cung cấp thì hệ thống sẽ thông báo xác nhận xóa nhà cung cấp

Từ thông báo xác nhận xóa nhà cung cấp nếu người dùng chọn ok thì hệ thống sẽ chuyển về giao diện tìm nhà cung cấp
 ![image](https://user-images.githubusercontent.com/60811649/201270341-0d221b08-7d7a-46d9-a2f2-59be31a8904f.png)

b.	Nhập phim từ nhà cung cấp
Từ giao diện đăng nhập nếu người dùng điền thông tin đăng nhập hợp lệ và click đăng nhập thì sẽ hiện ra giao diện chính của quản lí 

Từ giao diện chính của quản lí nếu người dùng click nhập phim từ nhà cung cấp thì hệ thống sẽ chuyển sang giao diện tìm và chọn nhà cung cấp

Từ giao diện tìm và chọn nhà cung cấp nếu người dùng chọn 1 nhà cung cấp thì hệ thống sẽ chuyển sang giao diện tìm và chọn phim của nhà cung cấp
Từ giao diện tìm và chọn phim của nhà cung cấp nếu người dùng chọn một phim thì hệ thống sẽ chuyển sang giao diện thông tin chi tiết của phim
 ![image](https://user-images.githubusercontent.com/60811649/201270355-ba58faf2-54f1-4e33-9eba-5457fb29d64c.png)

c.	Thống kê phim theo doanh thu
Từ giao diện đăng nhập nếu người dùng điền thông tin đăng nhập hợp lệ và click đăng     nhập thì sẽ hiện ra giao diện chính của quản lí 

Từ giao diện chính của quản lí nếu người dùng click xem thống kê thì hệ thống sẽ chuyển sang giao diện xem thống kê

Từ giao diện xem thống kê nếu người dùng click xem thống kê theo doanh thu thì hệ thống sẽ chuyển sang giao diện xem thống kê theo doanh thu

Từ giao diện xem thống kê theo doanh thu kê nếu người dùng click thống kê trong tháng
hệ thống sẽ chuyển sang giao diện xem thống kê trong tháng

Từ giao diện xem thống kê trong tháng nếu người dùng chọn tháng và thứ tự sắp xếp thì hệ thống sẽ hiển thị danh sách phim theo tháng

Từ giao diện xem thống kê trong tháng nếu người dùng chọn một phim thì hệ thống sẽ hiển thị giao diện thống kê chi tiết của phim

Từ giao diện xem thống kê theo doanh thu kê nếu người dùng click thống kê trong ngày
hệ thống sẽ chuyển sang giao diện xem thống kê trong tháng

Từ giao diện xem thống kê trong tháng nếu người dùng chọn ngày và thứ tự sắp xếp thì hệ thống sẽ hiển thị danh sách phim theo ngày

Từ giao diện xem thống kê trong ngày nếu người dùng chọn một phim thì hệ thống sẽ hiển thị giao diện thống kê chi tiết của phim
Từ giao diện xem thống kê theo doanh thu kê nếu người dùng click thống kê trong khoảng thời gian hệ thống sẽ chuyển sang giao diện xem thống kê trong tháng

Từ giao diện xem thống kê trong khoảng thời gian nếu người dùng chọn tháng và thứ tự sắp xếp thì hệ thống sẽ hiển thị danh sách phim theo khoảng thời gian

Từ giao diện xem thống kê trong khoảng thời gian nếu người dùng chọn một phim thì hệ thống sẽ hiển thị giao diện thống kê chi tiết của phim

![image](https://user-images.githubusercontent.com/60811649/201270377-8265c3fd-e65c-4f4d-8a5a-32b4020e2d39.png)

 
5. Biểu đồ lớp pha phân tích (3 chức năng)
a.	Quản lí thông tin nhà cung cấp
Giao diện đăng nhập -> đề xuất lớp Loginview foomg các thành phần:
inpUserName, inpPassword, inpSubmit
Để chuyển sang giao diện chính của quản lí cần xử lí hệ thống:
Kiểm tra người dùng đã đăng nhập chưa 
Input:  user name, password
Đề xuất phương thức checkLogin() gán cho lớp ThanhVien
Giao diện chính của quản lí -> QuanLiHomeView gồm các thành phần:
inpQuanLiThongTinNcc
        Giao diện quản lí thông tin nhà cung cấp-> QuanLiThongTinNccView gồm các thành phần:
	subSuaNcc
	subThemNcc
	subXoaNcc
        Giao diện thêm nhà cung cấp -> ThemNccView gồm các thành phần:
	inpTen
	inpDiaChi
	inpEmail
	inpSDT
	inpMota
	subSave	
 Để thêm nhà cung cấp cần xử lí dưới hệ thống:
	Input: tên, địa chỉ, email, số điện thoại, mô tả
	Đề xuất phương thức addNcc() gán cho lớp NhaCungCap
Giao diện sửa nhà cung cấp -> SuaNccView gồm các thành phần:
	inpTen
	inpDiaChi
	inpEmail
	inpSDT
	inpMota
	subSave	
Giao diện xóa nhà cung cấp -> XoaNccView gồm các thành phần:
	subDongY
	subHuy
Giao diện tìm nhà cung cấp -> SearchNccView gồm các thành phần:
	inpIdNcc
	inpNameNcc
	inpSearch
	outInNcc	
Để sửa nhà cung cấp cần xử lí dưới hệ thống:
	Input: tên, địa chỉ, email, số điện thoại, mô tả
	Đề xuất phương thức editNcc() gán cho lớp NhaCungCap
Để xóa nhà cung cấp cần xử lí dưới hệ thống:
	Input: id 
	Đề xuất phương thức deleteNcc() gán cho lớp NhaCungCap
Để tìm nhà cung cấp cần xử lí dưới hệ thống:
	Input: keyword
	Đề xuất phương thức getNccByName() gán cho lớp NhaCungCap

 
![image](https://user-images.githubusercontent.com/60811649/201270412-df507613-7f05-4765-b30f-8e4ecb104214.png)

b.	Nhập phim từ nhà cung cấp

Giao diện đăng nhập -> đề xuất lớp Loginview foomg các thành phần:
inpUserName, inpPassword, inpSubmit
Để chuyển sang giao diện chính của quản lí cần xử lí hệ thống:
Kiểm tra người dùng đã đăng nhập chưa 
Input:  user name, password
Đề xuất phương thức checkLogin() gán cho lớp ThanhVien
Giao diện chính của quản lí -> QuanLiHomeView gồm các thành phần:
subNhapPhim


Giao diện tìm nhà cung cấp -> SearchNccView gồm các thành phần:
	inpIdNcc
	inpNameNcc
	inpSearch
	outInNcc
Giao diện tìm phim-> SearchPhimView gồm các thành phần:
	inpIdPhim
	inpNamePhim
	inpSearch
	outInPhim
Giao diện xem thông tin chi tiết phim-> NhapPhimView gồm các thành phần:
	subNhapPhim
	subHuy
	outPhim

Để tìm nhà cung cấp cần xử lí dưới hệ thống:
	Input: keyword
	Đề xuất phương thức getNccByName() gán cho lớp NhaCungCap
Để tìm phim cần xử lí dưới hệ thống:
	Input: keyword
	Đề xuất phương thức getPhimByName() gán cho lớp Phim
Để tìm phim cần xử lí dưới hệ thống:
	Input: id 
	Đề xuất phương thức nhapPhim() gán cho lớp Phim
 ![image](https://user-images.githubusercontent.com/60811649/201270568-71426ae0-3e30-41da-94e9-6e62e47e029b.png)

c.	Thống kê phim theo doanh thu

Giao diện đăng nhập -> đề xuất lớp Loginview foomg các thành phần:
inpUserName, inpPassword, inpSubmit
Để chuyển sang giao diện chính của quản lí cần xử lí hệ thống:
Kiểm tra người dùng đã đăng nhập chưa 
Input:  user name, password
Đề xuất phương thức checkLogin() gán cho lớp ThanhVien
Giao diện chính của quản lí -> QuanLiHomeView gồm các thành phần:
subxemThongKe
Giao diện xem thống  kê -> XemThongKeView gồm các thành phần:
	subTkePhimTheoDoanhTHu
Giao diện Thống kê phim theo doanh thu-> TkPhimTheoDoanhTHuView gồm các thành phần:
subTkPhimTrongThang
subTkPhimTrongNgay
subTkPhimTrongKhoangTg
Giao diện Thống kê phim trong tháng-> TkPhimTrongThangView gồm các thành phần:
	inpThang
	inpThuTu
	subThoat
	outSubDsTkPhimTrongThang
Giao diện Thống kê phim trong ngày-> TkPhimTrongNgayView gồm các thành phần:
	inpNgay
	inpThuTu
	subThoat
	outSubDsTkPhimTrongNgay
Giao diện Thống kê phim trong khoảng thời gian-> TkPhimTrongKhoangTgView gồm các thành phần:
	inpNgayBD
	inpNgayKt
	inpThuTu
	subThoat
	outSubDsTkPhimTrongKhoangTg
Để lấy danh sách thống kê phim trong tháng cần xử lí dưới hệ thống:
Input: tháng
output danh sách thống kê phim
Đề xuất phương thức getListTkPhimTrongThang() gán cho lớp TkePhimTrongThang
Để lấy danh sách thống kê phim trong ngày cần xử lí dưới hệ thống:
Input: ngày
Output: danh sách thống kê phim
Đề xuất phương thức getListTkPhimTrongNgay() gán cho lớp TkePhimTrongNgay

Để lấy danh sách thống kê phim trong ngày cần xử lí dưới hệ thống:
Input: ngày bắt đầu, ngày kết thúc
Output: danh sách thống kê phim
Đề xuất phương thức getListTkPhimTrongKhoangTg() gán cho lớp TkePhimTrongKhoangTg
Giao diện Thống kê phim chi tiết-> TkChiTietPhimView gồm các thành phần:
	outTkPhim
	subThoat
Để lấy thống kê chi tiết của phim cần xử lí dưới hệ thống:
	Input: idPhim
	Output: thống kê chi tiết của phim
	Đề xuất phương thức getOneTkePhim() gán cho lớp TkePhimTheoDoanhThu
 
![image](https://user-images.githubusercontent.com/60811649/201270670-0d4b1977-4826-490c-b83e-5fa726c6c6e4.png)


6. Biểu đồ giao tiếp pha phân tích (3 chức năng)
a.	Quản lí thông tin nhà cung cấp

Kịch bản chuẩn v2:
1 Nhà cung cấp yêu cầu quản lí thay đổi thông tin 
2 Tại giao diện LoginView quản lí nhập thông tin và click login
3 Lớp LoginView gọi lớp ThanhVien để kiểm tra đăng nhập
4 Lớp ThanhVien kiểm tra đăng nhập 
5 Lớp ThanhVien trả lại kết quả cho lớp LoginView
6 Lớp LoginView gọi lớp QuanLiHomeView
7 Lớp QuanLiHomeView hiển thị cho người dùng
8 Quản Lí chọn quanLiThongTinNcc tại QuanLiHomeView
9 Lớp QuanLiHomeView gọi lớp QuanLiThongTinNccView
10 Lớp QuanLiThongTinNccView hiển thị cho quản lí
11 Quản Lí chọn suaNcc
12 Lớp QuanLiThongTinNccView gọi lớp SearchNccView
13 Lớp SearchNccView hiển thị cho quản lí
14 Người dùng nhập từ khóa và click search
15 Lớp SearchNccView gọi Lớp NhaCungCap để lấy danh sách nhà cung cấp
16 Lớp NhaCungCap tìm các nhà cung cấp có chứa từ khóa
17 Lớp NhaCungCap trả về danh sách nhà cung cấp cho Lớp SearchNccView
18 Lớp SearchNccView hiển thị cho quản lí
19 Quản lí chọn một nhà cung cấp
20 Lớp SearchNccView gọi lớp SuaNccView
21 Lớp SuaNccView hiển thị cho quản lí
22 Quản lí nhập thông tin và chọn lưu
23 Lớp SuaNccView gọi lớp NhaCungCap yêu cầu sửa nhà cung cấp
24 Lớp NhaCungCap thực hiện sửa nhà cung cấp
25 Lớp NhaCungCap trả về thông tin cho lớp SuaNccView
26 Lớp SuaNccView gọi lớp SearchNccView
27 Lớp SearchNccView hiển thị cho quản lí
28 Quản lí chọn lưu
29 Lớp SearchNccView gọi lớp QuanLiThongTinNccView
30 Lớp QuanLiThongTinNccView hiển thị cho quản lí

Ta có biểu đồ tuần tự và biểu đồ cộng tác như sau:
 
 ![image](https://user-images.githubusercontent.com/60811649/201270717-55660559-6c15-4fcc-90b8-0a4dcb8290ef.png)

b.	Nhập phim từ nhà cung cấp

Kịch bản chuẩn v2: 
1 Tại giao diện LoginView quản lí nhập thông tin và click login
2 Lớp LoginView gọi lớp ThanhVien để kiểm tra đăng nhập
3 Lớp ThanhVien kiểm tra đăng nhập 
4 Lớp ThanhVien trả lại kết quả cho lớp LoginView
5 Lớp LoginView gọi lớp QuanLiHomeView
6 Lớp QuanLiHomeView hiển thị cho người dùng
7 Quản Lí chọn nhapPhim tại QuanLiHomeView
8 Lớp QuanLiHomeView gọi SearchNccView
9 Lớp SearchNccView hiển thị cho quản lí
10 Người dùng nhập từ khóa và click search
11 Lớp SearchNccView gọi Lớp NhaCungCap để lấy danh sách nhà cung cấp
12 Lớp NhaCungCap tìm các nhà cung cấp có chứa từ khóa
13 Lớp NhaCungCap trả về danh sách nhà cung cấp cho Lớp SearchNccView
14 Lớp SearchNccView hiển thị cho quản lí 
15 Quản lí chọn 1 nhà cung cấp
16 Lớp SearchNccView gọi lớp SearchPhimView
17 Lớp SearchPhimView hiển thị cho quản lí
18 Người dùng nhập từ khóa và click search
19 Lớp SearchPhimView gọi Lớp Phim để lấy danh sách nhà cung cấp
20 Lớp Phim tìm các phim có chứa từ khóa
21 Lớp Phim trả về danh sách nhà cung cấp cho Lớp SearchPhimView
22 Lớp SearchPhimView hiển thị cho quản lí 
23 Quản lí chọn 1 phim
24 Lớp SearchPhimView gọi NhapPhimView
25 Lớp NhapPhimView hiên thị cho quản lí
26 Quản lí chọn nhapPhim
27 Lớp NhapPhimView gọi Phim yêu cầu nhập phim
28 Lớp Phim thực nhiện nhập phim
29 Lớp Phim trả về dữ liệu cho NhapPhimView
30 Lớp NhapPhimView gọi HoaDon yêu cầu lưu hóa đơn
31 lớp HoaDon thực hiện lưu hóa đơn
32 Lớp HoaDon trả về dữ liệu cho NhapPhimView
33 Lớp NhapPhimView gọi SearchPhimView
34 Lớp SearchPhimView hiển thị cho người dùng
Ta có biểu đồ tuần tự và biểu đồ cộng tác như sau:
![image](https://user-images.githubusercontent.com/60811649/201270742-c280ab50-1ffa-4c3b-8da5-8f8f48958d2a.png)

 
 
c.	Quản lí thông tin nhà cung cấp

Kịch bản chuẩn v2: 
1 Tại giao diện LoginView quản lí nhập thông tin và click login
2 Lớp LoginView gọi lớp ThanhVien để kiểm tra đăng nhập
3 Lớp ThanhVien kiểm tra đăng nhập 
4 Lớp ThanhVien trả lại kết quả cho lớp LoginView
5 Lớp LoginView gọi lớp QuanLiHomeView
6 Lớp QuanLiHomeView hiển thị cho người dùng
7 Quản Lí chọn xemThongKe tại QuanLiHomeView
8 Lớp QuanLiHomeView gọi Lớp XemThongKeView
9 Lớp XemThongKeView hiển thị cho quản lí
10 Quản lí chọn tkPhimTheoDoanhThu
11 Lớp XemThongKeView gọi lớp TkePhimTheoDoanhThuView
12 Lớp TkePhimTheoDoanhThuView hiển thị cho quản lí
13 Quản lí chọn thongKePhimTrongThang
14 Lớp TkePhimTheoDoanhThuView gọi Lớp TkePhimTrongThangView
15 Lớp TkePhimTrongThangView hiển thị cho quản lí
16 Quản lí chọn tháng va thứ tự sắp xếp
17 Lớp TkePhimTrongThangView gọi Lớp TkePhimTrongThang yêu cầu lấy danh sách thống kê phim trong tháng
18 Lớp TkePhimTrongThang lấy danh sách thống kê
19 Lớp TkePhimTrongThang trả lại dữ liệu cho TkePhimTrongThangView
20 Lớp TkePhimTrongThangView hiển thị cho quản lí
21 Quản lí chọn 1 phim 
22 Lớp TkePhimTrongThangView gọi lớp TkePhimChiTietView
23 Lớp TkePhimChiTietView gọi lớp TkePhimTrongThang yêu cầu lấy thống kê chi tiết của phim
24 Lớp TkePhimTrongThang thực hiện lấy thống kê chi tiết của phim
25 Lớp TkePhimTrongThang trả lại thông tin cho lớp TkePhimChiTietView
26 Lớp TkePhimChiTietView hiển thị cho quản lí
27 Quản lí chọn thoát
28 Lớp TkePhimChiTietView gọi lớp TkePhimTrongThangView
29 Lớp TkePhimTrongThangView hiển thị cho quản lí
30 Quản lí chọn thoát
31 Lớp TkePhimTrongThangView gọi lớp TkePhimTheoDoanhThu
32 Lớp TkePhimTheoDoanhThu hiển thị cho quản lí
Ta có biểu đồ tuần tự và biểu đồ cộng tác như sau:
![image](https://user-images.githubusercontent.com/60811649/201270756-dffb0141-a2f6-40f7-b136-2624d7b51098.png)

 

 

7. Thiết kế lớp thực thể liên quan (chung)
-	Bổ sung thuộc tính id cho các lớp thực thể trừ các lớp: QuanLi, KhachHang, NhanVienBanVe, TkePhimTrongThang, TkePhimTrongKhoangTg, TkePhimTrongNgay
-	Bổ sung kiểu dữ liệu của thuộc tính theo ngôn ngữ lập trình Java
-	Quan hệ Phim-TheLoai -> Theloai-Phim  được chuyển thành Phim chứa TheLoai-Phim và TheLoai-Phim chứa TheLoai
-	Bổ sung các thuộc tính thành phần của quan hệ hợp thành/gắn chặt, ta thu được biểu đồ lớp thực thể pha thiết kế.
![image](https://user-images.githubusercontent.com/60811649/201270779-083484a6-2985-458e-afb1-f318f558c38f.png)


8. Thiết kế CSDL liên quan (chung)
Bước 1 Mỗi lớp thực thể đề xuất bảng tương ứng:

NhaCungCap -> tblNhaCungCap
HoaDonNhap -> tblHoaDonNhap
Phim -> tblPhim
TheLoai-Phim -> tblTheLoai-Phim
TheLoai -> tblTheLoai
ThanhVien -> tblThanhVien
SuatChieu -> tblSuatChieu
PhongChieu -> tblPhongChieu
RapPhim -> tblRapPhim
VeChieu -> tblVeChieu
GheChieu -> tblGheChieu
LoaiGhe -> tblLoaiGhe

Bước 2 Đưa thuộc tính không phải đối tượng của lớp thực thể thành thuộc tính của bảng tương ứng:
tblNhaCungCap có các thuộc tính: ten, id, diachi, email, sdt, mota
tblHoaDonNhap có các thuộc tính: id, ngayNhap, giaNhap
tblPhim có các thuộc tính: id, ten, moTa, ngayCongChieu, daoDien, dienVien, namSx, giaNhapPhim
tblTheLoai-Phim có các thuộc tính: id
tblTheLoai có các thuộc tính : id, ten, mota
tblThanhVien có các thuộc tính: id ten userName address password dob email sdt vi_tri
tblSuatChieu có các thuộc tính : id gioBatDau gioKetThuc ngayChieu giaVeTrongSuatChieu
tblVeChieu có các thuộc tính : ngayBan 
tblPhongChieu có các thuộc tính : sucChua, moTa
tblGheChieu có các thuộc tính : ten, hang, so
tblRapPhim có các thuộc tính : ten, moTa, diaChi
tblLoaiGhe có các thuộc tính : ten, giaLoaiGhe

Bước 3 Chuyến quan hệ số lượng giữa các lớp thực thể thành quan hệ số lượng giữa các bảng:
tblNhaCungCap quan hệ 1-n với tblHoaDonNhap
tblPhim quan hệ 1-1 với tblHoaDonNhap
tblPhim quan hệ 1-n với tblTheLoai-Phim
tblTheLoai quan hệ 1-n với tblTheLoai-Phim
tblPhim quan hệ 1-n với tblSuatChieu
tblSuatChieu quan hệ 1-n với tblVeChieu 
tblSuatChieu quan hệ 1-1 với tblPhongChieu
tblPhongChieu quan hệ 1-n với tblGheChieu
tblGheChieu quan hệ 1-1 với tblVeChieu
tblRapPhim quan hệ 1-n với tblPhongChieu
tblGheChieu quan hệ 1-n với tblLoaiGhe
Bước 4: Bổ sung các thuộc tính khóa. Khóa chính được thiết lập với thuộc tính id của các bảng tương ứng
tblHoaDonNhap có 1 khóa ngoại là tblNhaCungCapid 
tblPhim có 1 khóa ngoại là tblHoaDonNhapid
tblTheLoai-Phim có 2 khóa ngoại là : tblPhimid, tblTheLoaiid
tblSuatChieu có 2 khóa ngoại là: tblPhimid, tblPhongChieuid,
tblPhongChieu có 1 khóa ngoại là : tblRapPhimid
tblVeChieu có 2 khóa ngoại là : tblThanhVienid, tblSuatChieuid
tblGheChieu có 2 khóa ngoại là : tblVeChieuid, tblPhongChieuid
tblLoaiGhe có 1 khóa ngoại là : tblGheChieuid

Bước 5: loại bỏ các thuộc tính dẫn xuất ta thu được biểu đồ csdl:
 ![image](https://user-images.githubusercontent.com/60811649/201270801-2d30b175-8cbb-4414-b780-af4dd542d453.png)


9. Thiết kế BD đồ lớp (3 chức năng)
Chức năng quản lí thông tin nhà cung cấp:
Tầng giao diện có các trang jsp: XoaNccView.jsp, SuaNccView.jsp, SearchNccView.jsp, ThemNccView, QuanLiThongTinNccView.jsp, QuanLiHomeView.jsp, loginView.jsp, 
Tầng thao tác với dữ liệu ta có các lớp DAO: NhaCungCapDAO, ThanhVienDAO
Còn lại là các lớp thực thể
 ![image](https://user-images.githubusercontent.com/60811649/201270848-be01d248-affe-4f55-9003-02398acbc501.png)

Chức năng nhập phim từ nhà cung cấp:
Tầng giao diện có các trang jsp SearchNccView.jsp, QuanLiHomeView.jsp, loginView.jsp, SearchPhimView.jsp, NhapPhimView.jsp, NotFoundView.jsp, KhongTheNhapPhimView.jsp
Tầng thao tác với dữ liệu ta có các lớp DAO: NhaCungCapDAO, ThanhVienDAO, HoaDonNhapDAO, PhimDAO
Còn lại là các lớp thực thể
 ![image](https://user-images.githubusercontent.com/60811649/201270835-410a7e37-2d4f-4b84-84df-8fea2ce364e9.png)

Chức năng xem thống kê phim theo doanh thu:
Tầng giao diện có các trang jsp:  QuanLiHomeView.jsp, loginView.jsp, XemThongKeView.jsp, TkeChiTietPhimView.jsp, TkPhimTrongNgayView.jsp, TkPhimTrongKhoangTgView.jsp, TkPhimTrongThangView.jsp, TkPhimTheoDoanhThuView.jsp
Tầng thao tác với dữ liệu ta có các lớp DAO: ThanhVienDAO, TkePhimTrongKhoangTgDAO, TkePhimTrongThangDAO, TkePhimTrongNgayDAO
Còn lại là các lớp thực thể
![image](https://user-images.githubusercontent.com/60811649/201270865-6e555f4f-f9c7-44ae-b9f7-12c9f2cd3576.png)


10 Thiết kế BD hoạt động (3 chức năng)
Mỗi hành động trong biểu đồ hoạt động tương ứng với một phương thức đã thiết kế trong biểu đồ lớp
Chức năng quản lí thông tin nhà cung cấp:
 ![image](https://user-images.githubusercontent.com/60811649/201270877-4ade37f4-243f-4d60-a5ba-9f27ed87b456.png)

Chức năng nhập phim từ nhà cung cấp:
 ![image](https://user-images.githubusercontent.com/60811649/201270891-d4e51a5c-9e6e-4e94-ad9f-6391f9b8a5cf.png)

Chức năng xem thống kê phim theo doanh thu:
 ![image](https://user-images.githubusercontent.com/60811649/201270900-832ae2c3-2b31-4690-876f-af46e6fcedf2.png)

11. Thiết kế BD tuần tự (3 chức năng)
Chức năng quản lí thông tin nhà cung cấp:
Kịch bản chuẩn v3:
1 Nhà cung cấp yêu cầu sửa thông tin 
2 Nhân viên quản lí đăng nhập vào hệ thống
3 trang loginView.jsp gọi lớp ThanhVien để đóng gói thông tin thành viên
4 Lớp ThanhVien đóng gói thông tin thực thể
5 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
6 Trang loginView.jsp gọi lớp ThanhVienDAO yêu cầu gọi hàm checkLogin()
7 lớp ThanhVienDAO gọi hàm checkLogin()
8 Lớp ThanhVienDAO gọi lớp ThanhVien để đóng gói thông tin thành viên
9 Lớp ThanhVien đóng gói thông tin thực thể
10 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
11 trang loginView.jsp gọi trang QuanLyHomeView.jsp
12 trang QuanLyHomeView.jsp hiển thị thông tin cho quản lí
13 quản lí click quản lý thông tin ncc
14 trang QuanLyHomeView.jsp gọi trang QuanLyThongTinNccView.jsp
15 trang QuanLyThongTInNccView.jsp hiển thị thông tin
16 quản lí click sửa ncc
17 trang QuanLyThongTinNccView.jsp gọi trang SearchNccVIew.jsp 
18 trang SearchNccVIew.jsp hiển thị thông tin cho quản lí
19 quản lí nhập thông tin và click search
20 trang SearchNccView.jsp gọi lớp NhaCungCapDAO yêu cầu gọi hàm getNccByName()
21 lớp NhaCungCapDAO gọi hàm getNccByName()
22 lớp NhaCungCapDAO gọi lớp NhaCungCap yêu cầu đóng gói thông tin nhà cung cấp
23 lớp NhaCungCap thực hiện đóng gói thông tin
24 lớp NhaCungCap trả về thông tin cho lớp NhaCungCapDAO
25 lớp NhaCungCapDAO trả về thông tin cho trang SearchNccVIew.jsp
26 trang SearchNccVIew.jsp hiển thị thông tin cho quản lí
27 quản lí chọn một nhà cung cấp
28 trang SearchNccVIew.jsp gọi trang SuaNcc.jsp
29 trang SuaNcc.jsp hiển thị thông tin cho quản lí
30 quản lí nhập thông tin và chọn lưu
31 trang SuaNcc.jsp gọi lớp NhaCungCap yêu cầu đóng gói thông tin nhà cung cấp
32 lớp NhaCungCap thực hiện đóng gói thông tin
33 lớp NhaCungCap trả về thông tin cho lớp SuaNcc.jsp
34 trang SuaNcc.jsp gọi lớp NhaCungCapDAO yêu cầu gọi hàm editNcc()
35 lớp NhaCungCapDAO gọi hàm editNcc()
36 lớp NhaCungCapDAO trả về thông tin cho trang SuaNcc.jsp
37 trang SuaNcc.jsp gọi trang SearchNccVIew.jsp
38 trang SearchNccView.jsp hiển thị thông tin cho quản lí
 ![image](https://user-images.githubusercontent.com/60811649/201270911-78e12233-144c-4cce-8f5b-3d414b5b5f21.png)

Chức năng nhập phim từ nhà cung cấp:
Kịch bản chuẩn v3: 
1 Nhân viên quản lí đăng nhập vào hệ thống
2 trang loginView.jsp gọi lớp ThanhVien để đóng gói thông tin thành viên
3 Lớp ThanhVien đóng gói thông tin thực thể
4 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
5 Trang loginView.jsp gọi lớp ThanhVienDAO yêu cầu gọi hàm checkLogin()
6 lớp ThanhVienDAO gọi hàm checkLogin()
7 Lớp ThanhVienDAO gọi lớp ThanhVien để đóng gói thông tin thành viên
8 Lớp ThanhVien đóng gói thông tin thực thể
9 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
10 trang loginView.jsp gọi trang QuanLyHomeView.jsp
11 trang QuanLyHomeView.jsp hiển thị thông tin cho quản lí
12 quản lí click Nhập phim từ Ncc
13 trang QuanLyHomeView.jsp gọi trang SearchNccView.jsp
14 trang SearchNccView.jsp hiển thị thông tin cho quản lí
15 quản lí nhập thông tin tìm kiếm và click search
16 trang SearchNccView.jsp gọi lớp NhaCungCapDAO  yêu cầu gọi hàm getNccByName()
17 lớp NhaCungCapDAO gọi hàm getNccByName()
18 lớp NhaCungCapDAO gọi lớp NhaCungCap yêu cầu đóng gói thông tin 
19 lớp NhaCungCap thực hiện đóng gói thông tin
20 lớp NhaCungCap trả về thông tin cho lớp NhaCungCapDAO
21 lớp NhaCungCapDAO trả về thông tin cho trang SearchNccVIew.jsp
22 trang SearchNccVIew.jsp hiển thị thông tin cho quản lí
23 quản lí chọn một nhà cung cấp
24 trang SearchNccView.jsp gọi trang SearchPhimview.jsp
25 trang SearchPhimview.jsp hiển thị thông tin cho quản lí
26 quản lí nhập thông tin tìm kiếm và click search
27 trang SearchPhimView.jsp gọi lớp PhimDAO  yêu cầu gọi hàm getPhimByName()
28 lớp PhimDAO  gọi hàm getPhimByName()
29 lớp PhimDAO  gọi lớp Phim yêu cầu đóng gói thông tin
30 lớp Phim thực hiện đóng gói thông tin
31 lớp Phim trả về thông tin cho lớp PhimDAO
32 lớp PhimDAO trả về thông tin cho trang SearchPhimView.jsp
33 trang SearchPhimView.jsp hiển thị thông tin cho quản lí
34 quản lí chọn một phim
35 trang SearchPhimView.jsp gọi trang NhapPhimView.jsp
36 trang NhapPhimView.jsp hiển thị thông tin cho quản lí
37 quản lí click nhập phim
38 trang NhapPhimView.jsp gọi lớp Phim yêu cầu đóng gói thông tin
39 lớp Phim trả về thông tin cho trang NhapPhimView.jsp
40 lớp Phim trả về thông tin cho trang NhapPhimView.jsp
41 trang NhapPhimView.jsp gọi lớp PhimDAO  yêu cầu gọi hàm checkPhim() và nhapPhim()
42 lớp PhimDAO  gọi hàm checkPhim()
43 lớp PhimDAO gọi hàm nhapPhim()
44 lớp PhimDAO gọi lớp HoaDonNhap yêu cầu đóng gói thông tin hóa đơn
45 lớp HoaDonNhap thực hiện đóng gói thông tin
46 lớp HoaDonNhap trả thông tin về cho lớp PhimDAO
47 lớp PhimDAO gọi lớp HoaDonNhapDAO yêu cầu gọi hàm saveHoaDonNhap()
48 lớp HoaDonNhapDAO gọi hàm saveHoaDonNhap()
49 lớp HoaDonNhapDAO trả thông tin về cho trang NhapPhim.jsp
50 NhapPhim.jsp gọi trang trang SearchPhimView.jsp
51 trang SearchPhimView.jsp hiển thị thông tin cho người dùng
 ![image](https://user-images.githubusercontent.com/60811649/201270929-07e13430-b697-44a6-979d-4c60072cdde3.png)

Chức năng xem thống kê phim theo doanh thu:
1 Nhân viên quản lí đăng nhập vào hệ thống
2 trang loginView.jsp gọi lớp ThanhVien để đóng gói thông tin thành viên
3 Lớp ThanhVien đóng gói thông tin thực thể
4 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
5 Trang loginView.jsp gọi lớp ThanhVienDAO yêu cầu gọi hàm checkLogin()
6 lớp ThanhVienDAO gọi hàm checkLogin()
7 Lớp ThanhVienDAO gọi lớp ThanhVien để đóng gói thông tin thành viên
8 Lớp ThanhVien đóng gói thông tin thực thể
9 Lớp ThanhVien trả về kết quả cho trang loginView.jsp
10 trang loginView.jsp gọi trang QuanLyHomeView.jsp
11 trang QuanLyHomeView.jsp hiển thị thông tin cho quản lí
12 quản lí click Xem thống kê
13 trang QuanLyHomeView.jsp gọi trang XemThongKeView.jsp
14 trang XemThongKeView.jsp hiển thị thông tin cho quản lí
15 quản lí click Thống kê phim theo doanh thu
16 trang XemThongKeView.jsp gọi trang TkPhimTheoDoanhThuView.jsp
17 trang TkPhimTheoDoanhThuView.jsp hiển thị thông tin cho quản lí
18 quản lí click xem thống kê trong tháng
19 trang XemThongKeView.jsp gọi trang TkPhimTrongThangView.jsp
20 trang TkPhimTrongThangView.jsp hiển thị thông tin cho 
21 quản lí nhập tháng và thứ tự sắp xếp
22 trang TkPhimTrongThangView.jsp gọi lớp TkePhimTrongThangDAO yêu cầu gọi hàm getListTkePhimTrongThang()
23 lớp TkePhimTrongThangDAO gọi hàm getListTkePhimTrongThang()
24 lớp TkePhimTrongThangDAO gọi lớp TkePhimTrongThang yêu cầu đóng gói thông tin
25 lớp TkePhimTrongThang thực hiện đóng gói thông tin
26 lớp TkePhimTrongThang trả lại dữ liệu cho lớp TkePhimTrongThangDAO
27 lớp TkePhimTrongThangDAO trả lại dữ liệu cho trang TkPhimTrongThangView.jsp
28 trang TkPhimTrongThangView.jsp hiển thị dữ liệu cho người dùng
29 quản lí click 1 thống kê phim
30 trang TkPhimTrongThangView.jsp gọi trang TkChiTietPhimView.jsp
31  trang TkChiTietPhimView.jsp gọi lớp TkePhimTrongThangDAO yêu cầu gọi hàm getTkePhimChiTiet()
32 lớp TkePhimTrongThangDAO gọi hàm getTkePhimChiTiet()
33 TkePhimTrongThangDAO gọi lớp TkePhimTrongThang yêu cầu đóng gói thông tin
34 lớp TkePhimTrongThang thực hiện đóng gói thông tin
35 lớp TkePhimTrongThang trả về thông tin cho TkePhimTrongThangDAO
36 lớp TkePhimTrongThangDAO  trả dữ liệu về trang TkChiTietPhimView.jsp
37 lớp TkChiTietPhimView.jsp hiển thị thông tin cho người dùng
 
![image](https://user-images.githubusercontent.com/60811649/201270942-879f6c62-09bf-4931-8d43-ac0545727d24.png)

12. Thiết kế BD gói/triển khai (chung)




 Biểu đồ gói :
Các package được thiết kế theo 1 project java :
Package java :
Các lớp thực thể ở trong package model
Các thực thể liên quan đến người ở trong package user
Các lớp DAO(Data Access Object) ở trong package dao
Package jsp :
  Giao diện jsp

 ![image](https://user-images.githubusercontent.com/60811649/201270952-a61f00d5-467c-4ced-bb80-9ca6d31d4362.png)


Biểu đồ triển khai:
 ![image](https://user-images.githubusercontent.com/60811649/201270959-fdf8b299-b025-44b2-9f1f-d140e5f9fe81.png)

