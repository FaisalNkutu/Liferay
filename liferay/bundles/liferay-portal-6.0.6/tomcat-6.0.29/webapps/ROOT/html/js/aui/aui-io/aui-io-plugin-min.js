AUI.add("aui-io-plugin",function(v){var k=v.Lang,d=k.isBoolean,c=k.isString,y=function(A){return(A instanceof v.Node);},w=v.WidgetStdMod,p="Node",j="Widget",E="",m="failure",l="failureMessage",z="host",g="icon",f="io",n="IOPlugin",x="loading",o="loadingMask",D="node",u="outer",C="parseContent",i="queue",b="rendered",e="section",s="showLoading",t="success",q="type",a="where",B=v.ClassNameManager.getClassName,h=B(g,x);var r=v.Component.create({NAME:n,NS:f,ATTRS:{node:{value:null,getter:function(H){var A=this;if(!H){var G=A.get(z);var F=A.get(q);if(F==p){H=G;}else{if(F==j){var I=A.get(e);if(!G.getStdModNode(I)){G.setStdModContent(I,E);}H=G.getStdModNode(I);}}}return v.one(H);},validator:y},failureMessage:{value:"Failed to retrieve content",validator:c},loadingMask:{value:{}},parseContent:{value:true,validator:d},showLoading:{value:true,validator:d},section:{value:w.BODY,validator:function(A){return(!A||A==w.BODY||A==w.HEADER||A==w.FOOTER);}},type:{readOnly:true,valueFn:function(){var A=this;var F=p;if(A.get(z) instanceof v.Widget){F=j;}return F;},validator:c},where:{value:w.REPLACE,validator:function(A){return(!A||A==w.AFTER||A==w.BEFORE||A==w.REPLACE||A==u);}}},EXTENDS:v.IORequest,prototype:{bindUI:function(){var A=this;A.on("activeChange",A._onActiveChange);A.on(t,A._successHandler);A.on(m,A._failureHandler);if((A.get(q)==j)&&A.get(s)){var F=A.get(z);F.after("heightChange",A._syncLoadingMaskUI,A);F.after("widthChange",A._syncLoadingMaskUI,A);}},_autoStart:function(){var A=this;A.bindUI();r.superclass._autoStart.apply(this,arguments);},_bindParseContent:function(){var A=this;var F=A.get(D);if(F&&!F.ParseContent&&A.get(C)){F.plug(v.Plugin.ParseContent);}},hideLoading:function(){var A=this;var F=A.get(D);if(F.loadingmask){F.loadingmask.hide();}},setContent:function(F){var A=this;A._bindParseContent();A._getContentSetterByType().apply(A,[F]);if(A.overlayMaskBoundingBox){A.overlayMaskBoundingBox.remove();}},showLoading:function(){var A=this;var F=A.get(D);if(F.loadingmask){if(A.overlayMaskBoundingBox){F.append(A.overlayMaskBoundingBox);}}else{F.plug(v.LoadingMask,A.get(o));A.overlayMaskBoundingBox=F.loadingmask.overlayMask.get("boundingBox");}F.loadingmask.show();},start:function(){var A=this;var F=A.get(z);if(!F.get(b)){F.after("render",function(){A._setLoadingUI(true);});}r.superclass.start.apply(A,arguments);},_getContentSetterByType:function(){var A=this;var F={Node:function(J){var G=this;var I=G.get(D);if(J instanceof v.NodeList){J=J.toFrag();}if(J instanceof v.Node){J=J._node;}var H=G.get(a);if(H==u){I.replace(J);}else{I.insert(J,H);}},Widget:function(I){var G=this;var H=G.get(z);H.setStdModContent.apply(H,[G.get(e),I,G.get(a)]);}};return F[this.get(q)];},_setLoadingUI:function(F){var A=this;if(A.get(s)){if(F){A.showLoading();}else{A.hideLoading();}}},_syncLoadingMaskUI:function(){var A=this;A.get(D).loadingmask.refreshMask();},_successHandler:function(F,H,G){var A=this;A.setContent(this.get("responseData"));},_failureHandler:function(F,H,G){var A=this;A.setContent(A.get(l));},_onActiveChange:function(H){var F=this;var G=F.get(z);var A=F.get(q)==j;if(!A||(A&&G&&G.get(b))){F._setLoadingUI(H.newVal);}}}});v.Node.prototype.load=function(J,I,K){var F=this;var H=J.indexOf(" ");var A;if(H>0){A=J.slice(H,J.length);J=J.slice(0,H);}if(k.isFunction(I)){K=I;I=null;}I=I||{};if(K){I.after=I.after||{};I.after.success=K;}var G=I.where;I.uri=J;I.where=G;if(A){I.selector=A;I.where=G||"replace";}F.plug(v.Plugin.IO,I);return F;};v.namespace("Plugin").IO=r;},"1.0.1",{requires:["aui-overlay-base","aui-parse-content","aui-io-request","aui-loading-mask"]});