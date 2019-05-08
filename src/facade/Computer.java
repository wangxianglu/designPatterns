package facade;

/**
 * @ClassName Computer
 * @Description TODO
 * @Author Wangxianglu
 * @Date 2019/5/8 10:32
 * @Version 1.0
 **/
public class Computer {

    private CPU cpu;

    private Disk disk;

    private Memory memory;

    public Computer() {
        this.cpu = new CPU();
        this.disk = new Disk();
        this.memory = new Memory();
    }

    public void startup(){
        System.out.println("start the computer!");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("start computer finished!");
    }

    public void shutdown(){
        System.out.println("begin to close the computer!");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("computer closed!");
    }
}
