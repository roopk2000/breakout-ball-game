package game;
import java.awt.Image;
import java.awt.Rectangle;// to setup all images in the game for the classes brick ball and paddle

public class Sprite 
{
int x;
int y;
int imageWidth;
int imageHeight;
Image image;
//getter and setter methods for all variables
protected void setX(int x)
{
	this.x=x;
}
int getX()
{
	return x;
}
protected void setY(int y)
{
	this.y=y;
}
int getY()
{
	return y;
}
int getImageWidth()
{
	return imageWidth;
}
int getImageHeight()
{
	return imageHeight;
}
Image getImage()
{
	return image;
}
Rectangle getRect()
{
	return new Rectangle(x,y,image.getWidth(null), image.getHeight(null));
}
void getImageDimensions()
{
	imageWidth = image.getWidth(null);
	imageHeight = image.getHeight(null);
}





}
