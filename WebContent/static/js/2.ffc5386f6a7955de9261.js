webpackJsonp([2],{QzN9:function(s,r){},gR5N:function(s,r,e){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var o=e("xB4m"),a={data:function(){var s=this;return{passwordform:{oldpassword:"",newpassword:"",confirmpassword:""},rules:{oldpassword:[{required:!0,message:"请输入密码！",trigger:"blur"}],newpassword:[{required:!0,message:"请输入密码！",trigger:"blur"},{min:6,max:16,message:"长度在6-16位之间",trigger:"blur"},{pattern:/^[a-zA-Z0-9]+$/,message:"密码仅可由数字与字母组成"}],confirmpassword:[{validator:function(r,e,o){""===e?o(new Error("请再次输入密码")):e!==s.passwordform.newpassword?o(new Error("两次输入密码不一致!")):o()},trigger:"blur"}]}}},methods:{codeParsing:function(s){var r=function(s){Object(o.Message)({message:s,type:"error",center:!0})};switch(s){case-1:r("未知错误，请上报管理员");break;case 301:r("密码错误")}},resetForm:function(s){this.$refs[s].resetFields()},confrim:function(s){var r=this,e=this;this.$refs[s].validate(function(s){if(!s)return Object(o.Message)({message:"格式错误，请检查输入",type:"error",center:!0}),!1;r.$axios.post("user/modifypassword",{oldpassword:r.passwordform.oldpassword,newpassword:r.passwordform.newpassword}).then(function(s){200===s.data.code?(Object(o.Message)({message:"成功修改密码",type:"success",center:!0}),e.resetForm("passwordform")):e.codeParsing(s.data.code)}).catch(function(s){console.log(s),Object(o.Message)({message:"请检查网络并重试",type:"error",center:!0})})})}}},t={render:function(){var s=this,r=s.$createElement,e=s._self._c||r;return e("div",[e("el-form",{ref:"passwordform",attrs:{"label-width":"80px",rules:s.rules,model:s.passwordform}},[e("el-form-item",{attrs:{type:"password",prop:"oldpassword",label:"旧密码"}},[e("el-input",{attrs:{type:"password"},model:{value:s.passwordform.oldpassword,callback:function(r){s.$set(s.passwordform,"oldpassword",r)},expression:"passwordform.oldpassword"}})],1),s._v(" "),e("el-form-item",{attrs:{prop:"newpassword",label:"新密码"}},[e("el-input",{attrs:{type:"password"},model:{value:s.passwordform.newpassword,callback:function(r){s.$set(s.passwordform,"newpassword",r)},expression:"passwordform.newpassword"}})],1),s._v(" "),e("el-form-item",{attrs:{prop:"confirmpassword",label:"确认密码"}},[e("el-input",{attrs:{type:"password"},model:{value:s.passwordform.confirmpassword,callback:function(r){s.$set(s.passwordform,"confirmpassword",r)},expression:"passwordform.confirmpassword"}})],1),s._v(" "),e("el-button",{attrs:{type:"primary"},on:{click:function(r){s.confrim("passwordform")}}},[s._v("确认")]),s._v(" "),e("el-button",{on:{click:function(r){s.resetForm("passwordform")}}},[s._v("重置")])],1)],1)},staticRenderFns:[]};var n=e("vSla")(a,t,!1,function(s){e("QzN9")},"data-v-97a125cc",null);r.default=n.exports}});
//# sourceMappingURL=2.ffc5386f6a7955de9261.js.map