describe("sample test", () => {
  beforeEach(() => {
    cy.viewport(1994, 1600);
  });

  it("google test cases", () => {
    cy.visit("https://www.google.com/");
    cy.get('input[name="q"]').type(" makemytrip {enter}   ");
    cy.contains("Booking, Flight Tickets").click();
    cy.url().should("include", "https://www.makemytrip.com/flights/");
    cy.get("div.makeFlex column flexOne whiteText latoBold ").click();
  });
});
