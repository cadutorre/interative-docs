app.controller("metaController", function($scope, $http) {

	$http.get("http://localhost:8080/docs/services/meta").success(
			function(data) {
				$scope.metas = data;
			});

});

app.controller("menuController", function($scope, $http) {

	$http.get("http://localhost:8080/docs/services/menu").success(
			function(data) {
				$scope.menus = data;
			});

});