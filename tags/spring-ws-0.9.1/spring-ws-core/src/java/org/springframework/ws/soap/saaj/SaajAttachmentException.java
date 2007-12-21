/*
 * Copyright 2006 the original author or authors.
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

package org.springframework.ws.soap.saaj;

import org.springframework.ws.soap.AttachmentException;

/**
 * @author Arjen Poutsma
 */
public class SaajAttachmentException extends AttachmentException {

    public SaajAttachmentException(String msg) {
        super(msg);
    }

    public SaajAttachmentException(String msg, Throwable ex) {
        super(msg, ex);
    }

    public SaajAttachmentException(Throwable ex) {
        super(ex);
    }
}