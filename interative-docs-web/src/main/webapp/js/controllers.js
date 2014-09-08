var app = angular.module("docs", []);

app.controller("metaController", function($scope, $http) {

	$http.get("http://localhost:8080/docs/services/meta").success(
			function(data) {
				$scope.metas = data;
			});

});