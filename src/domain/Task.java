package domain;

/**
 * Created by changwenhu on 2017/5/8.
 */
public class Task {

    private String state;
    private Integer code;

    public Task(String state, Integer code) {
        this.state = state;
        this.code = code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
