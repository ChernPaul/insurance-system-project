package com.company.insurancesystemproject.security;


import com.company.insurancesystemproject.entity.Agreement;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.security.model.RowLevelBiPredicate;
import io.jmix.security.model.RowLevelPolicyAction;
import io.jmix.security.role.annotation.PredicateRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;
import org.springframework.context.ApplicationContext;

@RowLevelRole(
        name = "clientRowLevel",
        code = "client-row-level-role")
public interface ClientRowLevelRole {
    @PredicateRowLevelPolicy(
            entityClass = Agreement.class,
            actions = { RowLevelPolicyAction.READ})
    default RowLevelBiPredicate<Agreement, ApplicationContext> readMyAgreements() {
        return (agreement, applicationContext) -> {
            CurrentAuthentication currentAuthentication = applicationContext.getBean(CurrentAuthentication.class);
            return agreement.getClient().getUser().equals(currentAuthentication.getUser());
        };
    }

}

