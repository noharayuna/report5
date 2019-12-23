package jp.ac.uryukyu.ie.e195747;

/**
 * HeroクラスとEnemyクラスの親クラス。
 *  String name; //名前
 *  int hitPoint; //HP
 *  int attack; //攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 */

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}

    public int getHitPoint(){ return hitPoint; }
    public void setHitPoint(int hitPoint){ this.hitPoint = hitPoint; }

    public int getAttack(){return attack;}
    public void setAttack(int attack){this.attack = attack;}

    public boolean getDead(){return dead;}
    public void setDead(boolean dead){this.dead = dead;}


    public LivingThing(String name,int hitPoint,int attack){
        this.name =name;
        this.hitPoint=hitPoint;
        this.attack=attack;
        dead = false;
    }
    public boolean isDead() {return dead;}
    //public String getName(){return name;}


    public void attack(LivingThing opponent){
        int damage = (int)(Math.random() * attack);
        if(!dead){
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
    hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}

