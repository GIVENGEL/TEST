$(function(){
	
	var img1= $('#dom1');
	var img2= $('#dom2');
	var img3= $('#dom3');
	


	img1.css("cursor","pointer").click(function(){
		location.href = 'detail.html';
	});
	img1.next().next().hide();
	img1.hover(function(){
		img1.next().next().show(500);
	},function(){
		
	})
	
	
	img2.css("cursor","pointer").click(function(){
		location.href = 'detail.html';
	});
	img2.next().next().hide();
	img2.hover(function(){
		img2.next().next().show(500);
	},function(){
		
	})
	
	img3.css("cursor","pointer").click(function(){
		location.href = 'detail.html';
	});
	img3.next().next().hide();
	img3.hover(function(){
		img3.next().next().show(500);
	},function(){
		
	})
	
});