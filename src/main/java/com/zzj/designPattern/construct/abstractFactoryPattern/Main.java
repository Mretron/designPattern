package com.zzj.designPattern.construct.abstractFactoryPattern;

import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.CPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.Computer;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.HardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.MainBoard;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class Main {
    public static void main(String[] args) {
        ComputerFactory intelComputerFactory = new IntelComputerFactory();
        CPU cpu = intelComputerFactory.makeCPU();
        MainBoard mainBoard = intelComputerFactory.makeMainBoard();
        HardDisk hardDisk = intelComputerFactory.makeHardDisk();
        Computer result = new Computer(cpu, hardDisk, mainBoard);
    }
}
