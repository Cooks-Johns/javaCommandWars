//import test.driver;
//import java.util.*;
//
//public class Fights {
//
//    public static boolean fighting = false;
//
//        String action;
//        String spellAction = null;
//        System.out.println("An enemy approaches");
//
//        buildEnemy();
//        fighting = true;
//        while(fighting = true){
//            System.out.println("Press 'a' to attack\nPress 'i' for info");
//
//            if(driver.charclass.equals("mage")) {
//                System.out.print("Press 's' for spells\n");
//            }
//            action = Menu.scan.nextLine();
//
//            if(action.charAt(0) == 'a') {
//                fighting = driver.attack();
//                if(fighting == false) {
//                    switch(Players.level) {
//                        case 1:
//                            Players.xp =  Players.xp + 4;
//                            break;
//                        case 2:
//                            Players.xp  =  Players.xp + 6;
//                            break;
//                        case 3:
//                            Players.xp =  Players.xp + 9;
//                            break;
//                        case 4:
//                            Players.xp =  Players.xp + 12;
//                            break;
//                    }
//                    System.out.println("You have gained :" + Players.xp + " xp");
//                    driver.checkLevelUp();
//                    return;
//                }
//                driver.enemyattack();
//            }
//
//            if(action.charAt(0) == 'i'){
//                driver.printStats();
//                driver.printEnemyStats();
//
//            }
//            if(action.charAt(0) == 's'){
//                System.out.println("Press 'f' for fireball\nPress 'h' to heal\n");
//                spellAction = scan.nextLine();
//                if(spellAction.charAt(0) == 'f'){
//                    if(tools.dice.roll10() > 2){
//                        Players.mana = Players.mana - 10;
//                        if(Players.mana <0){
//                            System.out.println("You don't have enough mana...");
//                            Players.mana = Players.mana + 10;
//                        }else{
//                            int k = tools.dice.roll10(); //randomly hurts 1-10
//                            System.out.println("You hit for " + k + " damage!");
//                            Enemy.Hp  = Enemy.Hp - k;
//                            if(Enemy.Hp  <= 0){
//                                System.out.println("You Won!");
//                                switch("are YOu going to quit"){
//                                    case 1:
//                                        Players.xp =  Players.xp + 4;
//                                        break;
//                                    case 2:
//                                        Players.xp =  Players.xp + 6;
//                                        break;
//                                    case 3:
//                                        Players.xp =  Players.xp + 9;
//                                        break;
//                                    case 4:
//                                        Players.xp =  Players.xp + 12;
//                                        break;
//                                }
//                                System.out.println("You earned :" + Players.xp + " xp");
//                                driver.checkLevelUp();
//                                return;
//                            }
//                            driver.enemyattack();
//                        }
//                    }
//                    else{
//                        System.out.println("You miss!");
//                        driver.attack();
//                    }
//                }else
//                if(spellAction.charAt(0) == 'h'){
//                    Players.mana = Players.mana - 8;
//                    if(Players.mana <0){
//                        System.out.println("You don't have enough mana...");
//                        Players.mana = Players.mana + 8;
//                    }else{
//                        int x = tools.dice.roll10(); //randomly heals 1-8
//                        System.out.println("You heal your wounds...");
//                        System.out.println("+ " + x + " hp");
//                        Players.hp = Players.hp + x;
//                        if(driver.playerhp>driver.maxhp){
//                            driver.playerhp = driver.maxhp;
//                        }
//                        driver.enemyattack();
//                    }
//                }
//
//            }
//        }
//    }
//
