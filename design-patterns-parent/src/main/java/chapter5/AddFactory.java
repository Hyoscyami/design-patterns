package chapter5;

public class AddFactory implements CalculateFactory{
    /**
     * 创建Service
     *
     * @return
     */
    @Override
    public CalculateService createService() {
        return new AddServiceImpl();
    }
}
