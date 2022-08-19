package com.company.insurancesystemproject.screen.agreement;

import io.jmix.ui.screen.*;
import com.company.insurancesystemproject.entity.Agreement;

@UiController("Agreement.browse")
@UiDescriptor("agreement-browse.xml")
@LookupComponent("agreementsTable")
public class AgreementBrowse extends StandardLookup<Agreement> {
}