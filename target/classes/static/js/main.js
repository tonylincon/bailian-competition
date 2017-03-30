/* 空数组表示没有引入其他依赖*/
angular.module("main",[])  
	.controller("MainController",function($scope) // 回掉函数  $scope为dom中的域  
			{
		$scope.userData={} // 初始化，表单中的数据全部存到userData里面
		$scope.submitForm = function(){
			// console.log('表单提交了');
			console.log($scope.userData);
			if($scope.signUpForm.$invalid) {   // 标签中的name就在scope中，ng-model中的userData.password将password放到了userData的变量中
				alert("用户名不合法");
			}
			else alert("提交成功");
		}
			})

	.directive("compare", function(){  //   创建compare对比指令，第一次密码与第二次输入的密码进行对比 
		var o = {};
		o.strict = 'AE';  // AE是作用在元素和属性上的
		o.scope= {
				orgText: '=compare'
		}
		o.require = 'ngModel';
		o.link = function(sco, ele, att, con){    //  args : scope element(当前元素) attribute ng-modelController
			con.$validators.compare = function(v){  //$validators增加compare方法，回掉函数传进去的v就是用户输入的值
				return v == sco.orgText;   // orgText是用户之前输入的值
			}
			
			// watch orgText，一旦orgText有变化，就让con开始验证
			sco.$watch('orgText', function(){  
					con.$validate();
			})
		}
		return o;
	});

//总结：
//控制器是一个分发者，处理一些临时数据，对域进行划分
//指令（如compare）是可以重复使用的
//表单验证：数据的真实性和可靠性
