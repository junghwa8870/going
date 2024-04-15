package com.camp.going.dto.response;

import com.camp.going.entity.Notice;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter @EqualsAndHashCode
public class NoticeDetailResponseDTO {

    private final int noticeNo; // 글번호
    private final String noticeTitle; // 제목
    private final String noticeContent; // 내용
    private final String noticeDate; // 작성날짜
    private final int noticeCount; // 조회수

    public NoticeDetailResponseDTO(Notice notice) {
        this.noticeNo = notice.getNoticeNo();
        this.noticeTitle = notice.getNoticeTitle();
        this.noticeContent = notice.getNoticeContent();
        this.noticeDate = NoticeListResponseDTO.makePrettierDateString(notice.getNoticeDate());
        this.noticeCount = notice.getNoticeCount();
    }

}
