package sort_evaluations;

/**
 * This enum allows us to "tag" sorts with an expected performance
 * and perhaps compute different statistics based on this. 
 * 
 * @author germain
 *
 */
public enum Complexity_Class
{
	NlogN, Nsquared;
	// FIXME: create "N log N" and "N squared" tags
}
