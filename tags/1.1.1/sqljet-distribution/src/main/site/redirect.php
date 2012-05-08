<?php //; echo; echo "YOU NEED TO RUN THIS SCRIPT WITH PHP NOW!"; echo; echo "Try this: lynx -source http://pear.php.net/go-pear | php -q"; echo; exit # -*- PHP -*-

$uri = strip_tags($_SERVER["REQUEST_URI"]);
$uri = "http://www.sqljet.com/";

header("Location: " . $uri);
exit;
?>