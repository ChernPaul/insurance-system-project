package com.company.insurancesystemproject.screen.agreement;

import io.jmix.ui.screen.*;
import com.company.insurancesystemproject.entity.Agreement;

@UiController("Agreement.edit")
@UiDescriptor("agreement-edit.xml")
@EditedEntityContainer("agreementDc")
public class AgreementEdit extends StandardEditor<Agreement> {
}