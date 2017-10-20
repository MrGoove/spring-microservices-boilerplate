package com.saintdan.framework.param;

import com.saintdan.framework.annotation.NotNullField;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpMethod;

/**
 * @author <a href="http://github.com/saintdan">Liao Yifan</a>
 * @date 15/02/2017
 * @since JDK1.8
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RefreshParam implements Serializable {

  @NotNullField(method = HttpMethod.POST, message = "refresh token cannot be null.")
  private String refreshToken;
}
