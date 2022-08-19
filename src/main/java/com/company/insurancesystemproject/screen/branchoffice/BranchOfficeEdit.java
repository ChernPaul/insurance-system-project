package com.company.insurancesystemproject.screen.branchoffice;

import io.jmix.ui.screen.*;
import com.company.insurancesystemproject.entity.BranchOffice;

@UiController("BranchOffice.edit")
@UiDescriptor("branch-office-edit.xml")
@EditedEntityContainer("branchOfficeDc")
public class BranchOfficeEdit extends StandardEditor<BranchOffice> {
}