app.factory(
				"mainService",
				function($http, $log, toaster, $location) {
					var isDisabled = "";

					return {
						setDisableButtonsOnRowClick : function(data) {
							isDisabled = data;
						},
						getDisableButtonsOnRowClick : function() {
							return isDisabled;
						},
						addBook : function(data) {

	                       	 
							var promise = $http({
								url : "addBook",
								method : "POST",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						},bookList : function(data) {

                        	 
							var promise = $http({
								url : "bookList",
								method : "POST",
								data : JSON.stringify(data)
							}).success(
									function(data, status, header, config,
											statusText) {
									}).error(
									function(data, status, header, config,
											statusText) {
										if (!status === 901)
											toaster.pop('error', status,
													statusText);
									}).then(function(response) {
								/*console.log("-------In role Service Reponce-------",response);*/
								return response.data;
							})
							return promise;
						}
		        		
					}
				});

				
app.factory("sharedProperties", function($http, $log, toaster, $location) {
	var property = null;

	return {
		getProperty : function() {
			return property;
		},
		setProperty : function(value) {
			property = value;
		}
	};
});