package com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Computer {
    private CPU cpu;
    private HardDisk hardDisk;
    private MainBoard mainBoard;

    public Computer(CPU cpu, HardDisk hardDisk, MainBoard mainBoard) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.mainBoard = mainBoard;
    }
}
