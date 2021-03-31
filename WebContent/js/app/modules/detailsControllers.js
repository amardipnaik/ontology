app.controller("detailsControllers", [
		"$scope", '$location', 'mainService', '$log', 'localStorageService', "$timeout", "toaster", "$rootScope", 
		function($scope, $location, mainService, $log, localStorageService, $timeout, toaster, $rootScope)
		{
			
			$log.info("---Inside detailsControllers---");
			
			
			
			$scope.addBook = function(data)
			{
				
				$scope.BookBean = {
						bookId : '',
						bookName:'',
						bookAuthor:'',
						bookVersion:'',
						bookArticle:''
					}
				
				$scope.BookBean.bookId=document.getElementById("id").value;
				$scope.BookBean.bookName=document.getElementById("name").value;
				$scope.BookBean.bookAuthor=document.getElementById("autr").value;
				$scope.BookBean.bookVersion=document.getElementById("edt").value;
				$scope.BookBean.bookArticle=document.getElementById("art").value;
				
				
				
			mainService.addBook($scope.BookBean)
				.then(
						function(result) {
							
							$scope.addTrasaction=result;
							
							if(addTrasaction="success")
							{
							alert("Transaction Done Successfully")
							}
						else
							{
							alert("Failure.. Kindly Check With DB ")
							}
							
						
							$log.info("---Inside $scope.webDetails---"+$scope.user);
							});

			}
			
			
			$scope.bookList = function()
			{
				$scope.BookBean = {
						bookId : '',
						bookName:'',
						bookAuthor:'',
						bookVersion:'',
						bookArticle:''
					}
				
			mainService.bookList($scope.BookBean)
				.then(
						function(result) {
							$scope.bookList=result;
							
							});

			}
			
			$scope.reportShow=false;
			$scope.bookListId = function()
			{
				$scope.BookBean = {
						bookId : '',
						bookName:'',
						bookAuthor:'',
						bookVersion:'',
						bookArticle:''
					}
				$scope.BookBean.bookId=document.getElementById("id").value;
			mainService.bookList($scope.BookBean)
				.then(
						function(result) {
							$scope.reportShow=true;
							$scope.bookListById=result;
							
							});

			}
			
			
			$scope.bookListName = function()
			{
				$scope.BookBean = {
						bookId : '',
						bookName:'',
						bookAuthor:'',
						bookVersion:'',
						bookArticle:''
					}
				$scope.BookBean.bookName=document.getElementById("name").value;
			mainService.bookList($scope.BookBean)
				.then(
						function(result) {
							$scope.reportShow=true;
							$scope.bookListByName=result;
							
							});

			}
			
			$scope.bookListAuthor = function()
			{
				$scope.BookBean = {
						bookId : '',
						bookName:'',
						bookAuthor:'',
						bookVersion:'',
						bookArticle:''
					}
				$scope.BookBean.bookAuthor=document.getElementById("autr").value;
			mainService.bookList($scope.BookBean)
				.then(
						function(result) {
							$scope.reportShow=true;
							$scope.bookListByAuthor=result;
							
							});

			}
			
			
			$scope.bookList();
			
		}
		
		

		

			
])
