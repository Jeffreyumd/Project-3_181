package com.brackeen.javagamebook.tilegame.sprites;
import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;

public class Wall extends Creature
{
	public Wall(Animation left, Animation right, Animation deadLeft, Animation deadRight) 
	{
		//Call Creature constructor
		super(left, right, deadLeft, deadRight);
		//Code Tracing
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled())
    	{
        	if(CodeReflection.getAbstactionLevel()>=1)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),e.getStackTrace()[0].getMethodName());
        	}
    	}
		//Define as a helper 
		helper = true;
		//Set as flying
		flying = true;
	}
	
    public float getMaxSpeed()
    {
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled())
    	{
        	if(CodeReflection.getAbstactionLevel()>=2)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(), e.getStackTrace()[0].getMethodName());
        	}
    	}
        return 0.2f;
    }
}