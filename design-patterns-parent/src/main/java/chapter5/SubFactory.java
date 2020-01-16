package chapter5;

public class SubFactory implements CalculateFactory{
    /**
     * 创建Service
     *
     * @return
     */
    @Override
    public CalculateService createService() {
        return new SubServiceImpl();
    }
}
