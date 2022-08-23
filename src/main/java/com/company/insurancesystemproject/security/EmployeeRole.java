package com.company.insurancesystemproject.security;
import com.company.insurancesystemproject.entity.Agreement;
import com.company.insurancesystemproject.entity.BranchOffice;
import com.company.insurancesystemproject.entity.Client;
import com.company.insurancesystemproject.entity.User;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityui.role.UiMinimalRole;
import io.jmix.securityui.role.annotation.MenuPolicy;
import io.jmix.securityui.role.annotation.ScreenPolicy;


@ResourceRole(name = "employee", code = "employee-role")
public interface EmployeeRole extends UiMinimalRole {

    @EntityPolicy(
            entityClass = Agreement.class,
            actions = {EntityPolicyAction.READ,
                    EntityPolicyAction.CREATE,
                    EntityPolicyAction.UPDATE})


    @EntityAttributePolicy(
            entityClass = Agreement.class,
            attributes = {"conclusionDate", "tariffRate", "insuranceType", "insuranceAmount", "expirationDate",
                    "client", "branchOffice"},

            action = EntityAttributePolicyAction.MODIFY)

    @ScreenPolicy(
            screenIds = {"Agreement.browse", "Agreement.edit"})
    @MenuPolicy(
            menuIds = {"Agreement.browse"})

    void agreement();

    @EntityPolicy(
            entityClass = Client.class,
            actions = {EntityPolicyAction.READ,
                    EntityPolicyAction.CREATE,
                    EntityPolicyAction.UPDATE})


    @EntityAttributePolicy(
            entityClass = Client.class,
            attributes = {"fullname", "agreements", "user", "email", "passport"},

            action = EntityAttributePolicyAction.MODIFY)

    @ScreenPolicy(
            screenIds = {"Client.browse", "Client.edit"})
    @MenuPolicy(
            menuIds = {"Client.browse"})



    void client();

    @EntityPolicy(
            entityClass = BranchOffice.class,
            actions = {EntityPolicyAction.READ})

    @EntityAttributePolicy(
            entityClass = BranchOffice.class,
            attributes = {"name", "address", "phoneNumber"},

            action = EntityAttributePolicyAction.VIEW)

    @ScreenPolicy(
            screenIds = {"BranchOffice.browse"})
    @MenuPolicy(
            menuIds = {"BranchOffice.browse"})
    void branchOffice();

    @EntityPolicy(
            entityClass = User.class,
            actions = {EntityPolicyAction.READ})

    @EntityAttributePolicy(
            entityClass = BranchOffice.class,
            attributes = {"client", "firstName", "lastName", "username"},

            action = EntityAttributePolicyAction.VIEW)

    @ScreenPolicy(
            screenIds = {"User.browse"})
    void user();

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

