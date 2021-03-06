function countDownTimer(finishTestTime, nowTime) {
    var finishTestTime = new Date($('#finishTestTime').val()).getTime();
    var nowTime = new Date($('#nowTime').val()).getTime();

    var timeIntervalID = setInterval(function() {
        // Find the distance between now and the count down date
        var distance = finishTestTime - nowTime;

        // Time calculations for days, hours, minutes and seconds
        var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
        var seconds = Math.floor((distance % (1000 * 60)) / 1000);

        var result = (hours < 10 ? "0" + hours : hours) + ":" + (minutes < 10 ? "0" + minutes : minutes) + ":" + (seconds < 10 ? "0" + seconds : seconds);

        $('#timer').html(result);

        if (distance < 0) {
            clearInterval(timeIntervalID);
            $('#test').html("");
            $('#timer').html("Время вышло");
        }

        //increment now for 1 sec
        nowTime = new Date(nowTime + 1000).getTime();
        //$('#nowTime').val(nowTime);
    }, 1000);
}


/* INPUT MASK */
// function init_InputMask() {
// 	if( typeof ($.fn.inputmask) === 'undefined') { return; }
// 	console.log('init_InputMask');
//
// 	$(":input").inputmask();
// };
//
//
// $(document).ready(function() {
// 	init_InputMask();
// });