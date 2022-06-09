describe("amazon test cases", () => {
  it("test case", () => {
    cy.visit("http://www.amazon.in");
    cy.enterypoint("8570994276", "Akshat@2604");
  });
  it("next test cases", () => {
    cy.get("#nav-search-dropdown-card div select.nav-search-dropdown").select(
      "Electronics",
      { force: true }
    );
    cy.get("div.nav-fill div.nav-search-field input#twotabsearchtextbox").type(
      "Iphone 12{enter}"
    );
    cy.get("div.s-product-image-container > div > span > a")
      .first()
      .invoke("removeAttr", "target")
      .click();
    cy.get(
      "#addToCart_feature_div >div >span>span>span input#add-to-cart-button"
    ).click();
    cy.get("#attach-view-cart-button-form>span>span>input").click();
  });
});
