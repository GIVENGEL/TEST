/**
 * 
 */
$(function(){
   
   $('a[rel="prettyPopin"]:first').prettyPopin({
         width: 550
   });
   
   $('a[rel="prettyPopin"]:eq(1)').prettyPopin({
         width: 550,
         // 자바 스크립트에서는 함수도 그냥 객체다.
         callback : function(){
            alert('팝업을 닫습니다.')
         }
   });
   
   
})