
var global = {		  //声明唯一全局变量
	doctor: {},       //avalon声明医生对象
	patient: {},	  //Avalon声明患者对象
	theCase: {},	  //avalon声明病例对象
	navigation: {},   //avalon声明导航对象
	user: {
		username: localStorage.getItem("username"),
		password: localStorage.getItem("password")
	}
};

global.navigation = avalon.define({
	$id: "navigation",
	login: {
		userName: global.user.username
	},
	info: {},
	searchContent: "",
	theChoice: "病例ID(室速)",
	choiceOption: [ "病例ID(室速)", "病例ID(房速)", "病例ID(房颤)", "病例号", "医生 ID", "医生手机号", "病人姓名", "病人身份证号" ],
	search: false,
	nav: [
		{
			id: "case",
			name: "病例查找" ,
			choice: "病例ID(室速)",
			choiceOption: [ "病例ID(室速)", "病例ID(房速)", "病例ID(房颤)", "病例号" ],
			self: true,
			check: false,
			case1: false,
			case2: false,
			case3: false
		},
		{
			id: "doctor",
			name: "医生查找" ,
			choice: "医生 ID",
			choiceOption: [ "医生 ID", "手机号" ],
			self: false,
			check: false
		},
		{
			id: "patient",
			name: "病人查找",
			choice: "病人姓名",
			choiceOption: [ "病人姓名", "身份证号" ],
			self: false,
			check: false
		}
	],
	deal: function(){
		var nav = global.navigation.nav;
		for( var i = 0; i < nav.length; i++ ){
			nav[i].self = false;
			if( this.id == nav[i].id ){
				nav[i].self = true;
			}
		}
	},
	hidden: function(id){
		var nav = global.navigation.nav;
		for( var i = 0; i < nav.length; i++ ){
			if( id == nav[i].id ){
				nav[i].search = true;
			}
		}
	},
	toggle: function(){
		global.navigation.search ? global.navigation.search = false : global.navigation.search = true;
	},
	choice: function(){
		var	choice = document.getElementById("choice"),
			str = this.innerHTML;

		avalon.innerHTML(choice, str);
		global.navigation.theChoice = str;
		global.navigation.search = false;
	}
});

avalon.ready(function(){
	global.doctor = avalon.define({
		$id: "doctor",
		info: {},
		caseInfo: {}
	});

	global.patient = avalon.define({
		$id: "patient",
		info: {},
		medicalHistories: {}
	});

	global.case1 = avalon.define({
		$id: "case1",
		info: {},
		followUps: [],
		num: 0,
		imagingInsideHeart: [],
		inducedWay: [],
		ablationLines: [],
		otherablationLines: "other",
		prevablationLines: "other",
		ablationJudgement: [],
		ablationEndPoint: [],
		otherablationEndPoint: "other",
		prevablationEndPoint: "other",
		complication: [],
		othercomplication: "other",
		prevcomplication: "other",
		ablationProcedure: ["局灶消融", "线性消融", "碎裂电位消融", "舒张期电位消融", "P电位消融"],
		ablationProcedureSelect: false,
		ablationEnergy: ["射频消融","冷冻"],
		ablationEnergySelect: false
	});
	global.case2 = avalon.define({
		$id: "case2",
		info: {},
		followUps: [],
		num: 0,
		imagingInsideHeart: [],
		inducedWay: [],
		ablationLines: [],
		otherablationLines: "other",
		prevablationLines: "other",
		ablationJudgement: [],
		ablationEndPoint: [],
		otherablationEndPoint: "other",
		prevablationEndPoint: "other",
		complication: [],
		othercomplication: "other",
		prevcomplication: "other",
		ablationProcedure: ["局灶消融", "线性消融", "碎裂电位消融", "舒张期电位消融", "P电位消融"],
		ablationProcedureSelect: false,
		ablationEnergy: ["射频消融","冷冻"],
		ablationEnergySelect: false
	});
	global.case3 = avalon.define({
		$id: "case3",
		info: {},
		followUps: [],
		num: 0,
		imagingInsideHeart: [],
		inducedWay: [],
		ablationLines: [],
		otherablationLines: "other",
		prevablationLines: "other",
		ablationJudgement: [],
		ablationEndPoint: [],
		otherablationEndPoint: "other",
		prevablationEndPoint: "other",
		complication: [],
		othercomplication: "other",
		prevcomplication: "other",
		lungVein: [],
		otherlungVein: "other",
		prevlungVein: "other",
		ablationProcedure: ["局灶消融", "线性消融", "碎裂电位消融", "舒张期电位消融", "P电位消融"],
		ablationProcedureSelect: false,
		ablationEnergy: ["射频消融","冷冻"],
		ablationEnergySelect: false
	});
});

function query(choice, val){
	var urlVal = "",
		which = "",
		query = "case1s",
		index = 0,
		nav = global.navigation.nav;

	if( global.navigation.searchContent == ""){
		alert("请输入要查询的内容！");
		return false;
	}

	switch(choice){
		case "病例ID(室速)":
			urlVal = "id";
			which = "case1";
			query = "case1s";
			break;
		case "病例ID(房速)":
			urlVal = "id";
			which = "case2";
			query = "case2s";
			break;
		case "病例ID(房颤)":
			urlVal = "id";
			which = "case3";
			query = "case3s";
			break;
		case "病例号":
			urlVal = "caseNumber";
			query = "cases";
			break;
		case "医生 ID":
			urlVal = "doctorId";
			which = "doctor";
			index = 1;
			break;
		case "医生手机号":
			urlVal = "doctorPhoneNumber";
			which = "doctor";
			index = 1;
			break;
		case "病人姓名":
			urlVal = "patientName";
			which = "patient";
			index = 2;
			break;
		case "病人身份证号":
			urlVal = "patientIdCard";
			which = "patient";
			index = 2;
			break;
		default:
			break;
	}



	//if(query == "case2s"){
	//	nav[0].case2 = true;
	//	nav[0].case1 = nav[0].case3 = false;
	//}else if(query == "case3s"){
	//	nav[0].case3 = true;
	//	nav[0].case1 = nav[0].case2 = false;
	//}else{
	//	nav[0].case1 = true;
	//	nav[0].case2 = nav[0].case3 = false;
	//}


	for( var i = 0; i < nav.length; i++){
		nav[i].self = false;
	}
	nav[index].self = true;
	nav[index].check = true;

	if(which == "doctor"){
		$.ajax({
			url: "/yl/api/doctors?" + urlVal + "=" + val,
			type: "GET",
			success: function(data){
				global.doctor.info = data.body;
				avalon.scan();
			}
		});
	}

	$.ajax({
		url: "/yl/api/admin/" + query + "?" + urlVal + "=" + val,
		type: "GET",
		headers: {Authentication: global.user.username + "%" + global.user.password},
		success: function(data){
			if(query == "cases"){
				switch (data.body[0].name){
					case "室速":
						which = "case1";
						query = "case1s";
						break;
					case "房速":
						which = "case2";
						query = "case2s";
						break;
					case "房颤":
						which = "case3";
						query = "case3s";
						break;
					default :
						which = "case1";
						query = "case1s";
						break;
				}
			}
			if(query == "case2s"){
				nav[0].case2 = true;
				nav[0].case1 = nav[0].case3 = false;
			}else if(query == "case3s"){
				nav[0].case3 = true;
				nav[0].case1 = nav[0].case2 = false;
			}else{
				nav[0].case1 = true;
				nav[0].case2 = nav[0].case3 = false;
			}

			if(which == "doctor") {
				global[which].caseInfo = data.body;
			}else{
				global[which].info = data.body;
			}
			if(which != "doctor" && which != "patient"){
				global[which].followUps = data.body[0].followUps;
				select(which, 'ablationProcedure');
				select(which, 'ablationEnergy');
			}
			if(which == "patient"){
				global[which].medicalHistories = data.body[0].patient.medicalHistories;
			}
			avalon.scan();
		}
	});
}

function matching(id){
	var index = 0;
	switch (id){
		case "patient":
			index = 2;break;
		case "doctor":
			index = 1;break;
		default: 
			index = 0;break;
	}
	return index;
}

function deleteStorage(){
	localStorage.removeItem("username");
	localStorage.removeItem("password");
	window.location.href = "login.html";
}

function toggleShow(selector){
	var	selector = "." + selector,
		$checkGroup = $(selector);
	
	$checkGroup.toggleClass("hidden");
}

function save(selector, name, which){
	var	content = "",
		str = "input[name=" + name + "]:checked",
		$checked = $(str);
	
	content = selector.$model;
	for(var i = 0; i < $checked.length; i++){
		if($checked[i].value == "other"){
			for(var j = 0; j < content.length; j++){
				var otherName = "other" + name,
					prevName = "prev" + name,
					otherContent = "";

				otherContent = global[which][otherName];
				prevContent = global[which][prevName];
				if(content[j] == prevContent){
					content.splice(j,1,otherContent);
					global[which].info[0][name] = content.toString();
					global[which][prevName] = global[which][otherName];
					return false;
				}
			}
		}
	}
	global[which].info[0][name] = content.toString();
}

function submit(which){
	event.preventDefault();
	var content = global[which].info[0].$model;
	
	$.ajax({
		url: "/yl/api/" + which,
		type: "PATCH",
		contentType: "application/json",
		data: JSON.stringify(content),
		success: function(data){
			if(data.status == 0){
				alert("提交成功！");
			}
			else{
				alert("提交失败！");
			}
		}
	});


}

function submit2(which, index){
	event.preventDefault();
	var followUps = global[which].followUps.$model[index];

	$.ajax({
		url: "/yl/api/followup",
		type: "PATCH",
		contentType: "application/json",
		data: JSON.stringify(followUps),
		success: function(data){
			if(data.status == 0){
				alert("随访修改成功！");
			}else{
				alert("随访修改失败！");
			}
		}
	});
}

function select(which, val){
	var select = val + "Select";
	for(var i = 0; i < global[which][val].length; i++){
		if(global[which].info[0][val] == global[which][val][i]){
			global[which][select] = false;
			return false;
		}
	}
	global[which][select] = true;
}

function numshow(which, index){
	global[which].num = index;
}


$(function(){	
	$("#choice").click(function(){
		$(".dropdownContent").toggle();
	});
	$("body").click(function(e){
		if(e.target.id.indexOf("choice") == -1){
			$(".dropdownContent").hide();
		}
	});
});