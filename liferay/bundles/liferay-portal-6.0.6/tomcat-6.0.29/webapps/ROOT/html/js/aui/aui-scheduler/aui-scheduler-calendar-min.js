AUI.add("aui-scheduler-calendar",function(d){var i=d.Lang,j=i.isArray,c=i.isBoolean,b=i.isString,g=function(m){return(m instanceof d.SchedulerEvent);},e="scheduler-calendar",a="color",l="events",h="pallete",k="visible";var f=d.Component.create({NAME:e,ATTRS:{color:{valueFn:function(){var n=this;var o=n.get(h);var m=Math.ceil(Math.random()*o.length)-1;return o[m];},validator:b},name:{value:"(no name)",validator:b},pallete:{value:["#d96666","#e67399","#b373b3","#8c66d9","#668cb3","#668cd9","#59bfb3","#65ad89","#4cb052","#8cbf40","#bfbf4d","#e0c240","#f2a640","#e6804d","#be9494","#a992a9","#8997a5","#94a2be","#85aaa5","#a7a77d","#c4a883","#c7561e","#b5515d","#c244ab","#603f99","#536ca6","#3640ad","#3c995b","#5ca632","#7ec225","#a7b828","#cf9911","#d47f1e","#b56414","#914d14","#ab2671","#9643a5","#4585a3","#737373","#41a587","#d1bc36","#ad2d2d"],validator:j},visible:{value:true,validator:c}},EXTENDS:d.Base,AUGMENTS:d.SchedulerEventSupport,prototype:{initializer:function(){var m=this;m.after("eventsChange",m._afterEventsChange);m.on("visibleChange",m._onVisibleChange);m._uiSetVisible(m.get(k));m._uiSetEvents(m.get(l));},syncEventsColor:function(n){var m=this;d.Array.each(n||m.get(l),function(o,p){o.set(a,m.get(a));});},_afterEventsChange:function(n){var m=this;m._uiSetEvents(n.newVal);},_onVisibleChange:function(n){var m=this;m._uiSetVisible(n.newVal);},_uiSetEvents:function(n){var m=this;m.syncEventsColor(n);},_uiSetVisible:function(n){var m=this;m.eachEvent(function(o,p){o.set(k,n);});}}});d.SchedulerCalendar=f;},"1.0.1",{requires:["aui-scheduler-event"],skinnable:true});