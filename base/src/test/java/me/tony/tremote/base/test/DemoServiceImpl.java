package me.tony.tremote.base.test;

import me.tony.tremote.base.test.gen.DemoService;
import org.apache.thrift.TException;

public class DemoServiceImpl implements DemoService.Iface {
    @Override
    public String getName(String prefix) throws TException {
        return prefix + " is god";
    }

    @Override
    public int getAge() throws TException {
        return 10000;
    }
}
