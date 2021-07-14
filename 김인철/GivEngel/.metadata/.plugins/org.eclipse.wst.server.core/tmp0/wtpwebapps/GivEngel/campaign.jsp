
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

<head>

    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>살아숨쉬는 기부의 즐거움, GivEngel</title>

    <!-- Google Font -->

    <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

    
    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
    <!-- Page Preloder -->
    <div id="preloder">
        <div class="loader"></div>
    </div>
    

    <!--  navbar &  side over wrap -->
    <jsp:include page="module/navbar.jsp"/>
  
  
  	<!-- 사이드바 + 서브 헤더 -->
    <section class="hero hero-normal">
        <div class="container">
            <div class="row">
                <div class="col-lg-3">
                    <div class="hero__categories">
                        <div class="hero__categories__all">
                            <i class="fa fa-bars"></i>
                            <span>All Categories</span>
                        </div>
                        <ul>
                            <li><a href="#">전체 상품</a></li>
                            <li><a href="#">TOP</a></li>
                            <li><a href="#">BOTTOM</a></li>
                            <li><a href="#">BAG</a></li>
                            <li><a href="#">ACC</a></li>
                            <li><a href="#">SHOES</a></li>
                            <li><a href="#">SALES</a></li>    
                        </ul>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="hero__search">
                        <div class="hero__search__form">
                            <form action="#">
                                <div class="hero__search__categories">
                                    All Categories
                                    <span class="arrow_carrot-down"></span>
                                </div>
                                <input type="text" placeholder="어떤 상품을 원하세요?">
                                <button type="submit" class="site-btn">검색</button>
                            </form>
                        </div>
                        <div class="hero__search__phone">
                            <div class="hero__search__phone__icon">
                                <i class="fa fa-phone"></i>
                            </div>
                            <div class="hero__search__phone__text">
                                <h5>010-9159-5358</h5>
                                <span>24시간 상담 가능</span>
                            </div>
                        </div>
                    </div>
                   
                </div>
            </div>
        </div>
    </section>
   <!-- 사이드바 + 서브 헤더 end -->
	
    

    
    

   

    <!-- Blog Section Begin -->
    <section class="from-blog spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="section-title from-blog__title">
                        <h2 class="display-3">Campaign</h2>
                    </div>
                </div>
            </div>
            <div class="row">
            
            	<!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-1.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> 각 캠페인 만료일 출력</li>
                                <li><i class="fa fa-comment-o"></i> 댓글 수 출력</li>
                            </ul>
                            <h5><a href="#">캠페인 이름 출력</a></h5>
                            <p>캠페인 설명 출력(할 수 있으면 20글자만 출력하고 ... 붙이기) </p>
                        </div>
                    </div>
                </div>
                <!-- ****************************** -->
                <!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-2.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">고양이, 그리고 불편한 진실</a></h5>
                            <p>인간만이 신체적 결함에 부조리함을 느낀다고 생각하시나요? 고양이 로소의 이야기를 들어보세요. </p>
                        </div>
                    </div>
                </div>
                 <!-- ****************************** -->
                <!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-3.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">지구 한 바퀴를 돌고 와도 변치않는 우정</a></h5>
                            <p>영국에 사는 두 소녀의 드라마같은 우정이야기 </p>
                        </div>
                    </div>
                </div>
                 <!-- ****************************** -->
                <!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-1.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> ~2021.09.31</li>
                                <li><i class="fa fa-comment-o"></i> 10</li>
                            </ul>
                            <h5><a href="#">도쿄올림픽, 패럴림픽 개최 중단..?</a></h5>
                            <p>올림픽의 마지막을 장식하는 패럴림픽, 그런데 다음 올릭픽에서는 개최가 안될지 모른다고..? </p>
                        </div>
                    </div>
                </div>
                 <!-- ****************************** -->
                <!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-2.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">고양이, 그리고 불편한 진실</a></h5>
                            <p>인간만이 신체적 결함에 부조리함을 느낀다고 생각하시나요? 고양이 로소의 이야기를 들어보세요. </p>
                        </div>
                    </div>
                </div>
                 <!-- ****************************** -->
                <!--  각 캠패인 출력 단위 표시 ****************-->
                <div class="col-lg-4 col-md-4 col-sm-6">
                    <div class="blog__item">
                        <div class="blog__item__pic">
                            <img src="img/blog/blog-3.jpg" alt="">
                        </div>
                        <div class="blog__item__text">
                            <ul>
                                <li><i class="fa fa-calendar-o"></i> May 4,2019</li>
                                <li><i class="fa fa-comment-o"></i> 5</li>
                            </ul>
                            <h5><a href="#">지구 한 바퀴를 돌고 와도 변치않는 우정</a></h5>
                            <p>영국에 사는 두 소녀의 드라마같은 우정이야기 </p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Blog Section End -->
    
    <!-- Categories Section Begin -->
    <section class="categories mb-4">
        <div class="container">
         <div class="row">
                <div class="col-lg-12">
                    <div class="section-title from-blog__title">
                        <h2>이런 후원 단체는 어떠세요?</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="categories__slider owl-carousel">
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-1.jpg">
                            <h5><a href="#">양키 캔들</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-2.jpg">
                            <h5><a href="#">도자기 공예</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-3.jpg">
                            <h5><a href="#">원예</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-4.jpg">
                            <h5><a href="#">수제 비누</a></h5>
                        </div>
                    </div>
                    <div class="col-lg-3">
                        <div class="categories__item set-bg" data-setbg="img/categories/cat-5.jpg">
                            <h5><a href="#">악세사리</a></h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- Categories Section End -->

    <!-- Footer -->
     <jsp:include page="module/footer.jsp"/>


    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>



</body>

</html>