package fs.apidef.identifyservice.java.class_11;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class Main {
    @Test
    public void test_Format_Email() {
        String email = "nguyenkhanhlinh.com";
        assertThat(email).isNotEmpty()
                .containsPattern("[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$");
    }

    @Test
    public void test_Weight() {
        String weight = "57";
        assertThat(weight).isNotEmpty()
                .containsOnlyDigits();
        int i = Integer.parseInt(weight);
        assertThat(i).isStrictlyBetween(0, 200);
    }

    @Test
    void test_Cmt() {
        String[] cmt = new String[]{"234134535", "34267858", "123456342", "095643534", "gggto9gr5"};
        for (int i = 0; i < cmt.length; i++) {
            Assertions.assertThat(cmt[i]).isNotEmpty()
                    .hasSize(9)
                    .containsPattern("[0-9]");
        }
    }
}