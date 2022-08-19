package com.company.insurancesystemproject.screen.branchoffice;

import io.jmix.ui.screen.*;
import com.company.insurancesystemproject.entity.BranchOffice;

@UiController("BranchOffice.browse")
@UiDescriptor("branch-office-browse.xml")
@LookupComponent("branchOfficesTable")
public class BranchOfficeBrowse extends StandardLookup<BranchOffice> {
}