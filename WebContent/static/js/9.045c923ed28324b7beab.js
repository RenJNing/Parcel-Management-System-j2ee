webpackJsonp([9],{lO7g:function(e,t,o){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n={data:function(){return{activeIndex:"1",email:sessionStorage.getItem("ms_email")}},methods:{gotoCommunity:function(){this.$router.push("/Home/community")},handleSelect:function(e,t){"1"===e&&this.$router.push("/Home"),"2"===e&&this.$router.push("/Home/myparcel"),"3"===e&&this.$router.push("/Home/sendparcel"),"4-1"===e&&this.$router.push("/Home/community"),"4-2"===e&&this.$router.push("/Home/community/newtopic")},handleCommand:function(e){"a"===e&&this.$router.push("/Home/modifypassword"),"b"===e&&(this.$router.push("/login"),sessionStorage.clear())}}},s={render:function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("div",{attrs:{id:"home"}},[o("el-container",[o("el-header",[o("div",{staticClass:"logo"},[e._v("快递管理系统")]),e._v(" "),o("el-menu",{staticClass:"menu",attrs:{"default-active":e.activeIndex,mode:"horizontal"},on:{select:e.handleSelect}},[o("el-menu-item",{attrs:{index:"1"}},[e._v("首页")]),e._v(" "),o("el-menu-item",{attrs:{index:"2"}},[e._v("我的订单")]),e._v(" "),o("el-menu-item",{attrs:{index:"3"}},[e._v("我要寄件")]),e._v(" "),o("el-submenu",{attrs:{index:"4"}},[o("template",{slot:"title"},[e._v("多说两句")]),e._v(" "),o("el-menu-item",{attrs:{index:"4-1"}},[e._v("进入话题区")]),e._v(" "),o("el-menu-item",{attrs:{index:"4-2"}},[e._v("创建话题")])],2)],1),e._v(" "),o("div",{staticClass:"user_info"},[o("el-dropdown",{on:{command:e.handleCommand}},[o("span",{staticClass:"el-dropdown-link"},[e._v(e._s(e.email))]),e._v(" "),o("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[o("el-dropdown-item",{attrs:{command:"a"}},[e._v("修改密码")]),e._v(" "),o("el-dropdown-item",{attrs:{command:"b"}},[e._v("注销")])],1)],1)],1)],1),e._v(" "),o("el-main",[o("router-view")],1),e._v(" "),o("el-footer",[e._v("Footer")])],1)],1)},staticRenderFns:[]};var i=o("vSla")(n,s,!1,function(e){o("mXZT")},"data-v-4e5692b4",null);t.default=i.exports},mXZT:function(e,t){}});
//# sourceMappingURL=9.045c923ed28324b7beab.js.map