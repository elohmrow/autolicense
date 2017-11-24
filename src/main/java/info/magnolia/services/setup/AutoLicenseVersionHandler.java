/**
 * This file Copyright (c) 2017 Magnolia International
 * Ltd.  (http://www.magnolia-cms.com). All rights reserved.
 *
 *
 * This program and the accompanying materials are made
 * available under the terms of the Magnolia Network Agreement
 * which accompanies this distribution, and is available at
 * http://www.magnolia-cms.com/mna.html
 *
 * Any modifications to this file must keep this entire header
 * intact.
 *
 */
package info.magnolia.services.setup;

import info.magnolia.module.DefaultModuleVersionHandler;
import info.magnolia.module.InstallContext;
import info.magnolia.module.delta.BootstrapSingleResource;
import info.magnolia.module.delta.Task;

import javax.jcr.ImportUUIDBehavior;
import java.util.ArrayList;
import java.util.List;

/**
 * Bootstrap the license key on module update installation.
 */
public class AutoLicenseVersionHandler extends DefaultModuleVersionHandler {

    @Override
    protected List<Task> getExtraInstallTasks(InstallContext installContext) {
        final List<Task> tasks = new ArrayList<>();

        tasks.add(new BootstrapSingleResource("Bootstrap", "Add the Magnolia Enterprise license",
                "/mgnl-bootstrap/autolicense/config.modules.enterprise.license.xml",
                ImportUUIDBehavior.IMPORT_UUID_COLLISION_REMOVE_EXISTING));

        return tasks;
    }

}
