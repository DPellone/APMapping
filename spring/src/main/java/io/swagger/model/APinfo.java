package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.StringToken;
import java.util.ArrayList;
import java.util.List;

/**
 * APinfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-21T08:29:03.401Z")

public class APinfo   {
  @JsonProperty("url")
  private String url = null;

  @JsonProperty("token")
  private List<StringToken> token = new ArrayList<StringToken>();

  public APinfo url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "http://example.org/SAML", required = true, value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public APinfo token(List<StringToken> token) {
    this.token = token;
    return this;
  }

  public APinfo addTokenItem(StringToken tokenItem) {
    this.token.add(tokenItem);
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(required = true, value = "")
  public List<StringToken> getToken() {
    return token;
  }

  public void setToken(List<StringToken> token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APinfo apinfo = (APinfo) o;
    return Objects.equals(this.url, apinfo.url) &&
        Objects.equals(this.token, apinfo.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APinfo {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

