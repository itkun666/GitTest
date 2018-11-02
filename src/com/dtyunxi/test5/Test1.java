package com.dtyunxi.test5;
/**
 * �˴�����ʾ���㣺
 * 		1.������ڱ�GCʱ��������
 * 		2.�����ԾȵĻ���ֻ��һ�Σ���Ϊ�����finalize()�������ֻ�ᱻϵͳ�Զ�����һ��
 * @Title Test1
 * @Descritpion 
 * @author ��ͬ
 * @Date 2018��9��7��
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
		 * ��һ������
		 */
		SAVE_HOOK = null;
		System.gc();
		/**finalizeִ�м���ܵͣ�������ͣ0.5��ȴ���ִ��*/
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.is_Alive();
		} else {
			System.out.println("no I am dead ...");
		}
		
		/**ͬ���Ĵ����ڴ�ִ�У�Ч����ͬ��֤��ֻ������һ��*/
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
