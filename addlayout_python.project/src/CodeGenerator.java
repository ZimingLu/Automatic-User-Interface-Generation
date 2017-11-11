

/*
 * (c) Institute for electronic Design Automation, TUM, 2015
 *     Author: Daniel Mueller-Gritschneder
 *     DVCON Material: Distributed as it without any warranty, Intended for teaching purposes only
 */

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.spiritconsortium.xml.schema.spirit.spirit.util.spiritResourceFactoryImpl;

import model.DocumentRoot;
import model.ModelPackage;
import model.util.ModelResourceFactoryImpl;
import modelextension.ModelextensionPackage;

////import freemarker.ext.dom.NodeModel;
//import freemarker.template.Configuration;
//import freemarker.template.DefaultObjectWrapper;
//import freemarker.template.ObjectWrapper;
//import freemarker.template.Template;
//import freemarker.template.TemplateException;

public class CodeGenerator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Starting...");
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		// Register the appropriate resource factory to handle all file extensions.
				//
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put
			(Resource.Factory.Registry.DEFAULT_EXTENSION, 
			 new ModelResourceFactoryImpl());
		
		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(ModelPackage.eNS_URI, 
			 ModelPackage.eINSTANCE);
		
		// Register the package to ensure it is available during loading.
		//
		resourceSet.getPackageRegistry().put
			(ModelextensionPackage.eNS_URI, 
			 ModelextensionPackage.eINSTANCE);
		
		File file = new File("src/ifx_pmm_pas_reg_100.xml");
		File fileLayout = new File("src/ifx_pmm_pas_reg_100.xmi");
		File fileOut = new File("src/combine.xmi");
		URI uri = URI.createFileURI(file.getAbsolutePath());
		URI uriLayout = URI.createFileURI(fileLayout.getAbsolutePath());
		URI uriOut = URI.createFileURI(fileOut.getAbsolutePath());
		
		try {
			// Load design file
			//
			System.out.println("Try loading " + uri);
			Resource resource = resourceSet.getResource(uri, true);
			System.out.println("Loading " + uri + " successful");
//			
			System.out.println("Reading ecore model.");
			System.out.println("Get document root.");
			EList<EObject> listObj = resource.getContents();
			EObject obj = listObj.get(0);
			
			
			// Register the XMI resource factory for the .xmi extension
			Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
			reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			// Obtain a new resource set
			ResourceSet resourceSetLayout = new ResourceSetImpl();

			Resource resourceLayout = resourceSetLayout.getResource(uriLayout, true);
//
//			EObject javaModel = resourceLayout.getContents().get(0);

//			//EObject objLayout = listObjLayout.get(0);
//			
//			// Create an output resource where copy element from input resource
//			Resource resourceOut = new XMIResourceImpl(uriOut); //We create a resource to XMI file
//			resourceOut.getContents().add(obj);
//			//resourceOut.getContents().add(objLayout);
//			resourceOut.save(null); //We serialize the resource to the XMI file
//			System.out.println("Finished!");
		
		} catch (RuntimeException exception) {
			
			exception.printStackTrace();
		}	
	}
}

