package calculator.controller;

import calculator.model.Input;
import java.util.Arrays;
import java.util.List;

public class InputDivider {

    public static Input divideInput(Input input) {
        if (input.isEmpty()) {
            return new Input(input.origin(), input.separator(), List.of("0"));
        }
        List<String> numbers = Arrays.stream(input.origin().split(
                        input.separator()))
                .toList();
        return new Input(input.origin(), input.separator(),
                numbers);
    }
}