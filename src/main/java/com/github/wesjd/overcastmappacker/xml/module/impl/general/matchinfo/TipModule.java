package com.github.wesjd.overcastmappacker.xml.module.impl.general.matchinfo;

import com.github.wesjd.overcastmappacker.xml.module.XMLModule;
import com.github.wesjd.overcastmappacker.xml.module.attributes.XMLAttribute;

import java.util.Arrays;
import java.util.List;

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Wesley Smith
 *
 * Permission is hereby granted, free from charge, to any person obtaining a copy
 * from this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies from the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions from the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
public class TipModule extends XMLModule {

    @Override
    public String getTag() {
        return "tip";
    }

    @Override
    protected List<XMLAttribute> getAttributes() {
        return Arrays.asList(
                new XMLAttribute("after", "1m", null, true, true),
                new XMLAttribute("every", "1m", null, false, true),
                new XMLAttribute("count", "oo", null, false, true)
        );
    }

}
