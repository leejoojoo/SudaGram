package org.sudaPro.web.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.sudaPro.web.editProfile.service.EditProfileService;
import org.sudaPro.web.myPage.service.MypageService;
import org.sudaPro.web.myPage.vo.MypageVO;
import org.sudaPro.web.submitNewProfile.service.SubmitNewProfileService;

@Controller
public class MemeberController {
	
	
	@Inject
	MypageService mypageService;
	
	@Inject
	EditProfileService editprofileService;
	
	@Inject
	SubmitNewProfileService submitnewprofileService;
	
	/*
	@Autowired
	private MypageDao dao;
	*/
	
	/*
	@RequestMapping("editProfile")
	public String editProfile() {
		return "member.editProfile";
	}
	*/
	
	@RequestMapping("submitNewProfile")
	public String submitNewProfile(MypageVO mypageVO) throws Exception {
		int m_code = 2;
		mypageVO.setM_code(m_code);
		submitnewprofileService.updateMyPage(mypageVO);
		System.out.println("controller m_id : "+mypageVO.getM_id());
		return "redirect:myPage";
	}
<<<<<<< Upstream, based on branch 'ji-eun' of https://github.com/leejoojoo/SudaGram.git
=======
	
	@RequestMapping("editProfile")
	public String editProfile(Model model) throws Exception {
//		editprofileService.updateMyPage(MypageVO);
		int m_code = 2;
		MypageVO myInfo = editprofileService.getMyInfo(m_code);
		model.addAttribute("myInfo", myInfo);
		
		return "member.editProfile";
	}
	
	@RequestMapping("myPage")
//	public String myPage(Model model, int m_code) throws Exception {
	public String myPage(Model model) throws Exception {
		int m_code = 2;
		MypageVO IDAndProfilePicture = mypageService.getIDAndProfilePicture(m_code);
		model.addAttribute("IDAndProfilePicture", IDAndProfilePicture );
		//System.out.println("IDAndProfilePicture controller : "+IDAndProfilePicture);
		model.addAttribute("NOP", mypageService.getNumberOfPost(m_code));
		//System.out.println("NOP controller : "+mypageService.getNumberOfPost(m_code));
		model.addAttribute("follower", mypageService.getNumberOfFollower(m_code));
		//System.out.println("follower controller : " + mypageService.getNumberOfFollower(m_code));
		model.addAttribute("following", mypageService.getNumberOfMyFollowing(m_code));
		//System.out.println("following controller : "+mypageService.getNumberOfMyFollowing(m_code));
		List<MypageVO> imglist = mypageService.getImage(m_code);
		//System.out.println("Images : "+imglist);
		model.addAttribute("imglist", imglist);
		return "member.myPage";
		
	}

	@RequestMapping("findPerson")
	public String findPerson() {
		return "member.findPerson";
	}
>>>>>>> 8360266 mypage
	
	@RequestMapping("login")
	public String login() {
		return "member.login";
	}
	
	@RequestMapping(value="regMember", method=RequestMethod.GET)
	public String regMember() {
		return "member.regMember";
	}
}
