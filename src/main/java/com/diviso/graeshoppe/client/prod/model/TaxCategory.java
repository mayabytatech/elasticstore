package com.diviso.graeshoppe.client.prod.model;

import java.util.Objects;
import com.diviso.graeshoppe.client.prod.model.Product;
import com.diviso.graeshoppe.client.prod.model.Tax;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaxCategory
 */
@Validated
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-06-26T12:37:09.495+05:30[Asia/Calcutta]")

public class TaxCategory   {
  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("products")
  @Valid
  private List<Product> products = null;

  @JsonProperty("taxes")
  @Valid
  private List<Tax> taxes = null;

  public TaxCategory description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TaxCategory id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaxCategory name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaxCategory products(List<Product> products) {
    this.products = products;
    return this;
  }

  public TaxCategory addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public TaxCategory taxes(List<Tax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public TaxCategory addTaxesItem(Tax taxesItem) {
    if (this.taxes == null) {
      this.taxes = new ArrayList<Tax>();
    }
    this.taxes.add(taxesItem);
    return this;
  }

  /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Tax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<Tax> taxes) {
    this.taxes = taxes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxCategory taxCategory = (TaxCategory) o;
    return Objects.equals(this.description, taxCategory.description) &&
        Objects.equals(this.id, taxCategory.id) &&
        Objects.equals(this.name, taxCategory.name) &&
        Objects.equals(this.products, taxCategory.products) &&
        Objects.equals(this.taxes, taxCategory.taxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, products, taxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxCategory {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
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

