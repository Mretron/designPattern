package com.zzj.designPattern.construct.abstractFactoryPattern;

import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.CPU;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.HardDisk;
import com.zzj.designPattern.construct.abstractFactoryPattern.domain.basic.MainBoard;

/**
 * 当实际到产品族的时候
 * 就需要抽象工厂模式来支持了
 * 不再细致的定义CPU工厂，MainBoard工厂，硬盘工厂等
 * 只需要定一个整体的电脑工厂，将不会存在兼容性的问题
 * 这就是满足产品族
 *
 * 保证了兼容可用，但是缺点也是显而易见的
 * 如果我们要增加一个元件
 * 需要修改所有的工厂
 * 有些违背了 对修改关闭，对扩展开放的设计原则
 * @author zengzhongjie
 * @date 2020/11/1
 */
public interface ComputerFactory {
    /**
     * 制作CPU
     * @return
     */
    CPU makeCPU();

    /**
     * 制作主板
     * @return
     */
    MainBoard makeMainBoard();

    /**
     * 制作硬盘
     * @return
     */
    HardDisk makeHardDisk();
}
