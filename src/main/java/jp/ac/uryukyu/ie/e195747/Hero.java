package jp.ac.uryukyu.ie.e195747;

/**
 * ヒーロークラス。
 *  String name; //名前
 *  int hitPoint; //HP
 *  int attack; //攻撃力
 *  boolean dead; //生死状態。true=死亡。
 */

public class Hero extends LivingThing {
    public int hitPoint;

    public Hero(String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
        this.hitPoint =hitPoint;
    }


    @Override
    //同じメソッド名で定義し直すことを言います
    public void wounded(int damage){
        super.setHitPoint(hitPoint);
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            setDead(true);
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", getName());
        }
    }
}