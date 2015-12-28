<%@ include file="/WEB-INF/jsp/includes/siteTags.jsp"%>
    <section id="error-page">
        <div class="error-page-inner">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-sm-12">
                        <div class="text-center">
                            <div class="bg-404">
                                <div class="error-image">                                
                                    <span><a href="#"><i class="fa fa-exclamation-triangle"></i></a></span>
                                </div>
                            </div>
                            <h2>ERROR OCCURRED</h2>
                            <p>There was some error occurred. Please try again. Thank you.</p>
                            <a href="<c:url value='/landing/overview.go'/>" class="btn btn-error">RETURN TO THE HOMEPAGE</a>
                            <div class="social-link">
                                <span><a href="#"><i class="fa fa-facebook"></i></a></span>
                                <span><a href="#"><i class="fa fa-twitter"></i></a></span>
                                <span><a href="#"><i class="fa fa-google-plus"></i></a></span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>