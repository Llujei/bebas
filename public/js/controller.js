/*angular
    .module('loginpage', [])
    .controller('logincontrol', [function() {
        var self = this;


        self.submit = function($http, $window) {
            return {
                $http({
                        url: 'http://localhost:9000/login',
                        method: "POST",
                        params: self.user
                            //dataType: 'json',
                            //data: {
                            //    'username': self.user.username,
                            //     'password': self.user.password
                            //}
                    })
                    .then(function(response) {
                            // success
                            //self.verif = response;
                            $window.location.href = '/test.html';
                            //alert("ok");
                        },
                        function(response) { // optional
                            // failed
                        });
            }
        }
    }]);
*/

angular.module('loginpage', [])

.controller('logincontrol',logincontrol)

function logincontrol($http) {
    var vm = this;
    vm.errorResponse = true;
    vm.username = 'Tan';
    vm.password = '123';

    self.subsmit = function($http, $window) {
        var res = $http({
                url: 'http://localhost:9000/login',
                method: "POST",
                params: vm.user
                    //dataType: 'json',
                    //data: {
                    //    'username': self.user.username,
                    //     'password': self.user.password
                    //}
            });
            res.success(vm.errorResponse = true);
            res.error(vm.errorResponse = false);
    }

    vm.submit = function() {
        vm.errorResponse = true;
        if (vm.password == null || vm.password == '' ||
            vm.username == null || vm.username == '') {
            alert('noo');
        } else {
            //var data = {
          //      username: vm.username,
          //      password: vm.password
          //  };
            // Simple POST request example (passing data) :
         //   var res = $http.post('http://localhost:9000/login', data);

             $http({
                url: 'http://localhost:9000/login',
                method: "POST",
                params: vm.user
                    //dataType: 'json',
                    //data: {
                    //    'username': self.user.username,
                    //     'password': self.user.password
                    //}
            }).success(returndata);

             function returndata(data){

             	alert(data);
             };

           // res.success(vm.errorResponse = true);
          //  res.error(vm.errorResponse = false);
            // this callback will be called asynchronously
            // when the response is available
        }

    }

}
