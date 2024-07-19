<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org">


    <head>
        <meta charset="UTF-8" />
        <title>Login and Registration Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 

        <link th:href="@{/resources/css/demo.css}" rel="stylesheet"/>
        <link th:href="@{/resources/css/style.css}" rel="stylesheet"/>
        <link th:href="@{/resources/css/animate-custom.css}" rel="stylesheet"/>

    </head>
    <body>
        <div class="container">
            
            <header th:replace="~{/header :: header}"></header>
            <section>				
                <div id="container_demo" >

                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="${flowExecutionUrl}"  method="POST"> 
                            	
                            	<input type="hidden" name="_eventId" value="performLogin"> 
								<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
                            	
                            	
                                <h1>Log in</h1> 
                                <p> 
                                    <label data-icon="u" > Your email or username </label>
                                    <input name="userName" required="required" type="text" placeholder="myusername or mymail@mail.com"/>
                                </p>
                                <p> 
                                    <label data-icon="p"> Your password </label>
                                    <input name="password" required="required" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" > 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a>Register</a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
            <footer th:replace="~{/footer :: footer}"></footer>
            
        </div>
    </body>
</html>