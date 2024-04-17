package com.camp.going.controller;

import com.camp.going.common.Search;
import com.camp.going.service.CampingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main")
@RequiredArgsConstructor
@Slf4j
public class ReservationController {

    private final CampingService service;


    
    // 캠핑장 목록 보기 요청
    @GetMapping("/reservation")
    public String reservationShow(Model model, @ModelAttribute("s") Search page){

//        System.out.println("search = " + page);
//        List<CampingListResponseDTO> dtoList = service.getList(page);
//
//
//        // 페이징 버튼 알고리즘 적용 -> 사용자가 요청한 페이지 정보, 총 게시물 개수를 전달.
//        // 페이징 알고리즘 자동 호출.
//        PageMaker pageMaker = new PageMaker(page, service.getCount(page));
//
//        model.addAttribute("camp", dtoList);
//        model.addAttribute("maker", pageMaker);

        return "index";
    }


    @GetMapping("/resevation-detail")
    public String reservationDetail(Model model){

//        service.reservationOne();
    return null;




    }

//    @GetMapping("/resevation-detail")
//    public String reservationDetail(Model model){
//
//        service.reservationOne();
//
//
//
//
//    }






}
