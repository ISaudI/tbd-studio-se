// ============================================================================
//
// Copyright (C) 2006-2019 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.hdp260.test.modulegroup;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;
import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.hdp260.HDP260Constant;
import org.talend.hadoop.distribution.hdp260.modulegroup.HDP260PigOutputModuleGroup;

/**
 * created by pbailly on 16 Feb 2016 Detailled comment
 *
 */
public class HDP260PigOutputModuleGroupTest {

    @Test
    public void testModuleGroups() throws Exception {
        Map<String, String> results = new HashMap<String, String>();

        results.put(HDP260Constant.PIG_HCATALOG_MODULE_GROUP.getModuleName(), "(STORE=='HCATSTORER')");
        results.put(HDP260Constant.HBASE_MODULE_GROUP.getModuleName(), "(STORE=='HBASESTORAGE')");
        results.put(HDP260Constant.PIG_HBASE_MODULE_GROUP.getModuleName(), "(STORE=='HBASESTORAGE')");
        results.put(HDP260Constant.PIG_AVRO_MODULE_GROUP.getModuleName(), "(STORE=='AVROSTORAGE')");
        results.put(HDP260Constant.PIG_RCFILE_MODULE_GROUP.getModuleName(), "(STORE=='RCFILEPIGSTORAGE')");
        results.put(HDP260Constant.PIG_SEQUENCEFILE_MODULE_GROUP.getModuleName(), "(STORE=='SEQUENCEFILESTORAGE')");

        Set<DistributionModuleGroup> moduleGroups = HDP260PigOutputModuleGroup.getModuleGroups();
        assertEquals(6, moduleGroups.size());
        moduleGroups.iterator();
        for (DistributionModuleGroup module : moduleGroups) {
            assertTrue("Should contain module " + module.getModuleName(), results.containsKey(module.getModuleName()));
            if (results.get(module.getModuleName()) == null) {
                assertTrue("The condition of the module " + module.getModuleName() + " is not null.",
                        results.get(module.getModuleName()) == null);
            } else {
                assertTrue(
                        "The condition of the module " + module.getModuleName() + " is null, but it should be "
                                + results.get(module.getModuleName()) + ".", results.get(module.getModuleName()) != null);
                assertEquals(results.get(module.getModuleName()), module.getRequiredIf().getConditionString());
            }
        }
    }
}