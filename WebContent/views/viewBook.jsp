<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table, th , td  {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table tr:nth-child(odd) {
  background-color: #f1f1f1;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}
</style>
<body>
<h3>View Book</h3>
<table>
<th>Sr.No</th>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Book Edition</th>
<th>Book Article</th>


  <tr ng-repeat="x in bookList">
     <td>{{ $index + 1 }}</td>
    <td>{{x.bookId}}</td>
    <td>{{x.bookName}}</td>
     <td>{{x.bookAuthor}}</td>
     <td>{{x.bookVersion}}</td>
      <td>{{x.bookArticle}}</td>
  
     
         
      
     
  </tr>
</table>
</body>
</html>