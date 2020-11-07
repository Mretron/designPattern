package com.zzj.designPattern.construct.abstractFactoryPattern;

import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Amd.AmdCPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Amd.AmdHardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.Amd.AmdMainBoard;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.CPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.HardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.MainBoard;

/**
 * @author zengzhongjie
 * @date 2020/11/1
 */
public class AmdComputerFactory implements ComputerFactory{
    public CPU makeCPU() {
        return new AmdCPU();
    }

    public MainBoard makeMainBoard() {
        return new AmdMainBoard();
    }

    public HardDisk makeHardDisk() {
        return new AmdHardDisk();
    }
}
