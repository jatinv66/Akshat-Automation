// ***********************************************
// This example commands.js shows you how to
// create various custom commands and overwrite
// existing commands.
//
// For more comprehensive examples of custom
// commands please read more here:
// https://on.cypress.io/custom-commands
// ***********************************************
//
//
// -- This is a parent command --
// Cypress.Commands.add('login', (email, password) => { ... })
//
//
// -- This is a child command --
// Cypress.Commands.add('drag', { prevSubject: 'element'}, (subject, options) => { ... })
//
//
// -- This is a dual command --
// Cypress.Commands.add('dismiss', { prevSubject: 'optional'}, (subject, options) => { ... })
//
//
// -- This will overwrite an existing command --
// Cypress.Commands.overwrite('visit', (originalFn, url, options) => { ... })
// import "cypress-file-upload";
Cypress.Commands.add("enterypoint", (number, password) => {
  cy.get("div#nav-tools a:nth-of-type(2)").click();
  cy.get("#ap_email").type(number);
  cy.get(".a-section span#continue span input#continue").click();
  cy.get("#ap_password").type(password);
  cy.get(".a-section span#auth-signin-button span input#signInSubmit").click();
});
