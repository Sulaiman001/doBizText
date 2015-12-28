  <section id="page-breadcrumb">
        <div class="vertical-center sun">
             <div class="container">
                <div class="row">
                    <div class="action">
                        <div class="col-sm-12">
                            <h1 class="title">Account</h1>
                            <p>Add new customer</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
   </section>
  <!--/#page-breadcrumb-->
  <div class="container">
	<div class="row form-padding-top">
		<div class="col-md-6 col-sm-12">
			<form id="main-contact-form" name="contact-form" method="post" action="sendemail.php">
				<div class="form-group">
					<input type="text" name="name" class="form-control" required="required" placeholder="Customer Name">
				</div>
				<div class="form-group">
					<input type="text" name="mobile" class="form-control" required="required" placeholder="Customer Mobile Number">
				</div>
				<div class="form-group">
					<input type="email" name="email" class="form-control" required="required" placeholder="Email Id">
				</div>
				<div class="form-group">
					<textarea name="message" id="message" required="required" class="form-control" rows="8" placeholder="Customer Address"></textarea>
				</div>
				<div class="form-group">
					<input type="submit" name="submit" class="btn btn-submit" value="Submit">
				</div>
			</form>
		</div>
	 </div>
  </div>

