/*
 * Copyright 2012
 * Ubiquitous Knowledge Processing (UKP) Lab and FG Language Technology
 * Technische Universität Darmstadt
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.openminted.annotationeditor.app;

import org.apache.wicket.Page;
import org.springframework.stereotype.Component;

import de.tudarmstadt.ukp.clarin.webanno.ui.core.WicketApplicationBase;
import de.tudarmstadt.ukp.clarin.webanno.ui.core.page.WebAnnoCssReference;
import de.tudarmstadt.ukp.clarin.webanno.ui.menu.MainMenuPage;
import eu.openminted.annotationeditor.app.css.OpenMinTeDCssReference;

@Component("wicketApplication")
public class WicketApplication
    extends WicketApplicationBase
{
    @Override
    protected void initOnce()
    {
        super.initOnce();

        addResourceReplacement(WebAnnoCssReference.get(), OpenMinTeDCssReference.get());
    }
    
    @Override
    protected String getLogoLocation()
    {
        return "/eu/openminted/annotationeditor/app/logo/OpenMINTED_Black_small.png";
    }

    @Override
    public Class<? extends Page> getHomePage()
    {
        return MainMenuPage.class;
    }
}
