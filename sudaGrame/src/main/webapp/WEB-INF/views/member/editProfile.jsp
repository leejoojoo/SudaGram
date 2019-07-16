<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!DOCTYPE html>
<script>
	$(".tm-text-white").removeClass("active");
	$(".myPageBtn").addClass("active")
</script>
<main class="SCxLW  o64aR" role="main">
<div class="BvMHM EzUlV">
	<ul class="wW1cu">
		<li><a class="h-aRd -HRM- " href="/accounts/edit/">프로필 편집</a></li>
		<li><a class="h-aRd  fuQUr" href="/accounts/password/change/">비밀번호
				변경</a></li>
	</ul>
	<article class="PVkFi">
		<div class="C_9MP">
			<div class="LqNQc">
				<div class="M-jxE">
					<button class="IalUJ " title="프로필 사진 추가">
						<img alt="프로필 사진 추가" class="be6sR"
							src="${myInfo.m_picture }">
							<!-- https://instagram.fisb5-1.fna.fbcdn.net/vp/952cda0aaecf724403d1da985c1dcf84/5DA39AF1/t51.2885-19/44884218_345707102882519_2446069589734326272_n.jpg?_nc_ht=instagram.fisb5-1.fna.fbcdn.net -->
					</button>
					<div>
						<form enctype="multipart/form-data" method="POST"
							role="presentation">
							<input accept="image/jpeg,image/png" class="tb_sK" type="file">
						</form>
					</div>
				</div>
			</div>
			<div class="XX1Wc">
				<h1 class="kHYQv " title="jjjindong">${myInfo.m_id }</h1>
				<button class="_0mzm- sqdOP yWX7d        " type="button">프로필
					사진 바꾸기</button>
				<div>
					<form enctype="multipart/form-data" method="POST"
						role="presentation">
						<input accept="image/jpeg,image/png" class="tb_sK" type="file">
					</form>
				</div>
			</div>
		</div>
		<form action="<%= request.getContextPath() %>/submitNewProfile" class="kWXsT" method="POST">
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepName">이름</label>
				</aside>
				<div class="ada5V">
					<input class="JLJ-B zyHYP" aria-required="false" id="pepName"
						type="text" value="${myInfo.m_name }">
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepUsername">사용자 이름</label>
				</aside>
				<div class="ada5V">
					<input class="JLJ-B zyHYP" aria-required="true" id="pepUsername"
						type="text" value="${myInfo.m_id }">
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepWebsite">웹사이트</label>
				</aside>
				<div class="ada5V">
					<input class="JLJ-B zyHYP" aria-required="false" id="pepWebsite"
						type="text"
						value="${myInfo.m_website }">
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepBio">소개</label>
				</aside>
				<div class="ada5V">
					<textarea class="p7vTm" id="pepBio">${myInfo.m_introduction }</textarea>
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  tvweK">
					<label></label>
				</aside>
				<div class="ada5V">
					<div class="VWvNL">
						<h2 class="JJF77">개인 정보</h2>
					</div>
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepEmail">이메일</label>
				</aside>
				<div class="ada5V">
					<input class="JLJ-B zyHYP" aria-required="false" id="pepEmail"
						type="text" value="${myInfo.m_email }">
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  ">
					<label for="pepPhone Number">전화번호</label>
				</aside>
				<div class="ada5V">
					<input class="JLJ-B zyHYP" aria-required="false"
						id="pepPhone Number" type="text" value="${myInfo.m_phone }">
				</div>
			</div>
			<div
				class="                  Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ">
				<div class="eE-OA">
					<aside class="sxIVS  ">
						<label for="pepGender">성별</label>
					</aside>
					<div class="ada5V">
						<div
							class="                  Igw0E     IwRSH      eGOV_         _4EzTm                                                          DhRcB                                                    ">
							<button class="_0mzm- sqdOP yWX7d    _8A5w5    " type="button">
								<div
									class="_7UhW9   xLCgt      MMzan  KV-D4        uL8Hv         ">남성</div>
							</button>
						</div>
					</div>
				</div>
			</div>
			<div class="eE-OA">
				<aside class="sxIVS  tvweK">
					<label></label>
				</aside>
				<div class="ada5V">
					<div class="fi8zo">
						<button class="_0mzm- sqdOP  L3NKy       "
							type="submit">제출</button>
					</div>
				</div>
			</div>
		</form>
	</article>
</div>
</main>