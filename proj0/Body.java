public class Body{
    double xxPos;
    double yyPos;
    double xxVel;
    double yyVel;
    double mass;
    String imgFileName;
    //* Initialize the Body*/
    public Body(double xP,double yP,double xV,double yV,double m,String img){
        xxPos=xP;
        yyPos=yP;
        xxVel=xV;
        yyVel=yV;
        mass=m;
        imgFileName=img;
    }
    //*copy from a existed Body*/
    public Body(Body b){
        xxPos=b.xxPos;
        yyPos=b.yyPos;
        xxVel=b.xxVel;
        yyVel=b.yyVel;
        mass=b.mass;
        imgFileName=b.imgFileName;
    }
    public double calcDistance(Body b){
        double x=(this.xxPos-b.xxPos)*(this.xxPos-b.xxPos);
        double y=(this.yyPos-b.yyPos)*(this.yyPos-b.yyPos);
        return x*x+y*y;
    }
    public double calcForceExertedBy(Body b){
        double dis=this.calcDistance(b);
        return ((6.67e-11)* this.mass*b.mass)/dis;
    }
    public double calcForceExertedByX(Body b){
        double dis=(this.xxPos-b.xxPos)*(this.xxPos-b.xxPos);
        if((this.xxPos-b.xxPos)<0){
            return ((6.67e-11)*this.mass*b.mass)/dis;
        }else{
            return -((6.67e-11)*this.mass*b.mass)/dis;
        }
    }
    public double calcForceExertedByY(Body b){
        double dis=(this.yyPos-b.yyPos)*(this.yyPos-b.yyPos);
        if((this.yyPos-b.yyPos)<0){
            return ((6.67e-11)*this.mass*b.mass)/dis;
        }else{
            return -((6.67e-11)*this.mass*b.mass)/dis;
        }
    }
    public double calcNetForceExertedByX(Body[] args) {
        double force = 0;
        for (Body arg : args) {
            if (this.equals(arg)) {
                continue;
            } else {
                force += this.calcForceExertedByX(arg);
            }
        }
        return force;
    }
    public double calcNEtForceExertByY(Body[] args){
        double force=0;
        for(Body arg : args){
            if(this.equals(arg)){
                continue;
            }else{
                force += this.calcForceExertedByY(arg);
            }
        }
        return force;
    }
    public void update(double dt,double fX,double fY){
        double aX=fX/this.mass;
        double aY=fY/this.mass;
        this.xxVel+=dt*aX;
        this.yyVel+=dt*aY;
        this.xxPos+=this.xxVel*dt;
        this.yyPos+=this.yyVel*dt;
    }
}