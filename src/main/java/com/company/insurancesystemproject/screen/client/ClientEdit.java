package com.company.insurancesystemproject.screen.client;

import io.jmix.ui.screen.*;
import com.company.insurancesystemproject.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}