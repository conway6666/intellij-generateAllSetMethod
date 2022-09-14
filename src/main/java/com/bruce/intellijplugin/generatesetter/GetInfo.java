/*
 *  Copyright (c) 2017-2019, bruce.ge.
 *    This program is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU General Public License
 *    as published by the Free Software Foundation; version 2 of
 *    the License.
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *    GNU General Public License for more details.
 *    You should have received a copy of the GNU General Public License
 *    along with this program;
 */

package com.bruce.intellijplugin.generatesetter;

import com.intellij.psi.PsiMember;
import com.intellij.psi.PsiMethod;
import com.intellij.psi.PsiVariable;

import java.util.List;
import java.util.Map;

/**
 * @Author bruce.ge
 * @Date 2017/1/19
 * @Description
 */
public class GetInfo {
    private String paramName;

    private List<PsiMember> getMethods;


    private Map<String,PsiMember> nameToMethodMap;


    public Map<String, PsiMember> getNameToMethodMap() {
        return nameToMethodMap;
    }

    public void setNameToMethodMap(Map<String, PsiMember> nameToMethodMap) {
        this.nameToMethodMap = nameToMethodMap;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public List<PsiMember> getGetMethods() {
        return getMethods;
    }

    public void setGetMethods(List<PsiMember> getMethods) {
        this.getMethods = getMethods;
    }
}
