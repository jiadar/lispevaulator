/************************************************************************************
 * 
 * Do not modify this file.
 *
 * LispExprEvaluatorException class
 *
 * It is used by LispExpressionEvaluator 
 *
 *************************************************************************************/

package PJ2;

public class LispExprEvaluatorException extends RuntimeException
{
    public LispExprEvaluatorException()
    {
	this("");
    }

    public LispExprEvaluatorException(String errorMsg) 
    {
	super(errorMsg);
    }

}
