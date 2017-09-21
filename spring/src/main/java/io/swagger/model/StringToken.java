package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

/**
 * StringToken
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-09-21T08:29:03.401Z")

public class StringToken   {
  @JsonProperty("string")
  private String string = null;

  @JsonProperty("isAttribute")
  private Boolean isAttribute = null;

  @JsonProperty("characters")
  private BigDecimal characters = null;

  @JsonProperty("upperOrLower")
  private String upperOrLower = null;

  public StringToken string(String string) {
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @ApiModelProperty(example = "PersonIdentifier", required = true, value = "")
  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

  public StringToken isAttribute(Boolean isAttribute) {
    this.isAttribute = isAttribute;
    return this;
  }

   /**
   * Get isAttribute
   * @return isAttribute
  **/
  @ApiModelProperty(example = "true", required = true, value = "")
  public Boolean getIsAttribute() {
    return isAttribute;
  }

  public void setIsAttribute(Boolean isAttribute) {
    this.isAttribute = isAttribute;
  }

  public StringToken characters(BigDecimal characters) {
    this.characters = characters;
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @ApiModelProperty(example = "1.0", value = "")
  public BigDecimal getCharacters() {
    return characters;
  }

  public void setCharacters(BigDecimal characters) {
    this.characters = characters;
  }

  public StringToken upperOrLower(String upperOrLower) {
    this.upperOrLower = upperOrLower;
    return this;
  }

   /**
   * Get upperOrLower
   * @return upperOrLower
  **/
  @ApiModelProperty(example = "Upper", value = "")
  public String getUpperOrLower() {
    return upperOrLower;
  }

  public void setUpperOrLower(String upperOrLower) {
    this.upperOrLower = upperOrLower;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringToken stringToken = (StringToken) o;
    return Objects.equals(this.string, stringToken.string) &&
        Objects.equals(this.isAttribute, stringToken.isAttribute) &&
        Objects.equals(this.characters, stringToken.characters) &&
        Objects.equals(this.upperOrLower, stringToken.upperOrLower);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string, isAttribute, characters, upperOrLower);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringToken {\n");
    
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    isAttribute: ").append(toIndentedString(isAttribute)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    upperOrLower: ").append(toIndentedString(upperOrLower)).append("\n");
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

