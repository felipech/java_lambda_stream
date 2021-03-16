package varios;

import java.util.ArrayList;
import java.util.List;

public class ContainerMostWater {

    public static class Point{
        int x;
        int y;

        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }



    public static void main(String[] args) {

        List<Point> pointList = new ArrayList<>();
        //{ 1,8,6,2,5,4,8,3,7}
        int [] ejeY = new int[]{1,8,6,2,5,4,8,3,7};
        int px = 1;
        for(Integer py : ejeY){
            Point point = new Point(px,py);
            pointList.add(point);
            px++;
        }
        int areaFinal = 0;
        int areaTemporal;
        for (Point p : pointList){
            //System.out.println("X " + p.getX() +" y "+ p.getY());
            areaTemporal = calcularDistancia(p, pointList);
            if(areaTemporal > areaFinal) areaFinal = areaTemporal;

        }
        System.out.println("Area Final " + areaFinal);

        System.out.println("Area 2 " + calcularDistancia2(ejeY));
    }

     static int calcularDistancia(Point point, List<Point> listPoint){

        int x = point.getX();
        int y = point.getY();
        int distancia;
        int altura;
        int area;
        int areaFinal = 0;

        if(listPoint.size() == 1){
            //System.out.println("0");
            return 0;
        }

        //System.out.println("Punto original x " + x + " punto original y " + y);
        for(int yy = 0; yy < listPoint.size(); yy++){

           // System.out.println(" x --> " + listPoint.get(yy).getX()+ " y ----> " + (listPoint.get(yy).getY() - y));
            distancia = (listPoint.get(yy).getX() - x);

            if(distancia < 0) distancia = distancia * -1;
            altura = Math.min(listPoint.get(yy).getY(), y);

            area = distancia * altura;
            if(area > areaFinal ){
                areaFinal = area;
            }

        }
         //System.out.println("Area Final = " + areaFinal);
        return areaFinal;

    }

    /*
    *
    * int i = 0;
		int j = height.length-1;
		int maxoArea = 0, area = 0;
		while (i<j) {
			int val=0;
			if(height[i]<height[j]) {
				area= height[i]*(j-i);
				i++;
			}else {
				area= height[j]*(j-i);
				j--;
			}
		if(maxoArea<area)
		maxoArea=area;
		}
		return maxoArea;
    *
    * */

    static int calcularDistancia2(int [] ejeY){
        int distancia;
        int altura = 0;
        int area;
        int areaFinal = 0;
        //punto actual
        int xx = 0;
        for(int x = 0; x < ejeY.length; x++){
            int yy = ejeY[x];
            System.out.println("punto x " + xx + " punto y " + yy);
            for(int i = 0; i < ejeY.length; i++){
                if(i == ejeY.length - 1){
                    xx = 1;
                }else {
                    xx = i + 1;
                }
                distancia = i+1 - xx;
                if(distancia != 0) {
                    if(distancia < 0) distancia = distancia * -1;
                    System.out.println("Dis " + distancia);
                    altura = Math.min(ejeY[i], yy);
                    area = distancia * altura;
                    if(area > areaFinal ){
                        areaFinal = area;
                    }
                }

            }
        }
        System.out.println(areaFinal);

        return areaFinal;

    }
}
