webpackJsonp([8],{"gfY+":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var l=a("xB4m"),r={data:function(){return{tableData:[]}},mounted:function(){this.getmyparcel()},methods:{getmyparcel:function(){var e=this;this.$axios.post("user/getmyparcel",{useremail:sessionStorage.getItem("ms_email")}).then(function(t){200===t.data.code&&(e.tableData=[],t.data.obj.forEach(function(t){e.tableData.push({status:t.status?"已揽件":"未揽件",parcel_id:t.parcel_id,sendername:t.sendername,receivename:t.receivename,receiveaddress:t.receiveaddress,senderphone:t.senderphone,senderaddress:t.senderaddress,receivephone:t.receivephone,date:t.date})}))}).catch(function(e){console.log(e),Object(l.Message)({message:"请检查网络并重试",type:"error",center:!0})})}}},s={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("el-table",{staticStyle:{width:"100%"},attrs:{data:e.tableData,stripe:""}},[a("el-table-column",{attrs:{prop:"parcel_id",label:"订单号",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"status",label:"快递状态"}}),e._v(" "),a("el-table-column",{attrs:{prop:"sendername",label:"寄件人",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"senderphone",label:"寄件人手机",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"senderaddress",label:"寄件人地址","show-overflow-tooltip":"",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"date",label:"上门时间",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"receivename",label:"收件人",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"receivephone",label:"收件人手机",width:"180"}}),e._v(" "),a("el-table-column",{attrs:{prop:"receiveaddress",label:"收件地址","show-overflow-tooltip":"",width:"180"}})],1)],1)},staticRenderFns:[]};var n=a("vSla")(r,s,!1,function(e){a("kf0T")},null,null);t.default=n.exports},kf0T:function(e,t){}});
//# sourceMappingURL=8.da2c588a8646b35478a6.js.map