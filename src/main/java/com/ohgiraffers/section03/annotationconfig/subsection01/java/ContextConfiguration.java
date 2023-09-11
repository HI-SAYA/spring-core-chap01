package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("configurationSection03")
///*1. test1 */
////@ComponentScan(basePackages = "com.ohgiraffers")
///* 2. test2 - excludeFilters*/
//@ComponentScan(//어디서 스캐닝 해올껀지, 이 하위에 있는 모든 영역을 대상으로 스캔해 올 친구를 찾아온다
//        basePackages = "com.ohgiraffers",
//excludeFilters = {
//                @ComponentScan.Filter(  //필터에서 MemberDAO를 걸렀다 그래서 스캐닝할때 뻄
//                        /* 1. 타입으로 설정 */
//                        //type = FilterType.ASSIGNABLE_TYPE, classes = {MemberDAO.class}
//                        /* 2. 어노테이션 종류로 설정 */
//                        //type = FilterType.ANNOTATION, classes = {org.springframework.stereotype.Component.class}
//                        //springframework 에 Component.class 는 거르겠다
//                        /*3. 표현식으로 설정 */
//                        type = FilterType.REGEX, pattern = {"com.ohgiraffers.section03.annotationconfig.subsection01.java.*"}
//
//                )
//})
/* 3. Test3 - includeFilters */
//@ComponentScan(
//        basePackages = "com.ohgiraffers",
//        useDefaultFilters = false,  //false = 자동으로 하는걸 잠깐 꺼 놓는다 즉 off로 해준다
//        includeFilters = {
//                /* excludeFilters 에서 설정하는 방식과 동일하다. */
//                @ComponentScan.Filter(
//                        type = FilterType.ASSIGNABLE_TYPE, classes = {MemberDAO.class}
//                )
//        }
//)
public class ContextConfiguration {

}