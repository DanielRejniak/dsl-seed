job('Seed All') {
  scm {
    git ('https://github.com/DanielRejniak/dsl-seed.git')
  }
  steps {
    dsl {
      external('jobs/*.groovy')  
      // default behavior
      // removeAction('IGNORE')      
      removeAction('DELETE')
    }
  }
}