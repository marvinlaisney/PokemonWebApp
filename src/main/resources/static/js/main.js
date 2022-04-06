/**
 * 
 */

let text = [
	{ "type": "Normal", "color": "#A8A77A" },
	{ "type": "Feu", "color": "#EE8130" },
	{ "type": "Eau", "color": "#6390F0" },
	{ "type": "Electrik", "color": "#F7D02C" },
	{ "type": "Plante", "color": "#7AC74C" },
	{ "type": "Glace", "color": "#96D9D6" },
	{ "type": "Combat", "color": "#C22E28" },
	{ "type": "Poison", "color": "#A33EA1" },
	{ "type": "Sol", "color": "#E2BF65" },
	{ "type": "Vol", "color": "#A98FF3" },
	{ "type": "Psy", "color": "#F95587" },
	{ "type": "Insecte", "color": "#A6B91A" },
	{ "type": "Roche", "color": "#B6A136" },
	{ "type": "Spectre", "color": "#735797" },
	{ "type": "Dragon", "color": "#6F35FC" },
	{ "type": "Ténèbres", "color": "#705746" },
	{ "type": "Acier", "color": "#B7B7CE" },
	{ "type": "Fée", "color": "D685AD" }];


window.onload = function() {
	document.querySelectorAll('.listTypes').forEach(function(element) {
		if (element.childElementCount === 1) {
			element.className += " " + "onlyOne";
		}

		//console.log(element);
		var children = Array.prototype.slice.call(element.children);
		//console.log(children);
		children.forEach(function(childElements) {
			console.log(childElements.firstElementChild.textContent);
			//const exists = text.find(t => t.type === childElements.firstElementChild.textContent);
			const element = text.find(element => {
				if (element.type === childElements.firstElementChild.textContent) {
					return element;
				}
			});
			childElements.style.backgroundColor = element.color;
		});
	});
}

