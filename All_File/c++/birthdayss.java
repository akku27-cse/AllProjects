<!DOCTYPE HTML>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Happy Birthday</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<style type="text/css">
		@font-face {
			font-family: digit;
			src: url('digital-7_mono.ttf') format("truetype");
		}
	</style>
	<link href="css/default.css" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/garden_dev.js"></script>
    <script type="text/javascript" src="js/functions_dev.js"></script>
</head>

<body>
	<div id="mainDiv">
		<div id="content">
			<div id="code">
				<span class="comments">/**</span><br />
				<span class="space"/><span class="comments">* Today, the 13th day of August, is your birthday.</span><br />
				<span class="space"/><span class="comments">* So I created a page to celebrate this extraordinary day.</span><br />
				<span class="space"/><span class="comments">*/</span><br />
				Girl u = <span class="keyword">new</span> Girl(<span class="string">"May Zhao"</span>);<br />
				<span class="comments">// Aug 13th, when the bell rang, your age increased </span><br />
				Date currentTime = <span class="keyword">new</span> Date(); <br />
				SimpleDateFormat formatter = <span class="keyword">new</span> SimpleDateFormat(<span class="string">"yyyy-MM-dd HH:mm:ss"</span>);<br />
				String dateString = formatter.format(currentTime);<br />
				if( dateString.equals(<span class="string">"2013-08-13 00:00:00"</span>) ){</br>
					u.age ++;</br>
				}</br>
				<span class="comments">// Our blessing will be with you simultaneously.</span><br />
				<span class="keyword">new</span> Thread (){<br />
				@Override </br>
				<span class="comments">// Forever and ever. I wish</span><br />
				while(true){</br>
				<span class="comments">// luckiness,</span><br />
				u.fortune ++;</br>
				<span class="comments">// happiness,</span><br />
				u.happiness ++;</br>
			    <span class="comments">// and everything you wish can be achieved.</span><br />
				}.start()</br>
				<span class="comments">// The last thing I wanna say, boring and ordinary, is:</span><br />
				System.out.println(<span class="string">"Happy Birthday !"</span>);
			</div>
			<div id="loveHeart">
				<canvas id="garden"></canvas>
				<div id="words">
					<div id="messages">
					</br>
					</br>
					</br>
					</br>
						You've been in the world for
						<div id="elapseClock"></div>
					</div>
					<div id="loveu">
						May you have a year full of happiness.<br/>
						<div class="signature">- Xavier</div>
					</div>
				</div>
			</div>
		</div>
		<div id="copyright">
			Inspired by <a href="http://www.openrise.com/lab/FlowerPower/">FlowerPower</a> project.<br />
			The origin version is from <a href='http://hackerzhou.me'>hackerzhou.me</a> </br>
			<a href="http://weibo.com/xavieryao">Xavier Yao</a> 2013</br>
		</div>
	</div>
	<script type="text/javascript">
		var offsetX = $("#loveHeart").width() / 2;
		var offsetY = $("#loveHeart").height() / 2 - 55;
		var together = new Date();
		together.setFullYear(1997,7, 9);
		together.setHours(8);
		together.setMinutes(0);
		together.setSeconds(0);
		together.setMilliseconds(0);
		
		if (!document.createElement('canvas').getContext) {
			var msg = document.createElement("div");
			msg.id = "errorMsg";
			msg.innerHTML = "Your browser doesn't support HTML5!<br/>Recommend use Chrome 14+/IE 9+/Firefox 7+/Safari 4+"; 
			document.body.appendChild(msg);
			$("#code").css("display", "none")
			$("#copyright").css("position", "absolute");
			$("#copyright").css("bottom", "10px");
		    document.execCommand("stop");
		} else {
			setTimeout(function () {
				startHeartAnimation();
			}, 5000);

			timeElapse(together);
			setInterval(function () {
				timeElapse(together);
			}, 500);

			adjustCodePosition();
			$("#code").typewriter();
		}
	</script>
</body>
</html>
