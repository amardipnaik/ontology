app.config(function($routeProvider, $locationProvider)
{
	/*alert("config called");*/
	$routeProvider.when('/', {
		templateUrl : 'views/myProfile.jsp',
		controller : 'detailsControllers'
	})
	.when('/aboutUser.htm', {
		templateUrl : 'views/aboutUser.jsp',
		controller : 'detailsControllers'
	}).when('/searchBook.htm', {
		templateUrl : 'views/searchBook.jsp',
		controller : 'detailsControllers'
	}).when('/addBook.htm', {
		templateUrl : 'views/addBook.jsp',
		controller : 'detailsControllers'
	}).when('/viewBook.htm', {
		templateUrl : 'views/viewBook.jsp',
		controller : 'detailsControllers'
	}).when('/searchBookByName.htm', {
		templateUrl : 'views/searchBookByName.jsp',
		controller : 'detailsControllers'
	}).when('/searchBookByAuthor.htm', {
		templateUrl : 'views/searchBookByAuthor.jsp',
		controller : 'detailsControllers'
	})
	
});

