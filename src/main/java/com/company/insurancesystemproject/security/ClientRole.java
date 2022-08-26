
package com.company.insurancesystemproject.security;

import com.company.insurancesystemproject.entity.Agreement;
import com.company.insurancesystemproject.entity.User;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;

@ResourceRole(name = "client", code = "client-role")
public interface ClientRole extends UiMinimalRole {

    @EntityPolicy(
            entityClass = Agreement.class,
            actions = {EntityPolicyAction.READ})


    @EntityAttributePolicy(
            entityClass = Agreement.class,
            attributes = {"conclusionDate", "tariffRate", "insuranceType", "insuranceAmount", "expirationDate",
                    "client", "branchOffice"},
            action = EntityAttributePolicyAction.VIEW)

    @ScreenPolicy(
            screenIds = {"Agreement.browse","Agreement.edit"})
    @MenuPolicy(
            menuIds = {"Agreement.browse"})

    void agreement();

    @EntityPolicy(
            entityClass = User.class,
            actions = {EntityPolicyAction.READ})
    @EntityAttributePolicy(
            entityClass = User.class,
            attributes = "*",
            action = EntityAttributePolicyAction.VIEW)

    @Override
    default void main() {

    }

    @Override
    default void login() {

    }

    @Override
    default void backgroundWork() {

    }

    @Override
    default void layoutAnalyzer() {

    }

    @Override
    default void inputDialog() {

    }

    @Override
    default void notFoundScreen() {

    }

    @Override
    default void selectValueDialog() {

    }

    @Override
    default void keyValueEntity() {

    }
}
