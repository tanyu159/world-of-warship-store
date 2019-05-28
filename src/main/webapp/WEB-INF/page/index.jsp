<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><!--这里追加一个-->
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %><!--小数输出格式-->
<%@page isELIgnored="false" %><!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>WarGaming.net加值商城</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/index.css">
    <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
</head>

<body class="v6 infinite_scrolling responsive_page">
<div class="responsive_page_content">
    <div id="global_header">
        <div class="content">
            <div class="logo">
            <span id="logo_holder">
                <a href="#">
                  <img src="${pageContext.request.contextPath}/image/globalheader_logo.png?t=962016" width="176" height="44">
                </a>
            </span>
            </div><!--logo end-->
            <div class="supernav_container">
                <a class="menuitem supernav" href="#">主打</a>
                <a class="menuitem supernav" href="#">達布隆</a>
                <a class="menuitem" href="#">加值帳號</a>
                <a class="menuitem" href="#">游戏特色</a>
            </div><!--menu end-->
            <div id="global_actions">
                <div id="global_action_menu">
                    <a class="global_action_link" href="/admin/items">回到后台</a>
                </div>
            </div><!--login end-->
        </div><!--content end-->
    </div><!--global_header end-->

    <div class="responsive_page_template_content">
        <div class="home_page_body_ctn has_takeover">
            <div class="page_background_holder"></div>
            <div id="store_nav_area">
                <div class="store_nav">
                    <div class="tab  flyout_tab" id="foryou_tab">
                <span class="pulldown">
                  <a class="pulldown_desktop" href="#">我的购物车</a>
                  <span></span>
                </span>
                    </div>
                    <div class="popup_block_new flyout_tab_flyout responsive_slidedown" id="foryou_flyout" style="visibility: visible; top:35px; left: 0px; display:none; opacity: 1;">
                        <div class="popup_body popup_menu">
                            <a class="popup_menu_item" href="#">商店主页</a>
                            <div class="hr"></div>
                            <a class="popup_menu_item" href="#">最近查看过的</a>
                            <a class="popup_menu_item" href="#">我的优惠券</a>
                            <a class="popup_menu_item" href="#">我的兑换码</a>
                        </div>
                    </div>
                    <div class="tab  flyout_tab" id="genre_tab">
                  <span class="pulldown">
                    <a class="pulldown_desktop" href="#">舰艇</a>
                    <span></span>
                  </span>
                    </div>
                    <div class="popup_block_new flyout_tab_flyout responsive_slidedown" id="foryou_flyout2" style="visibility: visible; top:35px; left:110px; display:none; opacity: 1;">
                        <div class="popup_body popup_menu">
                            <a class="popup_menu_item" href="#">战列舰BB</a>
                            <div class="hr"></div>
                            <a class="popup_menu_item" href="#">巡洋舰CL</a>
                            <a class="popup_menu_item" href="#">驱逐舰DD</a>
                            <a class="popup_menu_item" href="#">航空母舰CV</a>
                        </div>
                    </div>
                    <div class="tab  flyout_tab" id="software_tab">
                  <span class="pulldown">
                      <a class="pulldown_desktop" href="#">论坛</a>
                      <span></span>
                  </span>
                    </div>
                    <div class="popup_block_new flyout_tab_flyout responsive_slidedown" id="foryou_flyout3" style="visibility: visible; top:35px; left:200px; display:none; opacity: 1;">
                        <div class="popup_body popup_menu">
                            <a class="popup_menu_item" href="#">ASIA伺服器讨论中心</a>
                            <div class="hr"></div>
                            <a class="popup_menu_item" href="#">NA伺服器讨论中心</a>
                            <a class="popup_menu_item" href="#">RU伺服器讨论中心</a>

                        </div>
                    </div>


                    <div class="tab  flyout_tab" id="news_tab">
                <span class="pulldown">
                  <a class="pulldown_desktop" href="#">新闻</a>
                  <span></span>
                </span>
                    </div>
                    <div class="popup_block_new flyout_tab_flyout responsive_slidedown" id="foryou_flyout5" style="visibility: visible; top:35px; left:380px; display:none; opacity: 1;">
                        <div class="popup_body popup_menu">
                            <a class="popup_menu_item" href="#">PT公测服务器</a>
                            <div class="hr"></div>
                            <a class="popup_menu_item" href="#">CBT封测服务器</a>
                            <a class="popup_menu_item" href="#">TST航母二改内测服务器</a>
                        </div>
                    </div>

                </div><!--menu end-->
                <div class="searchbox">
                    <form id="searchform" >
                        <input id="store_nav_search_term" name="term" type="text" class="default" placeholder="站内搜索" size="22" autocomplete="off">
                        <a href="#" id="store_search_link" >
                            <img src="${pageContext.request.contextPath}/image/blank.gif">
                        </a>
                        </form>
                </div><!--search box end-->
            </div><!--store_nav_area end-->
        </div>
    </div><!--responsive_page_template_content end-->


        <div class="main-right-banner">
            <h3 class="banner_tt">
                当前热门
            </h3>
            <div class="example">
                <div class="ft-carousel" id="carousel_1">
                    <div class="ft-over">
                        <ul class="carousel-inner">
                            <li class="carousel-item">
                                <div class="big">
                                    <a href="#"><img src="${pageContext.request.contextPath}/image/Harekaze_616x353.jpg" /></a>
                                </div>
                                <div class="small">
                                    <h3>HSF Y467 Harekaze晴风号</h3>
                                    <a href="#"><img src="${pageContext.request.contextPath}/image/Harekaze_616x353.jpg" /></a>
                                    <a href="#"><img src="${pageContext.request.contextPath}/image/Harekaze01_616x353.jpg" /></a>
                                    <a href="#"><img src="${pageContext.request.contextPath}/image/Harekaze02_616x353.jpg" /></a>
                                    <a href="#"><img src="${pageContext.request.contextPath}/image/Harekaze03_616x353.jpg" /></a>
                                    <div class="discount_block_left  no_discount discount_block_inline">
                                        <div class="discount_final_price">¥ 258</div>
                                    </div>
                                    <div class="platforms">
                                        <span class="platform_img DD"></span>
                                    </div>
                                </div>
                            </li>
                            <li class="carousel-item">
                                <div class="big">
                                    <img src="${pageContext.request.contextPath}/image/Enterprise_616x353.jpg" />
                                </div>
                                <div class="small">
                                    <h3>Enterprise企业号</h3>
                                    <img src="${pageContext.request.contextPath}/image/Enterprise_616x353.jpg" />
                                    <img src="${pageContext.request.contextPath}/image/Enterprise01_616x353.jpg" />
                                    <img src="${pageContext.request.contextPath}/image/Enterprise02_616x353.jpg" />
                                    <img src="${pageContext.request.contextPath}/image/Enterprise03_616x353.jpg" />
                                    <div class="discount_block_left  no_discount discount_block_inline">
                                        <div class="discount_final_price">¥ 320</div>
                                    </div>
                                    <div class="platforms">
                                        <span class="platform_img CV"></span>
                                    </div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div><!--banner end-->

            <h3 class="banner_tt">按标签查找</h3>
            <div class="button_container">
                <!--按标签进行排序-->
                <div class="btn_wrapper">
                    <a href="javaScript:void(0)" class="big_button" onclick="sort('is_new')">
                        新品          </a>
                </div>
                <div class="btn_wrapper">
                    <a href="javaScript:void(0)" class="big_button" onclick="sort('is_specials')">
                        特价          </a>
                </div>

                <div class="btn_wrapper">
                    <a href="javaScript:void(0)" class="big_button" onclick="sort('is_upcoming')">
                        即将上架         </a>
                </div>
            </div><!--标签 end-->
            <div style="height:20px;clear:both;width:1px;"></div>
            <div class="list-box show">
                <div id="top_item_list">
                    <c:forEach items="${itemList}" var="item" begin="0" end="5">
                        <!--不点任何标签的默认的查询一次，也就是后台管理的前6个-->
                        <!--这里与IndexController中对应,且只显示6条数据-->
                        <a href="#" class="tab_item   app_impression_tracked">
                            <!-- 封面图 -->
                            <div class="tab_item_cap">
                                <!--使用的是uploadimg的虚拟路径images-->
                                <img class="tab_item_cap_img" src="/uploadImg/${item.item_cap_image}">
                            </div>

                            <c:if test="${item.item_discount==0||item.item_discount==null}"><!--处理无折扣的时候价格的显示-->
                            <!-- 价格相关 -->
                            <div class="discount_block tab_item_discount no_discount">
                                <div class="discount_prices">
                                    <div class="discount_final_price">￥${item.item_original_price}</div>
                                </div>
                            </div>
                            </c:if>

                            <c:if test="${item.item_discount!=0&&item.item_discount!=null}"><!--处理有折扣的时候价格的显示-->
                            <!-- 价格相关 -->
                            <div class="discount_block tab_item_discount_discount">
                                <!--显示折扣绿条-->
                                <div class="discount_pct">-${item.item_discount}%</div>
                                <div class="discount_prices">
                                    <div class="discount_original_price">￥${item.item_original_price}</div>
                                    <div class="discount_final_price">
                                        <!--仅保留两位小数-->
                                        ￥<fmt:formatNumber value="${item.item_original_price*(1-item.item_discount*0.01)}" type="number" maxFractionDigits="2"/>
                                    </div>
                                </div>
                            </div>
                            </c:if>
                            <div class="tab_item_content">
                                <!-- 舰艇名称 -->
                                <div class="tab_item_name">${item.item_name}</div>

                                <!-- 类型和国籍标签 -->
                                <!--隐藏域获取平台 标签 id字符串-->
                                <input type="hidden" class="tab_item_tagids" value="${item.item_tagids}">
                                <input type="hidden" class="tab_item_platform" value="${item.item_platform}">
                                <div class="tab_item_details">
                                    <!-- 平台 -->
                                    <!--清空原有的这些静态内容-->
                                    <!-- 标签 -->
                                    <div class="tab_item_top_tags">
                                        <!--清空原有的这些静态内容-->
                                    </div>
                                </div>
                            </div>
                            <div style="clear: both;"></div>
                        </a>
                    </c:forEach>

                </div>
            </div>
            <!--box1 end-->

            <h3 class="banner_tt">
                最新新闻
            </h3>
            <div class="marketingmessage_container">
                <a class="home_marketing_message" href="#">
                    <span style="background-image: url(&quot;${pageContext.request.contextPath}/image/1.jpg&quot;);"></span>
                    <div class="discount_block discount_block_inline">

                    </div>
                </a>
                <a data-ds-appid="750920" href="#" class="home_marketing_message">
                    <span style="background-image: url(&quot;${pageContext.request.contextPath}/image/2.jpg&quot;);"></span>
                    <div>
                        <div class="discount_block  no_discount discount_block_inline">
                            <div class="discount_prices">

                            </div>
                        </div>
                    </div>
                </a>
                <a data-ds-appid="730" href="#" class="home_marketing_message small">
                    <span style="background-image: url(&quot;${pageContext.request.contextPath}/image/3.jpg&quot;);"></span>
                    <div>
                        <div class="discount_block  no_discount discount_block_inline">
                            <div class="discount_prices"><div class="discount_final_price">进入查看详情</div>
                            </div>
                        </div>
                    </div>
                </a>
                <a data-ds-appid="414340" href="#" class="home_marketing_message small">
                    <!--高级账号5折销售-->
                    <span style="background-image: url(&quot;${pageContext.request.contextPath}/image/4.jpg&quot;);"></span>
                    <div>
                        <div class="discount_block  discount_block_inline">
                            <div class="discount_pct">-50%</div>
                            <div class="discount_prices">
                                <div class="discount_original_price">¥ 88</div>
                                <div class="discount_final_price">¥ 44</div>
                            </div>
                        </div>
                    </div>
                </a>
            </div><!--end-->

    </div><!--main end-->

</div><!--responsive_page_content END-->
<div id="footer" class="">
    <div class="footer_content">
        <div class="rule"></div>
        <div id="footer_logo_steam"><img src="${pageContext.request.contextPath}/image/logo_wargaming_footer.png" alt="WarGaming Software" border="0"></div>

        <div id="footer_logo">
            <a href="#" target="_blank" rel="noreferrer">
                <img src="${pageContext.request.contextPath}/image/logo_wargaming_footer.png" alt="WarGaming Software" border="0">
            </a>
        </div>
        <div id="footer_text">
            <div>©2018 WarGaming.net 保留所有权利。所有商标均为其在美国及其它国家/地区的各自持有者所有。</div>
            <div>
                所有的价格均已包含增值税（如适用）。&nbsp;&nbsp;
                <a href="#" target="_blank" rel="noreferrer">隐私政策</a>
                &nbsp; | &nbsp;
                <a href="#" target="_blank" rel="noreferrer">法律信息</a>
                &nbsp; | &nbsp;
                <a href="#" target="_blank" rel="noreferrer">WarGaming.net 订户协议</a>
                &nbsp; | &nbsp;
                <a href="#" target="_blank" rel="noreferrer">退款</a>
            </div>
        </div>
        <div style="clear: left;"></div>
        <br>
        <div class="rule"></div>
        <div class="valve_links">
            <a href="#" target="_blank" rel="noreferrer">关于 WarGaming</a>
            &nbsp; | &nbsp;
            <a href="#" target="_blank" rel="noreferrer">工作</a>
            &nbsp; | &nbsp;
            <a href="#" target="_blank" rel="noreferrer">优惠券</a>
            &nbsp; | &nbsp;
            <a href="#" target="_blank" rel="noreferrer"><img src="${pageContext.request.contextPath}/image/ico_facebook.gif"> WarGaming</a>
            &nbsp; | &nbsp;
            <a href="#" target="_blank" rel="noreferrer"><img src="${pageContext.request.contextPath}/image/ico_twitter.gif"> @wargaming</a>
        </div>
    </div>
</div>
</body>
<!--引入自定义的js-->
<script src="${pageContext.request.contextPath}/admin/js/wows_manager.js"></script>
<script type="text/javascript">
    $(function () {
        init();
    });
    function init() {
        //获取标签id 字符串 数组
        var tagidsList=$(".tab_item_tagids");
        //获取平台id 字符串 数组
        var platformList=$(".tab_item_platform");
        //获取要添加到的div数组
        //标签
        var tagidsDivList=$(".tab_item_top_tags");
        //平台
        var platformDivList=$(".tab_item_details");
        //请求地址
        var urlAddr="${pageContext.request.contextPath}/admin/items/adminTags";
        for(var i=0;i<tagidsList.length;i++)
        {
            getDictItemNameView(tagidsList[i].value,tagidsDivList[i],urlAddr,"tagids");
            getDictItemNameView(platformList[i].value,platformDivList[i],urlAddr,"platform");
        }
    }

    //根据标志位进行排序
    function sort(name) {
        console.log("执行了sort");
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/index/sort",
            dataType:"json",
            data:{"name":name},
            success:function (data) {
                //alert(data[0].item_name);


                //将拼好的字符串放入其中
                var divObj=$("#top_item_list");
                var str="";
                for(var i=0;i<data.length;i++)
                {
                    str+=
                        '<a href="#" class="tab_item   app_impression_tracked">'+
                        //<!-- 封面图 -->
                        '<div class="tab_item_cap">'+
                        '<img class="tab_item_cap_img" src="/uploadImg/'+data[i].item_cap_image+'">'+
                        '</div>';

                    if(data[i].item_discount == 0||data[i].item_discount == null){
                        //<!-- 价格相关  无折扣 -->
                        str+=
                            '<div class="discount_block tab_item_discount no_discount">'+
                            '<div class="discount_prices">';

                        str += '<div class="discount_final_price">¥ '+data[i].item_original_price+'</div>';


                        str +=
                            '</div>'+
                            '</div>';
                    }

                    if(data[i].item_discount != 0&&data[i].item_discount !=null){
                        //<!-- 价格相关 有折扣-->
                        str +=
                            '<div class="discount_block tab_item_discount">'+
                            '<div class="discount_pct">- '+data[i].item_discount+'%</div>'+
                            '<div class="discount_prices">'+
                            '<div class="discount_original_price">¥ '+data[i].item_original_price+'</div>'+
                            '<div class="discount_final_price">¥ '+(data[i].item_original_price * (1-data[i].item_discount * 0.01))+'</div>'+
                            '</div>'+
                            '</div>';
                    }
                    str +=
                        '<div class="tab_item_content">'+
                        //<!-- 舰艇名称 -->
                        '<div class="tab_item_name">'+data[i].item_name+'</div>'+
                        //<!-- 平台和标签 -->
                        //<!-- 隐藏域 获取平台 标签 id 字符串 -->
                        '<input type="hidden" class="tab_item_tagids" value="'+data[i].item_tagids+'">'+
                        '<input type="hidden" class="tab_item_platform" value="'+data[i].item_platform+'">'+
                        '<div class="tab_item_details">'+
                        //<!-- 平台 -->
                        //<!-- 标签 -->
                        '<div class="tab_item_top_tags">'+
                        '</div>'+
                        '</div>'+
                        '</div>'+
                        '<div style="clear: both;"></div>'+
                        '</a>';

                }

                $(divObj).html(str);
                init();
            }
        });
    }
</script>
<script src="${pageContext.request.contextPath}/js/ft-carousel.min.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/index.js" type="text/javascript"></script>
</html>