package com.zzj.designPattern.construct.abstractFactoryPattern;

import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Intel.IntelCPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Intel.IntelHardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Intel.IntelMainBoard;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.CPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.HardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.MainBoard;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class IntelComputerFactory implements ComputerFactory{

    public CPU makeCPU() {
        return new IntelCPU();
    }

    public MainBoard makeMainBoard() {
        return new IntelMainBoard();
    }

    public HardDisk makeHardDisk() {
        return new IntelHardDisk();
    }
}
