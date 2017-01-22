app.register.controller('OrderListController', function($scope, $http, $rootScope) {
    $(".nav-sidebar li").removeClass("active");
    $("#sidebar-order-list").addClass("active");

    $scope.order = {};

    $scope.list = function () {
        $http.post("order/list").success(function(response){
            $scope.orders = response.content;
        }).error(function(){
            alert("系统错误");
        });
    };

    $scope.add = function () {
        $http.post("order/add", $scope.order).success(function(response){
            if (response.success) {
                $scope.orders.push(response.content);
                $("#order-modal").modal("hide");
            } else {
                alert(response.message);
            }
        }).error(function(){
            alert("系统错误");
        });
    };


    /**
     *
     * @param order
     */
    $scope.delete = function (order) {
        $http.post("order/delete/" + order.id).success(function(response){
            if (response.success) {
                $scope.orders.removeObj(order);
            } else {
                alert(response.message);
            }
        }).error(function(){
            alert("系统错误");
        });
    };

    $scope.orderStatus = $rootScope.loadEnum("orderStatus");
    $scope.list();

});