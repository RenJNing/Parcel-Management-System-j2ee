webpackJsonp([3],{"M+7i":function(e,t){},sVDg:function(e,t,n){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var o=n("xB4m"),c={data:function(){return{CommentList:[],Topic:{title:JSON.parse(sessionStorage.getItem("topic")).title,createtime:JSON.parse(sessionStorage.getItem("topic")).createtime,nickname:JSON.parse(sessionStorage.getItem("topic")).nickname,content:JSON.parse(sessionStorage.getItem("topic")).content},commentform:{content:""},rules:{content:[{required:!0,message:"评论不能为空",trigger:"change"}]}}},methods:{getNowFormatDate:function(){var e=new Date,t=e.getFullYear(),n=e.getMonth()+1,o=e.getDate();return n>=1&&n<=9&&(n="0"+n),o>=0&&o<=9&&(o="0"+o),t+"-"+n+"-"+o},codeParsing:function(e){var t;switch(e){case 302:t="订单号不存在",Object(o.Message)({message:t,type:"error",center:!0})}},resetForm:function(e){this.$refs[e].resetFields()},addcomment:function(e){var t=this,n=this;this.$refs[e].validate(function(e){if(!e)return!1;t.$axios.post("user/addcomment",{content:t.commentform.content,nickname:sessionStorage.getItem("ms_nickname"),time:n.getNowFormatDate(),topic_id:JSON.parse(sessionStorage.getItem("topic")).topic_id}).then(function(e){200===e.data.code?(Object(o.Message)({message:"成功发表评论",type:"success",center:!0}),n.resetForm("commentform"),n.CommentList.push({nickname:sessionStorage.getItem("ms_nickname"),time:n.getNowFormatDate(),content:n.commentform.content})):n.codeParsing(e.data.code)}).catch(function(e){console.log(e),Object(o.Message)({message:"请检查网络并重试",type:"error",center:!0})})})}},mounted:function(){var e=this,t="user/getcomment/"+JSON.parse(sessionStorage.getItem("topic")).topic_id;this.$axios.get(t).then(function(t){200===t.data.code?t.data.obj.forEach(function(t){e.CommentList.push({nickname:t.nickname,content:t.content,time:t.time})}):console.log(t.data.code)}).catch(function(e){console.log(e),Object(o.Message)({message:"请检查网络并重试",type:"error",center:!0})})}},s={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",[n("div",[n("h1",[e._v(e._s(e.Topic.title))]),e._v(" "),n("span",[e._v(e._s(e.Topic.createtime))]),e._v(" "),n("hr")]),e._v(" "),n("div",[n("h2",[e._v(e._s(e.Topic.nickname))]),e._v(" "),n("p",[e._v(e._s(e.Topic.content))]),n("p"),n("hr")]),e._v(" "),n("div",[n("h2",[e._v("回复")]),e._v(" "),n("el-form",{ref:"commentform",attrs:{"label-width":"0px",rules:e.rules,model:e.commentform}},[n("el-form-item",{attrs:{prop:"content"}},[n("el-input",{attrs:{placeholder:"添加评论"},model:{value:e.commentform.content,callback:function(t){e.$set(e.commentform,"content",t)},expression:"commentform.content"}})],1),e._v(" "),n("el-button",{attrs:{type:"primary"},on:{click:function(t){e.addcomment("commentform")}}},[e._v("发送")])],1),e._v(" "),n("hr"),e._v(" "),n("ul",e._l(e.CommentList,function(t){return n("li",{key:t.id},[n("div",[n("div",[e._v(e._s(t.nickname))]),e._v(" "),n("div",[e._v(e._s(t.time))]),e._v(" "),n("div",[e._v(e._s(t.content))])])])}))],1)])},staticRenderFns:[]};var i=n("vSla")(c,s,!1,function(e){n("M+7i")},"data-v-5477571c",null);t.default=i.exports}});
//# sourceMappingURL=3.e3d404ff7cdcff006081.js.map