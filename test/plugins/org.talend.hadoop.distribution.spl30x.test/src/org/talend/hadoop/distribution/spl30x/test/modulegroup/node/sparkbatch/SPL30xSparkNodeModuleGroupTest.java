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
package org.talend.hadoop.distribution.spl30x.test.modulegroup.node.sparkbatch;

import java.util.Set;

import org.junit.Assert;
import org.junit.Test;
import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.constants.ModuleGroupName;
import org.talend.hadoop.distribution.constants.SparkBatchConstant;
import org.talend.hadoop.distribution.spl30x.SPL30xDistribution;
import org.talend.hadoop.distribution.spl30x.modulegroup.node.SPL30xNodeModuleGroup;

public class SPL30xSparkNodeModuleGroupTest {

    @Test
    public void testModuleGroups() throws Exception {
        Set<DistributionModuleGroup> moduleGroups = SPL30xNodeModuleGroup.getModuleGroup(
                ModuleGroupName.PARQUET.get(SPL30xDistribution.VERSION),
                SparkBatchConstant.SPARK_BATCH_SPARKCONFIGURATION_LINKEDPARAMETER, SPL30xDistribution.SPARK_VERSION);
        Assert.assertEquals(1, moduleGroups.size());
        Assert.assertTrue(moduleGroups.stream().anyMatch(group -> "PARQUET-GROUP-SPARK_3_0_x".equals(group.getModuleName()))); //$NON-NLS-1$
    }
}
