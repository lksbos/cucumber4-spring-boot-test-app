package features.mock;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FakeController {
    @Getter
    private int count;

    @PatchMapping("/fake-endpoint")
    public ResponseEntity patch(){
        count ++;
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
