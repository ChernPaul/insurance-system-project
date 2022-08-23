package com.company.insurancesystemproject.security;

import com.company.insurancesystemproject.entity.Agreement;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;


@ResourceRole(name = "client", code = "client-role")
public interface ClientRole {

    @EntityPolicy(
            entityClass = Agreement.class,
            actions = {EntityPolicyAction.READ})


    @EntityAttributePolicy(
            entityClass = Agreement.class,
            attributes = {"conclusionDate", "tariffRate", "insuranceAmount, insuranceType, expirationDate, client, " +
                    "branchOffice"},
            action = EntityAttributePolicyAction.VIEW)

    @ScreenPolicy(
            screenIds = {"Agreement.browse"})
    @MenuPolicy(
            menuIds = {"Agreement.browse"})

    void agreement();

}
