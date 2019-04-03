Student REST-service using Maven

1. Cài đặt Maven: ```sudo apt install maven```

2. Cài Tomcat Server hoặc GlassFish Server
    https://www.digitalocean.com/community/tutorials/install-tomcat-9-ubuntu-1804 
    
    https://idroot.us/linux/install-glassfish-ubuntu-18-04-lts/
    
3. Đến thư mục project, chạy ```mvn clean install```

    Deploy to Tomcat : Copy file StudentREST.war ở {project}/target/StudentREST.war vào thư mục webapps của TomCat
    
    Deploy to GlassFish: {glassfish5-folder}/bin/asadmin deploy {path-to-project}/target/StudentREST.war
    
4. Test: XEM ẢNH DEMO TẠI THƯ MỤC img
    
   Danh sách tất cả Sinh viên: GET http://127.0.0.1:8080/StudentREST/rest/students
   
   Thông tin 1 sinh viên: GET http://127.0.0.1:8080/StudentREST/rest/students/{MSV}
   
   Thêm Sinh viên: POST http://127.0.0.1:8080/StudentREST/rest/students
                   
                   POST /StudentREST/rest/students HTTP/1.1
                   Host: 127.0.0.1:8080
                   Content-Type: application/xml
                   Cache-Control: no-cache
                   Postman-Token: b9b379b6-159e-0914-b0c2-534f5e6b787a
                   
                   <student>
                        <studentCode>16021172</studentCode>
                        <studentName>Lê Công Thương</studentName>
                   </student>
        
   Cập nhật Sinh viên: PUT http://127.0.0.1:8080/StudentREST/rest/students
                       
                       PUT /StudentREST/rest/students HTTP/1.1
                       Host: 127.0.0.1:8080
                       Content-Type: application/xml
                       Cache-Control: no-cache
                       Postman-Token: beb29036-af5b-c99c-f71a-73c3318a2acb
                       
                       <student>
                            <studentCode>16020050</studentCode>
                            <studentName>Phạm Văn Minh</studentName>
                       </student>
                       
   Xóa 1 Sinh viên: DELETE http://127.0.0.1:8080/StudentREST/rest/students/{MSV}Ư
                    
                    Host: 127.0.0.1:8080
                    Content-Type: application/xml
                    Cache-Control: no-cache
                    Postman-Token: a8a400f6-1ebe-b0ca-8f99-6f1e716203ed
 