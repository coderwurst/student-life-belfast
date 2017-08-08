package com.uniulster.Project_Android; /**
 * ***
 * Created by IntelliJ IDEA.
 * User: Andrew
 * Date: 29/11/13
 * Time: 12:26
 * UPDATE COMMENT ABOUT PROGRAM HERE
 * ***
 */

import java.util.Arrays;

public class newArrays
{
   public static void main(String[] args)
   {

      String [] region = new String [3];

      region[0]="region 1";
      region[1]="region 2";
      region[2]="region 3";

      String [] type = new String [3];
      type [0] ="to eat";
      type [1] = "to shop";
      type [2] = "to Party";

      String [] [] eat = new String [9] [3];
      eat [0][0] = "The Chip Company";   eat [0][1] = "www.TheChipCompany.co.uk"; eat [0][2] = "£";
      eat [1][0] = "Maggie Mays";        eat [1][1] = "www.Maggiemays.co.uk";     eat [1][2] = "£££" ;
      eat [2][0] = "Viva Italia";        eat [2][1] = "www.VivaItalia.co.uk";     eat [2][2] = "£££££";
      eat [3][0] = "Clements Cafe";      eat [3][1] = "www.clements.co.uk";       eat [3][2] = "£";
      eat [4][0] = "Subway";             eat [4][1] = "www.subway.co.uk";         eat [4][2] = "£££";
      eat [5][0] = "Burger King";        eat [5][1] = "www.burgerking.com";       eat [5][2] = "£££££";
      eat [6][0] = "Boojum";             eat[6][1] = "www.boojum.com";            eat [6][2] = "£";
      eat [7][0] = "Nando's";            eat [7][1] = "www.nandos.com";           eat [7][2] = "£££";
      eat [8][0] = "The Ivory";          eat [8][1] = "www.ivory.com";            eat [8][2] = "££££££";

      String [] [] shop = new String [9] [3];
      shop [0][0] = "The Rusty Zip";      shop [0][1] = "www.TheRustyZip.co.uk";       shop [0][2] = "£";
      shop [1][0] = "Rio Brazil";         shop [1][1] = "www.RioBrazil.co.uk";         shop [1][2] = "£££" ;
      shop [2][0] = "Clothesline";        shop [2][1] = "www.clothesline-online.com";  shop [2][2] = "£££££";
      shop [3][0] = "Next";               shop [3][1] = "www.next.co.uk";              shop [3][2] = "£";
      shop [4][0] = "Burtons";            shop [4][1] = "www.burtons.co.uk";           shop [4][2] = "£££";
      shop [5][0] = "Primark";            shop [5][1] = "www.primark.co.uk";           shop [5][2] = "£££££";
      shop [6][0] = "House of Fraser";    shop [6][1] = "www.houseoffraser.co.uk";     shop [6][2] = "£";
      shop [7][0] = "Urban Outfitters";   shop [7][1] = "www.urbanoutfitters.co.uk";   shop [7][2] = "£££";
      shop [8][0] = "Topshop/Topman";     shop [8][1] = "www.topshop.com";             shop [8][2] = "££££££";

      String [] [] party = new String [9] [3];
      party [0][0] = "The M Club";              party [0][1] = "www.Mclub.co.uk";            party [0][2] = "£";
      party [1][0] = "Queens Student Union";    party [1][1] = "www.qubsu.co.uk";            party [1][2] = "£££" ;
      party [2][0] = "The Eglantine Inn";       party [2][1] = "www.egbar.co.uk";            party [2][2] = "£££££";
      party [3][0] = "The Apartment";           party [3][1] = "www.apartmentbelfast.com";   party [3][2] = "£";
      party [4][0] = "Duke of York";            party [4][1] = "www.dukeofyork.co.uk";       party [4][2] = "£££";
      party [5][0] = "Thompsons";               party [5][1] = "www.clubthompsons.com";      party [5][2] = "£££££";
      party [6][0] = "The Box";                 party [6][1] = "www.boxnightclub.com";       party [6][2] = "£";
      party [7][0] = "Alley Cat";               party [7][1] = "www.alleycatbelfast.com";    party [7][2] = "£££";
      party [8][0] = "Ollie's";                 party [8][1] = "www.olliesbelfast.com";      party [8][2] = "££££££";


   }//main

}//class

/*
String [] region1toEat = {"The Chip Company", "www.TheChipCompany.co.uk", "£", "Maggie Mays", "www.Maggiemays.co.uk", "£££", "Viva Italia", "www.VivaItalia.co.uk", "££££"};
String [] region1toShop = {"The Rusty Zip","www.TheRustyZip.co.uk","£", "Rio Brazil","www.RioBrazil.co.uk","£££", "Clothesline","www.clothesline-online.com","£££££"};
String [] region1toParty = {"The M Club","www.Mclub.co.uk","£", "Queens Student Union","www.qubsu.co.uk","£££", "The Eglantine Inn","www.egbar.co.uk","£££££" } ;
*/