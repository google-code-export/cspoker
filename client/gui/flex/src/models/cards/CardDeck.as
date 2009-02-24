package models.cards
{
	import mx.containers.Canvas;
	
	import views.CardView;
	
	public class CardDeck extends Object
	{
		public var container:Canvas = null;	
		public var cardView:CardView;
	
		public function CardDeck(passedContainer:Canvas){
			
			trace("calling CardDeck... " + passedContainer);
			container = passedContainer;
			cardView= new CardView();
		
			container.addChild(cardView);
			
			//calculateCardGraphics(suit, rank);
			
		}
		
		public function calculateCardGraphics(cardName:String, width:int, height:int, x:int=0, y:int=0):void{
			//var imgSource:String = "images/cards/" + CardDeck.getCardGraphicName(suit, rank);
			var imgSource:String = "images/cards/"+cardName+".swf";
			
			cardView.width=width;
			cardView.height=height;
			cardView.x = x;
			cardView.y = y;
			cardView.visible = true;
			cardView.displayCard(imgSource, width, height);
		}
		
		public function resetCardForNewGame():void{
			this.cardView.rotation = 0;
			this.cardView.visible = true;
			this.cardView.alpha = 1.0;
			return;
			
		}
		
		public function loadHiddenCard(width:int=50, height:int=75, x:int=0, y:int=0):void{
			cardView.width=width;
			cardView.height=height;
			cardView.x = x;
			cardView.y = y;
			cardView.visible = true;
			cardView.displayCard("images/cards/back.png", width, height);
		}
		
		public static function getCardGraphicName(suit:String, rank:String):String{
			var cardGraphic:String = rank + "-" + suit + ".swf";
			return cardGraphic;
		}
		
		public function clearCard():void{
			cardView.visible = false;
			
			delete this;
		}
		
	}
}