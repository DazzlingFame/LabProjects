<html>
<head>
<title>Lab3</title>
</head>
<body>
<form method = 'POST'>
<input type = "text" name = "message"/>
<input type="submit" value="Submit" />
<br/>
<form>
<input type="radio" name="select" value="All" checked/> All
<br />
<input type="radio" name="select" value="Name" /> Name
<br />
<input type="radio" name="select" value="Secondname" /> Secondname
<br />
<input type="radio" name="select" value="Class" />Class
<br />
<input type="radio" name="select" value="Sex" />Sex
<br />
<input type="radio" name="select" value="ParentFIO" />ParentFIO
</form>
<br/><br/>
<?php
if ($_POST["select"]=="All") $quer="SELECT * FROM school.students";
if ($_POST["select"]=="Name") $quer="SELECT * FROM school.students WHERE Name= '".$_POST["message"]."'";
if ($_POST["select"]=="Secondname") $quer="SELECT * FROM school.students WHERE SecondName= '".$_POST["message"]."'";
if ($_POST["select"]=="Class") $quer="SELECT * FROM school.students WHERE Class= '".$_POST["message"]."'";
if ($_POST["select"]=="Sex") $quer="SELECT * FROM school.students WHERE Sex= '".$_POST["message"]."'";
if ($_POST["select"]=="ParentFIO") $quer="SELECT * FROM school.students WHERE ParentFIO= '".$_POST["message"]."'";
$host='localhost';
$user='user';
$password='12345';
$db='school';
$my = new mysqli($host, $user, $password);
$result = $my ->query($quer);
?>
<table border>
<?php
while($row = $result->fetch_assoc())
{
echo '<tr><td>'.$row['Name'].'</td>'.'<td>'.$row['SecondName'].'</td>'.'<td>'.$row['Class'].'</td>'.'<td>'.$row['Sex'].'</td>'.'<td>'.$row['ParentFIO'].'</td></tr>';
}
$my->close();
?>
</table>
</body>
</html>