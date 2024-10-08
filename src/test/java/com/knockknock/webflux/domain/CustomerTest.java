package com.knockknock.webflux.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

class CustomerTest {

    @DisplayName("고객을 생성한다")
    @Test
    void create_success() {
        assertThatCode(() -> new Customer("김", "철수")).doesNotThrowAnyException();
    }
}