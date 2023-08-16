# Triovision
Alors, vous avez deux branches : une pour le jeu en mode console qui fonctionne, mais qui nécessite quelques améliorations qui sont listées dans les commits et les messages TODO.

La version JavaFX ressemble à ceci :

![image](https://github.com/Bizbloody/Triovision/assets/82967833/ea47fd39-4e2d-44aa-af92-5f8045b82c84)

Comme vous pouvez le constater, il y a encore du travail à faire. Lorsque vous faites glisser un pion, il devient fantôme (opacité 0.5), mais il ne suit pas la souris. À la base, puisque ma version en mode console fonctionne, je voulais associer un chiffre à chaque pion de la grille et lier cette grille à mon plateau. Ainsi, lorsque je déplace un pion via ma fonction, le pion aurait dû également se déplacer, mais je n'ai pas eu le temps de le faire. De plus, cela a été un échec monumental avec des problèmes bizarres, comme le montre cette image : 
![image](https://github.com/Bizbloody/Triovision/assets/82967833/09deaf43-26bd-49a1-a576-2e624bfc0e06)
il y a écrit: 
Java Message : java.lang.reflect.InvocationTargetException
