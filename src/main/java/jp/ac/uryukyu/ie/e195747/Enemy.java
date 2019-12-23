package jp.ac.uryukyu.ie.e195747;

/**
 * 敵クラス。
 *  String name; //名前
 *  int hitPoint; //HP
 *  int attack; //攻撃力
 *  boolean dead; //生死状態。true=死亡。
 */



public class Enemy extends LivingThing {
    private int hitPoint;
    public Enemy(String name,int hitPoint,int attack){
        super(name,hitPoint,attack);
        this.hitPoint = hitPoint;

    }



    @Override
    //同じメソッド名で定義し直すことを言います
    public void wounded(int damage){
        super.setHitPoint(hitPoint);
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            setDead(true);//deadはプーリアん
            System.out.printf("モンスター%sは倒れた。\n", getName());
        }
    }

}