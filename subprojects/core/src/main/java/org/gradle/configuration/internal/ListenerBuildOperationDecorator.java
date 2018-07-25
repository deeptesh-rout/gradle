/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.gradle.configuration.internal;

import groovy.lang.Closure;
import org.gradle.api.Action;

public interface ListenerBuildOperationDecorator {

    <T> Action<T> decorate(Action<T> action);

    <T> Closure<T> decorate(Closure<T> closure);

    <T> T decorate(Class<T> cls, T listener);

    Object decorateUnknownListener(Object listener);

    long allocateApplicationId();

    void startApplication(long id);

    void finishApplication(long id);

}
