webpackJsonp([0],{AS41:function(e,r,t){e.exports=t.p+"static/img/background.814f7e7.jpg"},"v/ef":function(e,r){},xJsL:function(e,r,t){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var i=t("AS41"),o=t.n(i),a={data:function(){var e=this;return{title:"快递管理系统",location:o.a,activePane:"login",LoginForm:{email:"",password:""},RegisterForm:{email:"",nickname:"",password:"",confirm:""},loginrules:{email:[{required:!0,message:"请输入账号！",trigger:"blur"}],password:[{required:!0,message:"请输入密码！",trigger:"blur"}]},registerrules:{email:[{required:!0,message:"请输入邮箱！",trigger:"blur"},{type:"email",message:"请输入正确的Email格式",trigger:"blur"}],nickname:[{required:!0,message:"请输入昵称",trigger:"blur"},{pattern:/^([\u4e00-\u9fa5]|[a-zA-Z0-9])([\u4e00-\u9fa5]|[_|a-zA-Z0-9])+$/,message:"昵称仅可由中文、数字和字母组成"}],password:[{required:!0,message:"请输入密码！",trigger:"blur"},{min:6,max:16,message:"长度在6-16位之间",trigger:"blur"},{pattern:/^[a-zA-Z0-9]+$/,message:"密码仅可由数字与字母组成"}],confirm:[{validator:function(r,t,i){""===t?i(new Error("请再次输入密码")):t!==e.RegisterForm.password?i(new Error("两次输入密码不一致!")):i()},trigger:"blur"}]}}},methods:{login:function(e){var r=this;this.$refs[e].validate(function(e){if(!e)return alert("321"),!1;r.$axios.defaults.headers["Content-Type"]="application/x-www-form-urlencoded;charset=UTF-8",r.$axios.post("/user/login",{email:r.LoginForm.email,password:r.LoginForm.password}).then(function(e){console.log(e.data)}).catch(function(e){console.log(e)})})},register:function(e){var r=this;this.$refs[e].validate(function(e){if(!e)return alert("注册失败"),!1;r.$axios.post("/user/register",{email:r.RegisterForm.email,nickname:r.RegisterForm.nickname,password:r.RegisterForm.password}).then(function(e){console.log(e.data)}).catch(function(e){console.log(e)})})}}},s={render:function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{staticClass:"login"},[t("div",{staticClass:"background-div"},[t("img",{attrs:{src:e.location,width:"100%",height:"100%"}})]),e._v(" "),t("div",{staticClass:"top"},[t("h1",[e._v(e._s(e.title))]),e._v(" "),t("el-tabs",{model:{value:e.activePane,callback:function(r){e.activePane=r},expression:"activePane"}},[t("el-tab-pane",{attrs:{label:"登陆",name:"login"}},[t("el-form",{ref:"LoginForm",staticClass:"LoginForm",attrs:{model:e.LoginForm,rules:e.loginrules,"label-width":"0px"}},[t("el-form-item",{attrs:{prop:"email"}},[t("el-input",{attrs:{placeholder:"账号/邮箱"},model:{value:e.LoginForm.email,callback:function(r){e.$set(e.LoginForm,"email",r)},expression:"LoginForm.email"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"password"}},[t("el-input",{attrs:{type:"password",placeholder:"密码"},model:{value:e.LoginForm.password,callback:function(r){e.$set(e.LoginForm,"password",r)},expression:"LoginForm.password"}})],1),e._v(" "),t("el-button",{staticStyle:{width:"100%"},attrs:{type:"primary",icon:"el-icon-upload"},on:{click:function(r){e.login("LoginForm")}}},[e._v("登陆")])],1)],1),e._v(" "),t("el-tab-pane",{attrs:{label:"注册",name:"register"}},[t("el-form",{ref:"RegisterForm",staticClass:"RegisterForm",attrs:{model:e.RegisterForm,rules:e.registerrules,"label-width":"0px"}},[t("el-form-item",{attrs:{prop:"email"}},[t("el-input",{attrs:{placeholder:"邮箱"},model:{value:e.RegisterForm.email,callback:function(r){e.$set(e.RegisterForm,"email",r)},expression:"RegisterForm.email"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"nickname"}},[t("el-input",{attrs:{placeholder:"昵称"},model:{value:e.RegisterForm.nickname,callback:function(r){e.$set(e.RegisterForm,"nickname",r)},expression:"RegisterForm.nickname"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"password"}},[t("el-input",{attrs:{type:"password",placeholder:"请输入6-16位密码"},model:{value:e.RegisterForm.password,callback:function(r){e.$set(e.RegisterForm,"password",r)},expression:"RegisterForm.password"}})],1),e._v(" "),t("el-form-item",{attrs:{prop:"confirm"}},[t("el-input",{attrs:{type:"password",placeholder:"确认密码"},model:{value:e.RegisterForm.confirm,callback:function(r){e.$set(e.RegisterForm,"confirm",r)},expression:"RegisterForm.confirm"}})],1),e._v(" "),t("el-button",{staticStyle:{width:"100%"},attrs:{type:"primary",icon:"el-icon-upload"},on:{click:function(r){e.register("RegisterForm")}}},[e._v("注册")])],1)],1)],1)],1)])},staticRenderFns:[]};var l=t("vSla")(a,s,!1,function(e){t("v/ef")},null,null);r.default=l.exports}});
//# sourceMappingURL=0.145c39445108f59d510d.js.map