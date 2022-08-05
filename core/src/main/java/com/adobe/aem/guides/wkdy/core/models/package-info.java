/*
 *  Copyright 2015 Adobe Systems Incorporated
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/* Whenever a changes are made to the files in this package, the package 
 *  version must be adjusted semantically. If not, the Maven project’s 
 * bnd-baseline-maven-plugin will detect an invalid package version and 
 * break the built. Luckily, on failure the Maven plugin reports the invalid 
 * Java package version as well as the the version it should be. Just updated 
 * the @Version("...") declaration in the violating Java package’s 
 * package-info.java to the version recommended by the plugin to fix.
 */

@Version("1.1.0")
package com.adobe.aem.guides.wkdy.core.models;

import org.osgi.annotation.versioning.Version;