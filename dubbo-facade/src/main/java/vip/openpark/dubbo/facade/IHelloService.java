package vip.openpark.dubbo.facade;

/**
 * @author anthony
 * @version 2024/11/14
 * @since 2024/11/14 17:28
 */
public interface IHelloService {
	/**
	 * say hello
	 *
	 * @param name name
	 * @return String
	 */
	String hello(String name);
}