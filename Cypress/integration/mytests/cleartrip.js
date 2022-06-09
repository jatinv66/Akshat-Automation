describe("testcase3", () => {
  it("visit ClearTrip page", () => {
    cy.visit("https://www.cleartrip.com/", {
      headers: {
        "user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64)",
      },
      timeout: 60000,
    });
  });
  it("select round trip", () => {
    cy.get(":nth-child(2) > .flex-start > .radio__input").check();
    cy.get(
      "#root > div > div > div.container.w-100p.flex-1 > div > div.col-13.homeba.h-fc > div > div.flex.flex-between.flex-middle.px-4.mt-2.mb-4 > label:nth-child(2) > div.flex.flex-column.ml-3.mr-3 > p"
    ).click();
    cy.get(
      ":nth-child(1) > :nth-child(2) > :nth-child(1) > .p-relative > .field"
    ).type("Chandigarh");
    cy.wait(500);
    cy.get(".ls-reset > .to-ellipsis").click();
    cy.get(
      ":nth-child(5) > :nth-child(2) > :nth-child(1) > .p-relative > .field"
    ).type("Pune");
    cy.wait(500);
    cy.get(".ls-reset > .to-ellipsis").click();
  });
  it("select depature date", () => {
    cy.get(
      ".col > .w-100p > :nth-child(1) > .p-relative > :nth-child(1)"
    ).click();
    cy.get('[aria-label="Tue June 25  2022"] > .Day-grid > .p-1').click();

    cy.get('[aria-label="Fri June 25 2022"] > .Day-grid > .p-1').click();
    cy.get(".col > .px-7").click();
  });
  it("wait a moment", () => {
    cy.wait(500);
  });
});
