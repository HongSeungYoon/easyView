<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/js/adminlte.min.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/css/adminlte.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
</head>
<body>

<div class="main">
  <div class="header row">
    <div class="header-logo col-1">
      <div class="logo">IDH</div>
    </div>
    <!-- header종료 -->
    <div class="main-menu col-11">
      <div class="menu active"><i class="fa-solid fa-border-all"></i>&nbsp대시보드</div>
      <div class="menu"><i class="fa-solid fa-globe"></i>&nbsp사업관리</div>
      <div class="menu"><i class="fa-solid fa-keyboard"></i>&nbsp요구사항관리</div>
      <div class="menu"><i class="fa-solid fa-screwdriver-wrench"></i>&nbsp프로젝트구성</div>
      <div class="menu"><i class="fa-brands fa-r-project"></i>&nbsp프로젝트</div>
      <div class="menu"><i class="fa-solid fa-users-line"></i>&nbsp커뮤니케이션</div>
      <div class="menu"><i class="fa-solid fa-bell"></i>&nbsp공지사항</div>
      <div class="menu"><i class="fa-sharp fa-solid fa-book"></i>&nbsp표준관리</div>
    </div>
    <!--main-menu종료 -->
    <div class="col-12 sub-menu">
      <div class="top-menu">
        <nav class="left">
          <a  href="#">프로젝트 계획</a>
          <a href="#" class="selected">프로젝트 리스트</a>
          <a class="active-tab" href="#">프로젝트 등록</a>
          <a href="#" class="selected">프로젝트 관리</a>

        </nav>
      </div>
    </div>
  </div>
  <!--header row종료 -->    

  <div class= "content">
    <div class="row">

      <!--col-6시작-->
      <div class="col-6">
        <div class="card card-info">
          <div class="card-header">
            <h3 class="card-title">종료 프로젝트</h3>
            <div class="card-tools">
              
              <div class="input-group input-group-sm" style="width: 300px;">
                <div class="btn-group">
<button type="button" class="btn btn-info">Action</button>
<button type="button" class="btn btn-info dropdown-toggle dropdown-icon" data-toggle="dropdown">
<span class="sr-only">Toggle Dropdown</span>
</button>
<div class="dropdown-menu" role="menu">
<a class="dropdown-item" href="#">Action</a>
<a class="dropdown-item" href="#">Another action</a>
<a class="dropdown-item" href="#">Something else here</a>
<div class="dropdown-divider"></div>
<a class="dropdown-item" href="#">Separated link</a>
</div>
</div>
                <input type="text" name="table_search" class="form-control float-right" placeholder="Search">
                <div class="input-group-append">
                  <button type="submit" class="btn btn-default">
                    <i class="fas fa-search"></i>
                  </button>
                </div>
              </div>
            </div>
          </div>
          <div class="card-body table-responsive p-0">
            <table class="table table-hover ">
              <thead>
                <tr>
                  <th>프로젝트 이름</th>
                  <th>프로젝트 상태</th>
                  <th>등록 날짜</th>
                  <th>요구사항</th>
                  <th>설명</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>183</td>
                  <td>John Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-success">Approved</span></td>
                  <td> fatback doner.</td>
                </tr>
                <tr>
                  <td>219</td>
                  <td>Alexander Pierce</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-warning">Pending</span></td>
                  <td>flank fatback doner.</td>
                </tr>
                <tr>
                  <td>657</td>
                  <td>Bob Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-primary">Approved</span></td>
                  <td> flank fatback doner.</td>
                </tr>
                <tr>
                  <td>175</td>
                  <td>Mike Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-danger">Denied</span></td>
                  <td> flank fatback doner.</td>
                </tr>
                <tr>
                  <td>175</td>
                  <td>Mike Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-danger">Denied</span></td>
                  <td> flank fatback doner.</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>

        <div class="card card-info">
          <div class="card-header">
            <h3 class="card-title">종료 프로젝트</h3>
            <div class="card-tools">
              <div class="input-group input-group-sm" style="width: 150px;">
                <input type="text" name="table_search" class="form-control float-right" placeholder="Search">
                <div class="input-group-append">
                  <button type="submit" class="btn btn-default">
                    <i class="fas fa-search"></i>
                  </button>
                </div>
              </div>
            </div>
          </div>
          <div class="card-body table-responsive p-0">
            <table class="table table-hover ">
              <thead>
                <tr>
                  <th>프로젝트 이름</th>
                  <th>프로젝트 상태</th>
                  <th>등록 날짜</th>
                  <th>요구사항</th>
                  <th>설명</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>183</td>
                  <td>John Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-success">Approved</span></td>
                  <td> fatback doner.</td>
                </tr>
                <tr>
                  <td>219</td>
                  <td>Alexander Pierce</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-warning">Pending</span></td>
                  <td>flank fatback doner.</td>
                </tr>
                <tr>
                  <td>657</td>
                  <td>Bob Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-primary">Approved</span></td>
                  <td> flank fatback doner.</td>
                </tr>
                <tr>
                  <td>175</td>
                  <td>Mike Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-danger">Denied</span></td>
                  <td> flank fatback doner.</td>
                </tr>
                <tr>
                  <td>175</td>
                  <td>Mike Doe</td>
                  <td>11-7-2014</td>
                  <td><span class="tag tag-danger">Denied</span></td>
                  <td> flank fatback doner.</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>

    <div class="card ">
          <div class="card-body row">
            <div class="col-6"><button type="button" class="btn btn-block btn-info btn-sm">프로젝트 계획</button>
              </div>
             <div class="col-6"> <button type="button" class="btn btn-block btn-info btn-sm">프로젝트 비교</button>
</div>
          </div>
        </div>


        <!--col-6종료-->
      </div>


      <!--col-6시작-->
      <div class="col-6">


        <div class="card">
          <div class="card-header">
            <h3 class="card-title">Progress bars</h3>
          </div>

          <div class="card-body">
            <div class="progress mb-3">
              <div class="progress-bar bg-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                <span class="sr-only">40% Complete (success)</span>
              </div>
            </div>
            <div class="progress mb-3">
              <div class="progress-bar bg-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                <span class="sr-only">20% Complete</span>
              </div>
            </div>
            <div class="progress mb-3">
              <div class="progress-bar bg-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                <span class="sr-only">60% Complete (warning)</span>
              </div>
            </div>
            <div class="progress mb-3">
              <div class="progress-bar bg-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                <span class="sr-only">80% Complete</span>
              </div>
            </div>
          </div>
          
 
        </div>


        <div class="card ">
          <div class="card-body row">
            <div class="col-4"><button type="button" class="btn btn-block btn-info btn-sm">예산현황</button>
              <button type="button" class="btn btn-block btn-info btn-sm">인력현황</button></div>
             <div class="col-4"> <button type="button" class="btn btn-block btn-info btn-sm">일정현황</button>
              <button type="button" class="btn btn-block btn-info btn-sm">이슈현황</button>   
</div><div class="col-4"> <button type="button" class="btn btn-block btn-info btn-sm">산출물현황</button></div>
          </div>
        </div>


        
        <div class="row">
          <div class="card col-6 card-info">
            <div class="card-header ">
            <h3 class="card-title ">종료 프로젝트</h3>
           
               <div class="card-body table-responsive p-0">
            <table class="table table-hover ">
              <thead>
                <tr>
                  <th>1</th>
                  <th>2</th>
                  <th>3</th>
                  <th>4</th>
                  <th>5</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>2</td>
                  <td>3</td>
                  <td><span class="tag tag-success">4</span></td>
                  <td> 5</td>
                </tr></tbody>
              </table>
              
              
              </div>
            </div>
          </div>
          
           <div class="card col-6 ">
            <div class="card-header">
            <h3 class="card-title ">종료 프로젝트</h3>
           
              <div class="card-body table-responsive p-0">
            <table class="table table-hover ">
              <thead>
                <tr>
                  <th>1</th>
                  <th>2</th>
                  <th>3</th>
                  <th>4</th>
                  <th>5</th>
                </tr>
              </thead>
              </table></div>
              
              
              
            </div>
          </div>
        </div>
      </div>


      <!--col-6종료-->

    </div>


    <!--row종료-->
  
   
  
  </div>
  <!--content종료-->
</div>
<!--main(container)종료 -->




<script src="https://cdn.jsdelivr.net/npm/admin-lte@3.1/dist/js/adminlte.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>