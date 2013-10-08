    <!DOCTYPE html>
    <html>
    <head>
        <title>Bootstrap 101 Template</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet" media="screen">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="../../assets/js/html5shiv.js"></script>
        <script src="../../assets/js/respond.min.js"></script>
        <![endif]-->

    </head>
    <body>
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <h1 class = "text-primary">Money transfer form</h1>

                <form role="form" action="/hello.php" method="get">
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Sender</label>
                        <select name="sender" class="form-control">
                            <option value="John Smith">John Smith</option>
                            <option value="Bob Marley">Bob Marley</option>
                            <option value="System">System</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Receiver</label>
                        <select class="form-control" name="receiver">
                            <option value="Bob Marley">Bob Marley</option>
                            <option value="System">System</option>
                            <option value="John Smith">John Smith</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Receiver</label>
                        <div class="input-group">
                            <input type="text" name="amount" class="form-control">
                            <span class="input-group-addon">$</span>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-default">Send</button>
                    <button type="button" class="btn btn-link">Cancel</button>
                </form>

            </div>
        </div>
        <script src="//code.jquery.com/jquery.js"></script>
    </body>
    </html>
