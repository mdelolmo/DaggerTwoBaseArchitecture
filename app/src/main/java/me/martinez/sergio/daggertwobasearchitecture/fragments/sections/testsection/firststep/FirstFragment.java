/*
 *  Copyright (C) 2015 Sergio Martinez Open Source Project
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.firststep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import me.martinez.sergio.daggertwobasearchitecture.R;
import me.martinez.sergio.daggertwobasearchitecture.di.injectableelements.base.BaseFragment;
import me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.firststep.presentation
        .FirstFragmentPresenter;
import me.martinez.sergio.daggertwobasearchitecture.fragments.sections.testsection.firststep.presentation
        .FirstFragmentView;
import me.martinez.sergio.daggertwobasearchitecture.test.A;

/**
 * Created by Sergio Martinez Rodriguez
 * Date 15/7/15.
 */
public class FirstFragment extends BaseFragment implements
        FirstFragmentView {

    @Inject A a;
    @Inject FirstFragmentPresenter firstFragmentPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        testDI();
    }

    //region Test DI stuff
    private void testDI() {

    }

}
