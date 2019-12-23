package jp.ac.uryukyu.ie.e195747;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void wounded() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        enemy.setDead(true);//enemyが死亡時に
        for(int i=0; i<10; i++) {
            enemy.attack(hero);//乱数で0ダメージとなることもあるため、複数回実行してみる。
        }
        assertEquals(heroHP, hero.hitPoint);
    }
    }