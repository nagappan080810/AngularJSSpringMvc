/**
 * Login app which logs into the system for accessing the secured APIs.
 */
(function(){
	var loginApp = angular.module('loginApp',[]);
	loginApp.controller("loginController",function($scope, $http){
		$scope.msgprompt="";
		//do login after getting the username and password.
		this.doLogin = function(user){
			console.log(user);
			$http({
			    method: 'POST',
			    url: 'pocs/j_spring_security_check',
			    headers: {'Content-Type': 'application/x-www-form-urlencoded'},
			    transformRequest: function(obj) {
			        var str = [];
			        for(var p in obj)
			        str.push(encodeURIComponent(p) + "=" + encodeURIComponent(obj[p]));
			        return str.join("&");
			    },
			    data: {j_username: user.userName, j_password: user.password}
			}).success(function(response){
				$scope.msgprompt="";
				window.location.href="/pocs/pages/RestHome.html";
				console.log("logged in successfully");
			}).error(function(response){
				$scope.msgprompt="Login Post Request Failed";
				console.log("login failed");
				
			});
		};
	});
	
})();