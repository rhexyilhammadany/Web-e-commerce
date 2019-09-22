// navbar scroll
	var navbar = document.getElementsByClassName("navbar");

	window.onscroll = windowScroll;

	function windowScroll(e){

	var offset = window.pageYOffset;
	if (offset > 300) {
		navbar[0].className = navbar[0].className + " navbar-fixed";
	}else if (offset < 100) {
		navbar[0].className = "navbar";
		}
	};

// event pada saat link di klik
$('.page-scroll').on('click', function(e){

	// ambil isi href
	var tujuan = $(this).attr('href');
	// tangkap elemen ybs
	var elemenTujuan = $(tujuan);

	// pindah scroll
	$('html, body').animate({
		scrollTop: elemenTujuan.offset().top -65
	}, 1000, 'easeInOutExpo');

	e.preventDefault();

});

