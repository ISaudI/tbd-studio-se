/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.talend.repository.model.hadoopcluster.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.talend.core.model.metadata.builder.connection.ConnectionPackage;

import org.talend.core.model.properties.PropertiesPackage;

import org.talend.designer.business.model.business.BusinessPackage;
import org.talend.designer.core.model.utils.emf.component.ComponentPackage;
import org.talend.designer.core.model.utils.emf.talendfile.TalendFilePackage;
import org.talend.designer.joblet.model.JobletPackage;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnection;
import org.talend.repository.model.hadoopcluster.HadoopClusterConnectionItem;
import org.talend.repository.model.hadoopcluster.HadoopClusterFactory;
import org.talend.repository.model.hadoopcluster.HadoopClusterPackage;
import org.talend.repository.model.hadoopcluster.HadoopSubConnection;
import org.talend.repository.model.hadoopcluster.HadoopSubConnectionItem;
import orgomg.cwm.analysis.businessnomenclature.BusinessnomenclaturePackage;
import orgomg.cwm.analysis.datamining.DataminingPackage;
import orgomg.cwm.analysis.informationvisualization.InformationvisualizationPackage;
import orgomg.cwm.analysis.olap.OlapPackage;
import orgomg.cwm.analysis.transformation.TransformationPackage;
import orgomg.cwm.foundation.businessinformation.BusinessinformationPackage;
import orgomg.cwm.foundation.datatypes.DatatypesPackage;
import orgomg.cwm.foundation.expressions.ExpressionsPackage;
import orgomg.cwm.foundation.keysindexes.KeysindexesPackage;
import orgomg.cwm.foundation.softwaredeployment.SoftwaredeploymentPackage;
import orgomg.cwm.foundation.typemapping.TypemappingPackage;
import orgomg.cwm.management.warehouseoperation.WarehouseoperationPackage;
import orgomg.cwm.management.warehouseprocess.WarehouseprocessPackage;
import orgomg.cwm.objectmodel.behavioral.BehavioralPackage;
import orgomg.cwm.objectmodel.core.CorePackage;
import orgomg.cwm.objectmodel.instance.InstancePackage;
import orgomg.cwm.objectmodel.relationships.RelationshipsPackage;
import orgomg.cwm.resource.multidimensional.MultidimensionalPackage;
import orgomg.cwm.resource.record.RecordPackage;
import orgomg.cwm.resource.relational.RelationalPackage;
import orgomg.cwm.resource.xml.XmlPackage;
import orgomg.cwmmip.CwmmipPackage;
import orgomg.cwmx.analysis.informationreporting.InformationreportingPackage;
import orgomg.cwmx.analysis.informationset.InformationsetPackage;
import orgomg.cwmx.foundation.er.ErPackage;
import orgomg.cwmx.resource.coboldata.CoboldataPackage;
import orgomg.cwmx.resource.dmsii.DmsiiPackage;
import orgomg.cwmx.resource.essbase.EssbasePackage;
import orgomg.cwmx.resource.express.ExpressPackage;
import orgomg.cwmx.resource.imsdatabase.ImsdatabasePackage;
import orgomg.mof.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HadoopClusterPackageImpl extends EPackageImpl implements HadoopClusterPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopClusterConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopClusterConnectionItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopAdditionalPropertiesEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopSubConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopSubConnectionItemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass hadoopConfJarEntryEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see org.talend.repository.model.hadoopcluster.HadoopClusterPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private HadoopClusterPackageImpl() {
        super(eNS_URI, HadoopClusterFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link HadoopClusterPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static HadoopClusterPackage init() {
        if (isInited) return (HadoopClusterPackage)EPackage.Registry.INSTANCE.getEPackage(HadoopClusterPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredHadoopClusterPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        HadoopClusterPackageImpl theHadoopClusterPackage = registeredHadoopClusterPackage instanceof HadoopClusterPackageImpl ? (HadoopClusterPackageImpl)registeredHadoopClusterPackage : new HadoopClusterPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        BusinessPackage.eINSTANCE.eClass();
        ComponentPackage.eINSTANCE.eClass();
        CorePackage.eINSTANCE.eClass();
        BehavioralPackage.eINSTANCE.eClass();
        RelationshipsPackage.eINSTANCE.eClass();
        InstancePackage.eINSTANCE.eClass();
        BusinessinformationPackage.eINSTANCE.eClass();
        DatatypesPackage.eINSTANCE.eClass();
        ExpressionsPackage.eINSTANCE.eClass();
        KeysindexesPackage.eINSTANCE.eClass();
        SoftwaredeploymentPackage.eINSTANCE.eClass();
        TypemappingPackage.eINSTANCE.eClass();
        RelationalPackage.eINSTANCE.eClass();
        RecordPackage.eINSTANCE.eClass();
        MultidimensionalPackage.eINSTANCE.eClass();
        XmlPackage.eINSTANCE.eClass();
        TransformationPackage.eINSTANCE.eClass();
        OlapPackage.eINSTANCE.eClass();
        DataminingPackage.eINSTANCE.eClass();
        InformationvisualizationPackage.eINSTANCE.eClass();
        BusinessnomenclaturePackage.eINSTANCE.eClass();
        WarehouseprocessPackage.eINSTANCE.eClass();
        WarehouseoperationPackage.eINSTANCE.eClass();
        ErPackage.eINSTANCE.eClass();
        CoboldataPackage.eINSTANCE.eClass();
        DmsiiPackage.eINSTANCE.eClass();
        ImsdatabasePackage.eINSTANCE.eClass();
        EssbasePackage.eINSTANCE.eClass();
        ExpressPackage.eINSTANCE.eClass();
        InformationsetPackage.eINSTANCE.eClass();
        InformationreportingPackage.eINSTANCE.eClass();
        CwmmipPackage.eINSTANCE.eClass();
        ModelPackage.eINSTANCE.eClass();
        EcorePackage.eINSTANCE.eClass();
        JobletPackage.eINSTANCE.eClass();
        ConnectionPackage.eINSTANCE.eClass();
        NotationPackage.eINSTANCE.eClass();
        PropertiesPackage.eINSTANCE.eClass();
        TalendFilePackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theHadoopClusterPackage.createPackageContents();

        // Initialize created meta-data
        theHadoopClusterPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theHadoopClusterPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(HadoopClusterPackage.eNS_URI, theHadoopClusterPackage);
        return theHadoopClusterPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopClusterConnection() {
        return hadoopClusterConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_Distribution() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_DfVersion() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseCustomVersion() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseYarn() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_Server() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_NameNodeURI() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_JobTrackerURI() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_EnableKerberos() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_Principal() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_JtOrRmPrincipal() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_JobHistoryPrincipal() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UserName() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_Group() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_AuthMode() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ConnectionList() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHadoopClusterConnection_Parameters() {
        return (EReference)hadoopClusterConnectionEClass.getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseKeytab() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_KeytabPrincipal() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_Keytab() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_HadoopProperties() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseSparkProperties() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_SparkProperties() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_RmScheduler() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_JobHistory() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_StagingDirectory() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseDNHost() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseCustomConfs() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseClouderaNavi() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaNaviUserName() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaNaviPassword() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaNaviUrl() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaNaviMetadataUrl() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaNaviClientUrl() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaDisableSSL() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaAutoCommit() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ClouderaDieNoError() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_EnableMaprT() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_MaprTPassword() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_MaprTCluster() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_MaprTDuration() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_SetMaprTHomeDir() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_MaprTHomeDir() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_SetHadoopLogin() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_MaprTHadoopLogin() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_PreloadAuthentification() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_ConfFile() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getHadoopClusterConnection_ConfFiles() {
        return (EReference)hadoopClusterConnectionEClass.getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_UseWebHDFSSSL() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_WebHDFSSSLTrustStorePath() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopClusterConnection_WebHDFSSSLTrustStorePassword() {
        return (EAttribute)hadoopClusterConnectionEClass.getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopClusterConnectionItem() {
        return hadoopClusterConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopAdditionalProperties() {
        return hadoopAdditionalPropertiesEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopAdditionalProperties_Key() {
        return (EAttribute)hadoopAdditionalPropertiesEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopAdditionalProperties_Value() {
        return (EAttribute)hadoopAdditionalPropertiesEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopSubConnection() {
        return hadoopSubConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopSubConnection_RelativeHadoopClusterId() {
        return (EAttribute)hadoopSubConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopSubConnection_HadoopProperties() {
        return (EAttribute)hadoopSubConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopSubConnectionItem() {
        return hadoopSubConnectionItemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHadoopConfJarEntry() {
        return hadoopConfJarEntryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopConfJarEntry_Key() {
        return (EAttribute)hadoopConfJarEntryEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getHadoopConfJarEntry_Value() {
        return (EAttribute)hadoopConfJarEntryEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HadoopClusterFactory getHadoopClusterFactory() {
        return (HadoopClusterFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        hadoopClusterConnectionEClass = createEClass(HADOOP_CLUSTER_CONNECTION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__DISTRIBUTION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__DF_VERSION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_CUSTOM_VERSION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_YARN);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__SERVER);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__NAME_NODE_URI);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__JOB_TRACKER_URI);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__ENABLE_KERBEROS);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__PRINCIPAL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__JT_OR_RM_PRINCIPAL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__JOB_HISTORY_PRINCIPAL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USER_NAME);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__GROUP);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__AUTH_MODE);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CONNECTION_LIST);
        createEReference(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__PARAMETERS);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_KEYTAB);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__KEYTAB_PRINCIPAL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__KEYTAB);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__HADOOP_PROPERTIES);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_SPARK_PROPERTIES);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__SPARK_PROPERTIES);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__RM_SCHEDULER);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__JOB_HISTORY);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__STAGING_DIRECTORY);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_DN_HOST);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_CUSTOM_CONFS);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_CLOUDERA_NAVI);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_NAVI_USER_NAME);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_NAVI_PASSWORD);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_NAVI_URL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_NAVI_METADATA_URL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_NAVI_CLIENT_URL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_DISABLE_SSL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_AUTO_COMMIT);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CLOUDERA_DIE_NO_ERROR);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__ENABLE_MAPR_T);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__MAPR_TPASSWORD);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__MAPR_TCLUSTER);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__MAPR_TDURATION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__SET_MAPR_THOME_DIR);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__MAPR_THOME_DIR);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__SET_HADOOP_LOGIN);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__MAPR_THADOOP_LOGIN);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__PRELOAD_AUTHENTIFICATION);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CONF_FILE);
        createEReference(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__CONF_FILES);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__USE_WEB_HDFSSSL);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__WEB_HDFSSSL_TRUST_STORE_PATH);
        createEAttribute(hadoopClusterConnectionEClass, HADOOP_CLUSTER_CONNECTION__WEB_HDFSSSL_TRUST_STORE_PASSWORD);

        hadoopClusterConnectionItemEClass = createEClass(HADOOP_CLUSTER_CONNECTION_ITEM);

        hadoopAdditionalPropertiesEClass = createEClass(HADOOP_ADDITIONAL_PROPERTIES);
        createEAttribute(hadoopAdditionalPropertiesEClass, HADOOP_ADDITIONAL_PROPERTIES__KEY);
        createEAttribute(hadoopAdditionalPropertiesEClass, HADOOP_ADDITIONAL_PROPERTIES__VALUE);

        hadoopSubConnectionEClass = createEClass(HADOOP_SUB_CONNECTION);
        createEAttribute(hadoopSubConnectionEClass, HADOOP_SUB_CONNECTION__RELATIVE_HADOOP_CLUSTER_ID);
        createEAttribute(hadoopSubConnectionEClass, HADOOP_SUB_CONNECTION__HADOOP_PROPERTIES);

        hadoopSubConnectionItemEClass = createEClass(HADOOP_SUB_CONNECTION_ITEM);

        hadoopConfJarEntryEClass = createEClass(HADOOP_CONF_JAR_ENTRY);
        createEAttribute(hadoopConfJarEntryEClass, HADOOP_CONF_JAR_ENTRY__KEY);
        createEAttribute(hadoopConfJarEntryEClass, HADOOP_CONF_JAR_ENTRY__VALUE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        ConnectionPackage theConnectionPackage = (ConnectionPackage)EPackage.Registry.INSTANCE.getEPackage(ConnectionPackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
        PropertiesPackage thePropertiesPackage = (PropertiesPackage)EPackage.Registry.INSTANCE.getEPackage(PropertiesPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        hadoopClusterConnectionEClass.getESuperTypes().add(theConnectionPackage.getConnection());
        hadoopClusterConnectionItemEClass.getESuperTypes().add(thePropertiesPackage.getConnectionItem());
        hadoopSubConnectionEClass.getESuperTypes().add(theConnectionPackage.getConnection());
        hadoopSubConnectionItemEClass.getESuperTypes().add(thePropertiesPackage.getConnectionItem());

        // Initialize classes and features; add operations and parameters
        initEClass(hadoopClusterConnectionEClass, HadoopClusterConnection.class, "HadoopClusterConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHadoopClusterConnection_Distribution(), theXMLTypePackage.getString(), "distribution", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_DfVersion(), theXMLTypePackage.getString(), "dfVersion", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseCustomVersion(), theXMLTypePackage.getBoolean(), "useCustomVersion", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseYarn(), theXMLTypePackage.getBoolean(), "useYarn", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_Server(), theXMLTypePackage.getString(), "server", "localhost", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_NameNodeURI(), theXMLTypePackage.getString(), "nameNodeURI", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_JobTrackerURI(), theXMLTypePackage.getString(), "jobTrackerURI", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_EnableKerberos(), theXMLTypePackage.getBoolean(), "enableKerberos", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_Principal(), theXMLTypePackage.getString(), "principal", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_JtOrRmPrincipal(), theXMLTypePackage.getString(), "jtOrRmPrincipal", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_JobHistoryPrincipal(), theXMLTypePackage.getString(), "jobHistoryPrincipal", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UserName(), theXMLTypePackage.getString(), "userName", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_Group(), theXMLTypePackage.getString(), "group", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_AuthMode(), theXMLTypePackage.getString(), "authMode", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ConnectionList(), ecorePackage.getEString(), "connectionList", null, 0, -1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getHadoopClusterConnection_Parameters(), this.getHadoopAdditionalProperties(), null, "parameters", null, 0, -1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseKeytab(), theXMLTypePackage.getBoolean(), "useKeytab", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_KeytabPrincipal(), theXMLTypePackage.getString(), "keytabPrincipal", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_Keytab(), theXMLTypePackage.getString(), "keytab", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_HadoopProperties(), theXMLTypePackage.getString(), "hadoopProperties", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseSparkProperties(), theXMLTypePackage.getBoolean(), "useSparkProperties", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_SparkProperties(), theXMLTypePackage.getString(), "sparkProperties", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_RmScheduler(), theXMLTypePackage.getString(), "rmScheduler", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_JobHistory(), theXMLTypePackage.getString(), "jobHistory", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_StagingDirectory(), theXMLTypePackage.getString(), "stagingDirectory", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseDNHost(), theXMLTypePackage.getBoolean(), "useDNHost", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseCustomConfs(), theXMLTypePackage.getBoolean(), "useCustomConfs", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseClouderaNavi(), theXMLTypePackage.getBoolean(), "useClouderaNavi", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaNaviUserName(), theXMLTypePackage.getString(), "clouderaNaviUserName", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaNaviPassword(), theXMLTypePackage.getString(), "clouderaNaviPassword", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaNaviUrl(), theXMLTypePackage.getString(), "clouderaNaviUrl", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaNaviMetadataUrl(), theXMLTypePackage.getString(), "clouderaNaviMetadataUrl", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaNaviClientUrl(), theXMLTypePackage.getString(), "clouderaNaviClientUrl", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaDisableSSL(), theXMLTypePackage.getBoolean(), "clouderaDisableSSL", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaAutoCommit(), theXMLTypePackage.getBoolean(), "clouderaAutoCommit", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ClouderaDieNoError(), theXMLTypePackage.getBoolean(), "clouderaDieNoError", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_EnableMaprT(), theXMLTypePackage.getBoolean(), "enableMaprT", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_MaprTPassword(), theXMLTypePackage.getString(), "maprTPassword", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_MaprTCluster(), theXMLTypePackage.getString(), "maprTCluster", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_MaprTDuration(), theXMLTypePackage.getString(), "maprTDuration", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_SetMaprTHomeDir(), theXMLTypePackage.getBoolean(), "setMaprTHomeDir", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_MaprTHomeDir(), theXMLTypePackage.getString(), "maprTHomeDir", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_SetHadoopLogin(), theXMLTypePackage.getBoolean(), "setHadoopLogin", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_MaprTHadoopLogin(), theXMLTypePackage.getString(), "maprTHadoopLogin", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_PreloadAuthentification(), theXMLTypePackage.getBoolean(), "preloadAuthentification", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_ConfFile(), ecorePackage.getEByteArray(), "confFile", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getHadoopClusterConnection_ConfFiles(), this.getHadoopConfJarEntry(), null, "confFiles", null, 0, -1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_UseWebHDFSSSL(), theXMLTypePackage.getBoolean(), "useWebHDFSSSL", null, 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_WebHDFSSSLTrustStorePath(), theXMLTypePackage.getString(), "webHDFSSSLTrustStorePath", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopClusterConnection_WebHDFSSSLTrustStorePassword(), theXMLTypePackage.getString(), "webHDFSSSLTrustStorePassword", "", 0, 1, HadoopClusterConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hadoopClusterConnectionItemEClass, HadoopClusterConnectionItem.class, "HadoopClusterConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hadoopAdditionalPropertiesEClass, Map.Entry.class, "HadoopAdditionalProperties", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHadoopAdditionalProperties_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopAdditionalProperties_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hadoopSubConnectionEClass, HadoopSubConnection.class, "HadoopSubConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHadoopSubConnection_RelativeHadoopClusterId(), ecorePackage.getEString(), "relativeHadoopClusterId", null, 1, 1, HadoopSubConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopSubConnection_HadoopProperties(), theXMLTypePackage.getString(), "hadoopProperties", null, 0, 1, HadoopSubConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(hadoopSubConnectionItemEClass, HadoopSubConnectionItem.class, "HadoopSubConnectionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(hadoopConfJarEntryEClass, Map.Entry.class, "HadoopConfJarEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getHadoopConfJarEntry_Key(), theXMLTypePackage.getString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getHadoopConfJarEntry_Value(), ecorePackage.getEByteArray(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // MapEntry
        createMapEntryAnnotations();
    }

    /**
     * Initializes the annotations for <b>MapEntry</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createMapEntryAnnotations() {
        String source = "MapEntry";
        addAnnotation
          (hadoopAdditionalPropertiesEClass,
           source,
           new String[] {
           });
        addAnnotation
          (hadoopConfJarEntryEClass,
           source,
           new String[] {
           });
    }

} //HadoopClusterPackageImpl
