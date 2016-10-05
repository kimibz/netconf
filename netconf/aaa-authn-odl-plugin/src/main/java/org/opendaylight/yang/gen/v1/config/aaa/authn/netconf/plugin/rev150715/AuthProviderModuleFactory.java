/*
 * Copyright (c) 2015 Cisco Systems, Inc. and others. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */

/*
* Generated file
*
* Generated from: yang module name: aaa-authn-netconf-plugin yang module local name: aaa-authn-netconf-plugin
* Generated by: org.opendaylight.controller.config.yangjmxgenerator.plugin.JMXGenerator
* Generated at: Wed Jul 15 15:16:51 CEST 2015
*
* Do not modify this file unless it is present under src/main directory
*/
package org.opendaylight.yang.gen.v1.config.aaa.authn.netconf.plugin.rev150715;

import java.util.Collections;
import java.util.Set;
import org.opendaylight.controller.config.api.DependencyResolver;
import org.opendaylight.controller.config.api.DependencyResolverFactory;
import org.opendaylight.controller.config.api.ModuleIdentifier;
import org.osgi.framework.BundleContext;

/**
 * @deprecated Replaced by blueprint wiring
 */
@Deprecated
public class AuthProviderModuleFactory extends org.opendaylight.yang.gen.v1.config.aaa.authn.netconf.plugin.rev150715.AbstractAuthProviderModuleFactory {

    private static final ModuleIdentifier DEFAULT_INSTANCE_ID = new ModuleIdentifier(NAME, "default-auth-provider");

    @Override
    public AuthProviderModule instantiateModule(final String instanceName, final DependencyResolver dependencyResolver, final AuthProviderModule oldModule, final AutoCloseable oldInstance, final BundleContext bundleContext) {
        return new AuthProviderModule(
                new ModuleIdentifier(NAME, instanceName), dependencyResolver, oldModule, oldInstance, bundleContext);
    }

    @Override
    public AuthProviderModule instantiateModule(final String instanceName, final DependencyResolver dependencyResolver, final BundleContext bundleContext) {
        return new AuthProviderModule(
                new ModuleIdentifier(NAME, instanceName), dependencyResolver, bundleContext);
    }

    @Override
    public Set<AuthProviderModule> getDefaultModules(final DependencyResolverFactory dependencyResolverFactory, final BundleContext bundleContext) {
        // Config subsystem puts this instance into OSGi service registry automatically
        final DependencyResolver dependencyResolver = dependencyResolverFactory.createDependencyResolver(DEFAULT_INSTANCE_ID);
        return Collections.singleton(new AuthProviderModule(DEFAULT_INSTANCE_ID, dependencyResolver, bundleContext));
    }
}
