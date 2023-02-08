smartsf {
    audittrail {
         //custom closure to return the current user who is logged in
        currentUserClosure = { ctx ->
            //ctx is the applicationContext
            //default is basically
            return "scQuartzInit"
        }
        //there are NO defaults for companyId.
        //            companyId.field   = "companyId" //used for multi-tenant apps and is just the name of the field to use
    }
}