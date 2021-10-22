package com.seeyouthere.mockapi.domain;

import java.util.Random;

public enum ResponseTransportExamples {
    SUBWAY("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
        + "<ServiceResult>\n"
        + "    <comMsgHeader/>\n"
        + "    <msgHeader>\n"
        + "        <headerCd>0</headerCd>\n"
        + "        <headerMsg></headerMsg>\n"
        + "        <itemCount>0</itemCount>\n"
        + "    </msgHeader>\n"
        + "    <msgBody>\n"
        + "        <itemList>\n"
        + "            <distance>4459</distance>\n"
        + "            <pathList>\n"
        + "                <fid>02260</fid>\n"
        + "                <fname>사당역</fname>\n"
        + "                <fx>126.98157023232763</fx>\n"
        + "                <fy>37.476500562190715</fy>\n"
        + "                <railLinkList>\n"
        + "                    <railLinkId>1</railLinkId>\n"
        + "                </railLinkList>\n"
        + "                <railLinkList>\n"
        + "                    <railLinkId>2</railLinkId>\n"
        + "                </railLinkList>\n"
        + "                <railLinkList>\n"
        + "                    <railLinkId>3</railLinkId>\n"
        + "                </railLinkList>\n"
        + "                <railLinkList>\n"
        + "                    <railLinkId>4</railLinkId>\n"
        + "                </railLinkList>\n"
        + "                <routeNm>2호선</routeNm>\n"
        + "                <tid>02220</tid>\n"
        + "                <tname>강남역</tname>\n"
        + "                <tx>127.0279353277511</tx>\n"
        + "                <ty>37.4980170747733</ty>\n"
        + "            </pathList>\n"
        + "            <time>%s</time>\n"
        + "        </itemList>\n"
        + "    </msgBody>\n"
        + "</ServiceResult>")
    ,BUS("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
        + "<ServiceResult>\n"
        + "    <comMsgHeader/>\n"
        + "    <msgHeader>\n"
        + "        <headerCd>0</headerCd>\n"
        + "        <headerMsg></headerMsg>\n"
        + "        <itemCount>0</itemCount>\n"
        + "    </msgHeader>\n"
        + "    <msgBody>\n"
        + "        <itemList>\n"
        + "            <distance>3097</distance>\n"
        + "            <pathList>\n"
        + "                <fid>121000166</fid>\n"
        + "                <fname>사당역3번출구</fname>\n"
        + "                <fx>126.98201154415993</fx>\n"
        + "                <fy>37.475022815777294</fy>\n"
        + "                <routeId>224000019</routeId>\n"
        + "                <routeNm>3200시흥</routeNm>\n"
        + "                <tid>122000184</tid>\n"
        + "                <tname>강남역.역삼세무서</tname>\n"
        + "                <tx>127.02914550600106</tx>\n"
        + "                <ty>37.49807985962235</ty>\n"
        + "            </pathList>\n"
        + "            <time>%s</time>\n"
        + "        </itemList>\n"
        + "    </msgBody>\n"
        + "</ServiceResult>"),
    BUSNSUBWAY("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
        + "<ServiceResult>\n"
        + "    <comMsgHeader/>\n"
        + "    <msgHeader>\n"
        + "        <headerCd>0</headerCd>\n"
        + "        <headerMsg></headerMsg>\n"
        + "        <itemCount>0</itemCount>\n"
        + "    </msgHeader>\n"
        + "    <msgBody>\n"
        + "        <itemList>\n"
        + "            <distance>3097</distance>\n"
        + "            <pathList>\n"
        + "                <fid>121000166</fid>\n"
        + "                <fname>사당역3번출구</fname>\n"
        + "                <fx>126.98201154415993</fx>\n"
        + "                <fy>37.475022815777294</fy>\n"
        + "                <routeId>224000019</routeId>\n"
        + "                <routeNm>3200시흥</routeNm>\n"
        + "                <tid>122000184</tid>\n"
        + "                <tname>강남역.역삼세무서</tname>\n"
        + "                <tx>127.02914550600106</tx>\n"
        + "                <ty>37.49807985962235</ty>\n"
        + "            </pathList>\n"
        + "            <time>%s</time>\n"
        + "        </itemList>\n"
        + "    </msgBody>\n"
        + "</ServiceResult>");

    private final String material;

    ResponseTransportExamples(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String getData() {
        return String.format(material, 2 + (int) (Math.random() * 100));
    }
}
