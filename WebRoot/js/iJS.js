
var subCategoryArray=[[new Option("skirt","skirt"),
              new Option("T","T"),
              new Option("shoes","shoes"),
              new Option("dress","dress"),
              new Option("underwear","underwear"),
              new Option("pajamas","pajamas"),
              new Option("socks","socks")],
             [ new Option("facial","facial"),
              new Option("body","body"),
              new Option("pimple","pimple"),
              new Option("eyes","eyes")],
             [ new Option("books","books"),
              new Option("apps","apps"),
              new Option("officeUse","officeUse"),
              new Option("digital","digital")],
              [new Option("seasonUse","seasonUse"),
              new Option("food","food"),
              new Option("transport","transport"),
              new Option("houseCost","houseCost"),
              new Option("bodyHealth","bodyHealth")],
            [ new Option("fancy","fancy"),
              new Option("relax","relax")]];
	
	function change(){
		var category=document.getElementById("category");
		var index=category.selectedIndex;
		var optionArray=subCategoryArray[index];
		var subCategory=document.getElementById("subCategory");
		subCategory.options.length=0;
		for(var i=0;i<=optionArray.length;i++){
			subCategory.options[subCategory.options.length]=optionArray[i];		
		}
	}
