/*
 * Copyright 2016 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rsocket.kotlin.internal.frame

internal object VersionFlyweight {

    fun encode(major: Int, minor: Int): Int {
        return major shl 16 or (minor and 0xFFFF)
    }

    fun major(version: Int): Int {
        return version shr 16
    }

    fun minor(version: Int): Int {
        return version and 0xFFFF
    }

    fun toString(version: Int): String {
        return major(version).toString() + "." + minor(version)
    }
}
