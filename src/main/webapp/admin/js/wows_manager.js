function getDictItemName(value,divObj,urlAddr) {
//获取td内容进行拆分
    var idArray=value.split("#");

    //使用ajax发送数据
    $.ajax({
        type:"POST",
        url:urlAddr,
        contentType:"application/json",
        dataType:"json",
        data:JSON.stringify(idArray),
        success:function(data) {
            //获取名字列表
            //alert(data[0]);
            var str="";
            for(var i=0;i<data.length;i++)
            {
                str+=data[i]+" ";
            }
            $(divObj).html(str);
        }

    });
}
//前台页面使用的需要拼接div保证样式正确输出
function getDictItemNameView(value,divObj,urlAddr,type) {
//获取td内容进行拆分
    var idArray=value.split("#");

    //使用ajax发送数据
    $.ajax({
        type:"POST",
        url:urlAddr,
        contentType:"application/json",
        dataType:"json",
        data:JSON.stringify(idArray),
        success:function(data) {
            //获取名字列表
            //alert(data[0]);
            var str="";
            for(var i=0;i<data.length;i++)
            {
                if(type=="tagids") {
                    str += '<span class="top_tag">' + data[i] + '  </span>';
                }else if(type=="platform"){
                    //一定要保留_img后面那个空格，因为对应的文件那个地方就是留了一个空格
                    str += '<span class="platform_img '+data[i]+'"></span>';
                }
            }
            $(divObj).prepend(str);
        }

    });
}

//拼接checkbox中多选后的id，用#号分开
function joinTagidsAndPlatformId(name,divObj) {
    $("input[name=" + name + "]").click(function () {
        //创建一个数组
        var arr=[];
        $("input[name=" + name + "]").each(function () {
            //拼接Id字符串
            if(this.checked)
            {
                //被选中则加入
                arr.push(this.value);
            }else{
                //未被选中/取消选择，则将其置为空
                var index=arr.indexOf(this.value);
                if(index!=-1)
                {
                    arr[index]="";
                }
            }
        });
        //遍历完成
        //将数组保存在隐藏域,并用#分割的方式
        $(divObj).val(arr.join("#"));
    });
}

//修改弹出层checkbox的回显
function setTagidsAndPlatformEcho(allData,itemData) {
    var allDataIds=allData;//修改弹出层中所有的checkbox
    var itemIds=itemData.split("#");//回显需要的，并进行拆分
    for(var i=0;i<allDataIds.length;i++)
    {
        for(var j=0;j<itemIds.length;j++ )
        {
            if(allDataIds[i].value==itemIds[j])
            {
                allDataIds[i].checked=true;
            }
        }
    }
}

//处理标志位回显
function setFlagEcho(name,value) {
    var flag=$("input[name=" + name + "]");
    $(flag).val(value);
    //console.log("is hot"+data.is_hot);
    $(flag).prop("checked",value);

}