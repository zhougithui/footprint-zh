package com.zmy.instrument.test;

// 一个运行 Attach API 的线程子类
public class AttachThread extends Thread {

	/*private final List<VirtualMachineDescriptor> listBefore;

	private final String jar;

	AttachThread(String attachJar, List<VirtualMachineDescriptor> vms) {
		listBefore = vms; // 记录程序启动时的 VM 集合
		jar = attachJar;
	}

	public void run() {
		VirtualMachine vm = null;
		List<VirtualMachineDescriptor> listAfter = null;
		try {
			int count = 0;
			while (true) {
				listAfter = VirtualMachine.list();
				for (VirtualMachineDescriptor vmd : listAfter) {
					if (!listBefore.contains(vmd)) {
						// 如果 VM 有增加，我们就认为是被监控的 VM 启动了
						// 这时，我们开始监控这个 VM
						System.out.println("vmd started....");
						vm = VirtualMachine.attach(vmd);
						break;
					}
				}
				Thread.sleep(500);
				count++;
				if (null != vm || count >= 10) {
					break;
				}
			}
			vm.loadAgent(jar);
			vm.detach();
			System.out.println("load agent....");
		} catch (Exception e) {

		}
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		new AttachThread("F:/worksoftware/eclipsejee-neon/workspace/java/instrument/target/instrument-0.0.1-SNAPSHOT.jar", VirtualMachine.list()).start();

	}
*/
}