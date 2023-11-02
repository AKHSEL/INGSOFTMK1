package Principal;
import Vista.*;
import Controlador.*;

public class Main 
    {
        //Controlador Login
        public static LoginMK1 f1;
        public static Controlador_Login controlf1;
        
        public static Registro_Cliente f2;
        public static Controlador_Cliente controlf2;
        
        //Controlador Menu
        public static Menu_Main fmenu;
        public static Controlador_Menu controlfmenu;

        public static void main(String[] args) 
            {
                    fmenu=new Menu_Main();
                    controlfmenu= new Controlador_Menu(fmenu);
            }

    
    }

    
