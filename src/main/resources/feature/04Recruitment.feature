Feature: Recruitmen Add Candidate

# comment scenario test
 Scenario: Admin add new candidate
   Given Admin logged in
   And Admin go to menu recruitmen
   And Admin click button action
   And Admin go to menu recruitmen2
   When Admin click button add
   And Admin enter firstname
   And Admin enter lastname
   And Admin enter email
   And Admin upload file resume
   And Admin click button save
   Then Admin redirect to page Application Stage