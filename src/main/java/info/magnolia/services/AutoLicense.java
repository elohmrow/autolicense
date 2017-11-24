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
package info.magnolia.services;

import info.magnolia.module.ModuleLifecycle;
import info.magnolia.module.ModuleLifecycleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Module class for auto-license module.
 */
public class AutoLicense implements ModuleLifecycle {
    private static final Logger logger = LoggerFactory.getLogger(AutoLicense.class);

    @Override
    public void start(ModuleLifecycleContext moduleLifecycleContext) {
        logger.debug("*****************************************");
        logger.debug("***  starting Auto-License module!!!  ***");
        logger.debug("*****************************************");
    }

    @Override
    public void stop(ModuleLifecycleContext moduleLifecycleContext) {
        logger.debug("*****************************************");
        logger.debug("***  stopping Auto-License module!!!  ***");
        logger.debug("*****************************************");
    }

}
