
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

<h2>Search Book</h2>

  <!--  <b>    Book ID   : </b>
<input type="text" placeholder="Enter Book ID" name="amt" id="amt" /> -->

<!-- <b> Book Name:</b>
     <input type="text" placeholder="Enter Book Name" name="amt" id="amt" /> -->
     <b> Book Author:</b>
     <input type="text" placeholder="Enter Book Author" name="amt" id="autr" />
  

    
     
      <button ng-click="bookListAuthor()">Search Book</button>
     
     
        <table ng-show="reportShow">
<th>Sr.No</th>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Author</th>
<th>Book Edition</th>
<th>Book Article</th>


  <tr ng-repeat="x in bookListByAuthor">

     <td>{{ $index + 1 }}</td>
    <td>{{x.bookId}}</td>
    <td>{{x.bookName}}</td>
     <td>{{x.bookAuthor}}</td>
     <td>{{x.bookVersion}}</td>
      <td>{{x.bookArticle}}</td>
     
