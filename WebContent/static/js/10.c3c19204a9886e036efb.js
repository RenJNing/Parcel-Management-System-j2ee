webpackJsonp([10],{"1Amm":function(e,r){},ZN67:function(e,r,s){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var t=s("xB4m"),a={data:function(){return{OrderForm:{sendername:"",senderphone:"",senderaddress:"",receivename:"",receivephone:"",receiveaddress:"",date:""},rules:{sendername:[{required:!0,message:"请输入寄件人姓名！",trigger:"blur"}],senderphone:[{required:!0,message:"请输入寄件人手机！",trigger:"blur"},{pattern:/^[0-9]{11}$/,message:"请输入11位手机号码",trigger:"blur"}],senderaddress:[{required:!0,message:"请输入寄件人地址！",trigger:"blur"}],receivename:[{required:!0,message:"请输入收件人姓名！",trigger:"blur"}],receivephone:[{required:!0,message:"请输入收件人手机！",trigger:"blur"},{pattern:/^[0-9]{11}$/,message:"请输入11位手机号码",trigger:"blur"}],receiveaddress:[{required:!0,message:"请输入寄件人地址！",trigger:"blur"}],date:[{type:"date",required:!0,message:"请选择时间",trigger:"change"}]}}},methods:{codeParsing:function(e){var r;switch(e){case-1:r="未知错误，请上报管理员",Object(t.Message)({message:r,type:"error",center:!0})}},resetForm:function(e){this.$refs[e].resetFields()},confrim:function(e){var r=this,s=this;this.$refs[e].validate(function(e){if(!e)return Object(t.Message)({message:"格式错误，请检查输入",type:"error",center:!0}),!1;r.$axios.post("user/sendparcel",{sendername:r.OrderForm.sendername,senderphone:r.OrderForm.senderphone,senderaddress:r.OrderForm.senderaddress,receivename:r.OrderForm.receivename,receivephone:r.OrderForm.receivephone,receiveaddress:r.OrderForm.receiveaddress,date:r.OrderForm.date,useremail:sessionStorage.getItem("ms_email")}).then(function(e){200===e.data.code?(Object(t.Message)({message:"成功提交订单",type:"success",center:!0}),s.resetForm("OrderForm")):s.codeParsing(e.data.code)}).catch(function(e){console.log(e),Object(t.Message)({message:"请检查网络并重试",type:"error",center:!0})})})}}},d={render:function(){var e=this,r=e.$createElement,s=e._self._c||r;return s("div",{attrs:{id:"order"}},[s("el-form",{ref:"OrderForm",staticClass:"OrderForm",attrs:{model:e.OrderForm,rules:e.rules,"label-width":"100px"}},[s("el-form-item",{attrs:{prop:"sendername",label:"寄件人姓名："}},[s("el-input",{attrs:{placeholder:"请填写联系人姓名"},model:{value:e.OrderForm.sendername,callback:function(r){e.$set(e.OrderForm,"sendername",r)},expression:"OrderForm.sendername"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"senderphone",label:"寄件人手机："}},[s("el-input",{attrs:{placeholder:"请填写手机号"},model:{value:e.OrderForm.senderphone,callback:function(r){e.$set(e.OrderForm,"senderphone",r)},expression:"OrderForm.senderphone"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"senderaddress",label:"上门地址："}},[s("el-input",{attrs:{placeholder:"请填写所在地区及详细地址"},model:{value:e.OrderForm.senderaddress,callback:function(r){e.$set(e.OrderForm,"senderaddress",r)},expression:"OrderForm.senderaddress"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"receivename",label:"收件人姓名："}},[s("el-input",{attrs:{placeholder:"请填写联系人姓名"},model:{value:e.OrderForm.receivename,callback:function(r){e.$set(e.OrderForm,"receivename",r)},expression:"OrderForm.receivename"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"receivephone",label:"收件手机："}},[s("el-input",{attrs:{placeholder:"请填写手机号"},model:{value:e.OrderForm.receivephone,callback:function(r){e.$set(e.OrderForm,"receivephone",r)},expression:"OrderForm.receivephone"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"receiveaddress",label:"收货地址："}},[s("el-input",{attrs:{placeholder:"请填写所在地区及详细地址"},model:{value:e.OrderForm.receiveaddress,callback:function(r){e.$set(e.OrderForm,"receiveaddress",r)},expression:"OrderForm.receiveaddress"}})],1),e._v(" "),s("el-form-item",{attrs:{prop:"date",label:"上门时间："}},[s("el-date-picker",{staticStyle:{width:"100%"},attrs:{type:"date",placeholder:"请选择您适合的时间"},model:{value:e.OrderForm.date,callback:function(r){e.$set(e.OrderForm,"date",r)},expression:"OrderForm.date"}})],1),e._v(" "),s("el-button",{attrs:{type:"primary"},on:{click:function(r){e.confrim("OrderForm")}}},[e._v("确认")]),e._v(" "),s("el-button",{on:{click:function(r){e.resetForm("OrderForm")}}},[e._v("重置")])],1)],1)},staticRenderFns:[]};var n=s("vSla")(a,d,!1,function(e){s("1Amm")},"data-v-3280e238",null);r.default=n.exports}});
//# sourceMappingURL=10.c3c19204a9886e036efb.js.map