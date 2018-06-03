import java.util.Arrays;

public class RMB{

	private String[] HanArr = new String[] { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
	private String[] UnitArr = new String[] { "十", "百", "千", "万" };

	/**
	*把一个浮点数分解成整数部分和小数部分字符串
	*@param num 需要别分解的浮点数
	*@return 分解出来的整体部分和小数部分。第一个数组元素是整数部分，第二个数组元素是小数部分
	*/
	private String[] divide( double num ){

		//将一个浮点数据类型装置转换为long型，即得到它的整数部分
		long zhengshu = (long)num;

		//将浮点数减去整数部分，得到小数部分，小数部分乘以100后再取整得到2位小数
		long xiaoshu = Math.round( (num - zhengshu) *100 );

		//下面用了2中方法把整数转换为字符串
		return new String[]{ zhengshu + "", String.valueOf(xiaoshu) };
	}

	/**
	*把一个四位的数字字符串变成汉字字符串
	*@param numStr 需要被转换成的四位数字字符串
	*@return 四位的数字字符串被转换成汉字字符串  
	*/
	private String toHanStr( String numStr ){
		String result = "";
		int numLen = numStr.length();

		//依次遍历数字字符串的每一位数字
		for( int i = 0; i < numLen; i++ ){

			//把char型数字转换成int型数字，因为它们的ASCII码恰好相差48
			//因此把char型数字减去48得到int型数字。
			int num = numStr.charAt(i)-48;

			//如果不是最后一位数字，而且数字不是零，则需要添加单位
			if( i != numLen-1 && num != 0 ){
				result += HanArr[num]+UnitArr[numLen-2-i];
			}

			//否则不要添加单位
			else{
				result += HanArr[num];
			}
		}
		return result;
	}

	public static void main( String[] args ){
		RMB rmb = new RMB();

		//测试把一个浮点数分解成整数部分和小数部分
		System.out.println( Arrays.toString( rmb.divide(1239823235.235346) ) );

		//测试把一个四位的数字字符串变成汉字字符串
		System.out.println( rmb.toHanStr("9609") );
	}
}