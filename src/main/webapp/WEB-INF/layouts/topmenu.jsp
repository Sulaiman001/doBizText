<%@ include file="/WEB-INF/jsp/includes/siteTags.jsp"%>
     <header id="header">      
       <div class="container">
            <div class="row">
                <div class="col-sm-12 overflow">
                   <div class="social-icons pull-right">
                        <ul class="nav nav-pills">
                            <li><a href=""><i class="fa fa-facebook"></i></a></li>
                            <li><a href=""><i class="fa fa-twitter"></i></a></li>
                            <li><a href=""><i class="fa fa-google-plus"></i></a></li>
                            <li><a href=""><i class="fa fa-linkedin"></i></a></li>
                        </ul>
                    </div> 
                </div>
             </div>
        </div>
        <div class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>

                    <a class="navbar-brand" href="<c:url value='/landing/overview.go'/>">
                    	<h1><i class="fa fa-diamond"></i>United Pack</h1>
                    </a>
                    
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="active"><a href="<c:url value='/landing/overview.go'/>">Home</a></li>
                        <li class="dropdown"><a href="#">Account <i class="fa fa-angle-down"></i></a>
                            <ul role="menu" class="sub-menu">
                                <li><a href="<c:url value='/secure/account/addCustomers.go'/>">Add Customers</a></li>
                                <li><a href="<c:url value='/secure/account/viewCustomers.go'/>">View Customers</a></li>
                                <li><a href="<c:url value='/secure/account/manageCustomers.go'/>">Manage Customers</a></li>
                            </ul>
                        </li>                  
                        <li class="dropdown"><a href="portfolio.html">Services <i class="fa fa-angle-down"></i></a>
                            <ul role="menu" class="sub-menu">
                                <li><a href="<c:url value='/landing/overview.go'/>">Service 1</a></li>
                                <li><a href="<c:url value='/landing/overview.go'/>">Service 2</a></li>
                                <li><a href="<c:url value='/landing/overview.go'/>">Service 3</a></li>
                            </ul>
                        </li>   
                        <li><a href="<c:url value='/landing/aboutus.go'/>">About Us</a></li>
                        <li><a href="<c:url value='/landing/contactus.go'/>">Contact Us</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
    <!--/#header-->