<?php
Class FileReader
{
	public $text="qwe", $filename="text.txt";
	function __contruct($a)
	{
		$this->filename = $a;
	}	
	function __construct()
	{
	$text="def";
	$filename="text.txt";
	}
	public function stringReader($s)
	{
		$i=0;
		$fp = fopen ($this->filename,'r');
		if ($fp)
		{
			while ((!feof($fp))&&($i<=$s))
			{
				if($s==$i)
				{	
					$text=$mytext;
					echo $s." string ".$text.'</br>';
				}
				$mytext = fgets($fp, 999);
				$i=$i+1;
			}
		}
	
		else echo "File opening error";
		fclose($fp);
	}
	public function charReader($s,$w)
	{
		$i=0;
		$fp = fopen ($this->filename,'r');
		if ($fp)
		{
			while ((!feof($fp))&&($i<=$s))
			{
				if($s==$i)
				{	
					$text=$mytext[$w];
			echo "string ".$s." char ".($w+1)." is ".$text.'</br>';
				}
			$mytext = fgets($fp, 999);
			$i=$i+1;
			}
		}	
	else echo "File opening error".'</br>';
	fclose($fp);
	}
	public function textReader()
	{
		$fp = fopen ($this->filename,'r');
		if ($fp)
		{
			while (!feof($fp))
			{
			$mytext = fgets($fp, 999);
			echo $mytext.'</br>';
			}
			
		}	
	else echo "File opening error".'</br>';
	fclose($fp);
	}

}
$q='text.txt';
$obj = new Filereader($q);
$obj->textReader();
$obj->stringReader(2);
$obj->charReader(2,3);
?>
