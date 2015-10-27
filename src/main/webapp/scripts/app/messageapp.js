/**
 * MessageApp - To retrieve the message from REST services and show it in Angular JS html file.
 */
(function(){
	//**app declaration
	var messageApp = angular.module("messageApp",[]);
	//**controller declaration
	messageApp.controller("messageCtrl", function($scope, $http){
		$scope.message = "Waiting for a server to respond..";
		$scope.alertStatus = "alert-info";
		$http.get('/pocs/rest/helloworld').success( function(response){
			console.log(response);
			console.log("response - " + response.value);
			$scope.message = response.value;
			$scope.alertStatus = response.status==true ? "alert-success" : "alert-danger";
		}).error( function(response){
			$scope.message = "Couldn't test for application alive status. Server not responding..";
			$scope.alertStatus = "alert-danger";
		});
	});
})();