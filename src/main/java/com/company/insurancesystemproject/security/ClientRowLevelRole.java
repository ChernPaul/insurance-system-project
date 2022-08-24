package com.company.insurancesystemproject.security;


import com.company.insurancesystemproject.entity.Agreement;
import com.company.insurancesystemproject.entity.User;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.security.model.RowLevelBiPredicate;
import io.jmix.security.model.RowLevelPolicyAction;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.PredicateRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;
import org.springframework.context.ApplicationContext;

@RowLevelRole(
        name = "clientRowLevel",
        code = "client-row-level-role")
public interface ClientRowLevelRole {
    @JpqlRowLevelPolicy(
            entityClass = Agreement.class,
            where = "{E}.client.user = :current_user")

    void agreement();

    @PredicateRowLevelPolicy(
            entityClass = User.class,
            actions = { RowLevelPolicyAction.READ})
    default RowLevelBiPredicate<User, ApplicationContext> readMyUserOnly() {
        return (user, applicationContext) -> {
            CurrentAuthentication currentAuthentication = applicationContext.getBean(CurrentAuthentication.class);
            return user.equals(currentAuthentication.getUser());
        };
    }

}
