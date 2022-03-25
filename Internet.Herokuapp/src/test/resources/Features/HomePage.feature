Feature: Page Accueil 
Tests pour 'http://the-internet.herokuapp.com/' page accueil

Background: Ouvrir la page accueil 
Given jai navigue 'the-internet' page "accueil"

Scenario: verifier que le contenu de la page d'accueil est correct
Then le titre de la page est "Welcome to the-internet"
And le texte de sous-en-tete est "Available Examples"
And une liste des sous-pages suivantes est affichee

 | A/B Testing                   |
 | Add/Remove Elements           |
 | Basic Auth                    |
 | Broken Images                 |
 | Challenging DOM               |
 | Checkboxes                    |
 | Context Menu                  |
 | Digest Authentication         |
 | Disappearing Elements         |
 | Drag and Drop                 |
 | Dropdown                      |
 | Dynamic Content               |
 | Dynamic Controls              |
 | Dynamic Loading               |
 | Entry Ad                      |
 | Exit Intent                   |
 | File Download                 |
 | File Upload                   |
 | Floating Menu                 |
 | Forgot Password               |
 | Form Authentication           |
 | Frames                        |
 | Geolocation                   |
 | Horizontal Slider             |
 | Hovers                        |
 | Infinite Scroll               |
 | Inputs                        |
 | JQuery UI Menus               |
 | JavaScript Alerts             |
 | JavaScript onload event error |
 | Key Presses                   |
 | Large & Deep DOM              |
 | Multiple Windows              |
 | Nested Frames                 |
 | Notification Messages         |
 | Redirect Link                 |
 | Secure File Download          |
 | Shadow DOM                    |
 | Shifting Content              |
 | Slow Resources                |
 | Sortable Data Tables          |
 | Status Codes                  |
 | Typos                         |
 | WYSIWYG Editor                |


And 
And
And

