<!DOCTYPE html>
<html lang="ja">
<head>

<meta charset="UTF-8">
<title>掲示板</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<img src="4eachblog_logo.jpg">

<header>
<ul>
<li>トップ</li>
<li>プロフィール</li>
<li>4eachについて</li>
<li>登録フォーム</li>
<li>問い合わせ</li>
<li>その他</li>
</ul>
</header>

<main>
<div class="main-container">
<div class="left">
<h1>プログラミングに役立つ掲示板</h1>

<div class="form">
<form method="post" action="insert.php">
<h3>入力フォーム</h3>

<label>ハンドルネーム</label><br>
<input type="text" class="text" name="handlename"><br>
<label>タイトル</label><br>
<input type="text" class="text" name="title"><br>
<label>コメント</label><br>
<textarea cols="40" rows="5" name="comments"></textarea>

<div>
<input type="submit" class="submit" value="送信する"></div>
</form>
  
</div>

<?php
  
  mb_internal_encoding("utf8");
$pdo= new PDO("mysql:dbname=lesson02;host=localhost;","root","mysql");
$stmt=$pdo->query("select * from 4each_keijiban");
  
$stmt=$pdo->query("select*from 4each_keijiban");

foreach($stmt as $row){
  echo $row['handlename'];
   echo $row['title'];
   echo $row['comments'];
}
    
    ?>
</div>

<div class="right"> 
<h3>人気の記事</h3>

<ul>
<li>PHPオススメ本</li>
<li>PHP　MyAdminの使い方</li>
<li>いま人気のエディタ</li>
<li>HTMLの基礎</li>
</ul>

<h3>オススメリンク</h3>
<ul>
<li>インターノウス株式会社</li>
<li>XAMPPのダウンロード</li>
<li>Eclipsのダウンロード</li>
<li>Bracketsのダウンロード</li>
</ul>

<h3>カテゴリ</h3>
<ul>
<li>HTML</li>
<li>PHP</li>
<li>MySQL</li>
<li>JavaScript</li>
</ul>
</div>


</div>
</main>

<footer>
copyright internous |4each blog is the one which provides Ato Z about programing.

</footer>
</body>

</html>