webpackJsonp([0],{"3cXf":function(t,e,i){t.exports={default:i("RJ+u"),__esModule:!0}},"5ECI":function(t,e,i){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=i("3cXf"),o=i.n(n),c=i("xB4m"),s={data:function(){return{TopicList:[]}},methods:{gotoTopic:function(t){sessionStorage.setItem("topic",o()(t)),console.log("11111111111"),this.$router.push({path:"/Home/community/topic"})}},mounted:function(){var t=this;this.$axios.get("user/community").then(function(e){200===e.data.code?e.data.obj.forEach(function(e){t.TopicList.push({title:e.title,content:e.content,createtime:e.createtime,nickname:e.nickname,leasttime:e.leasttime,topic_id:e.topic_id})}):console.log(e.data.code)}).catch(function(t){console.log(t),Object(c.Message)({message:"请检查网络并重试",type:"error",center:!0})})}},a={render:function(){var t=this,e=t.$createElement,i=t._self._c||e;return i("div",[i("ul",t._l(t.TopicList,function(e){return i("li",{key:e.topic_id},[i("div",{on:{click:function(i){t.gotoTopic(e)}}},[i("div",[t._v(t._s(e.title))]),t._v(" "),i("div",[t._v(t._s(e.nickname))]),t._v(" "),i("div",[t._v(t._s(e.leasttime))])])])}))])},staticRenderFns:[]};var r=i("vSla")(s,a,!1,function(t){i("KWqo")},"data-v-77260027",null);e.default=r.exports},KWqo:function(t,e){},"RJ+u":function(t,e,i){var n=i("AKd3"),o=n.JSON||(n.JSON={stringify:JSON.stringify});t.exports=function(t){return o.stringify.apply(o,arguments)}}});
//# sourceMappingURL=0.2d7800a306753efee544.js.map