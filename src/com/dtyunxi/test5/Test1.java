package com.dtyunxi.test5;
/**
 * 此代码演示两点：
 * 		1.对象可在被GC时自我拯救
 * 		2.这种自救的机会只有一次，因为对象的finalize()方法最多只会被系统自动调用一次
 * @Title Test1
 * @Descritpion 
 * @author 玄同
 * @Date 2018年9月7日
 * @since V0.1.0
 */
public class Test1 {
	public static Test1 SAVE_HOOK = null;
	public void is_Alive(){
		System.out.println("yes, I am still alive ...");
	}
	@Override
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("finalize method excuted");
		Test1.SAVE_HOOK =this;
	}
	public static void main(String[] args) throws Throwable {
		SAVE_HOOK = new Test1();
		/**
		 * 第一次拯救
		 */
		SAVE_HOOK = null;
		System.gc();
		/**finalize执行级别很低，所以暂停0.5秒等待它执行*/
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.is_Alive();
		} else {
			System.out.println("no I am dead ...");
		}
		
		/**同样的代码在此执行，效果不同，证明只能拯救一次*/
		SAVE_HOOK = null;
		System.gc();
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.is_Alive();
		} else {
			System.out.println("no I am dead ...");
		}
		
		
		
		
		
	}

}
