public class Test {
    public Test(){
    }

    @Deprecated
    private String testName;


    public String getTestName() {
        return testName;
    }

    @Deprecated
    public void setTestName(String testName) {
        this.testName = testName;
    }

    @Override
    @Deprecated
    public String toString() {
        return "Test{" +
                "testName='" + testName + '\'' +
                '}';
    }
}
