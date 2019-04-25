# Customizing genmodel

## Generating pure API with no visible EMF dependencies

In your genmodel:

* Set the _Suppress EMF Types_ property to `true`; standard Java types will be used rather than EMF types for all accessors and operations. Features of type `EObject` will be surfaced as `java.lang.Object` instead. If the model includes feature maps, you will need to use the properties _Feature Map Wrapper Class_, _Feature Map Wrapper Interface_, and _Feature Map Wrapper Internal Interface_ to provide an alternative API. You can look as the support for SDO's Sequence API as the example.

* Clear or set the value of the _Root Extends Interface_ generator model property. If cleared, the generated domain API will not depend on anything, or it can be set to an interface of your choosing so that root interfaces will extend this specified interface.
    
* Set _Suppress EMF Metadata_ to `true` so that only a package implementation class is generated, but no interface, and so that the generated factory interface will not extend `EFactory` and will have an `INSTANCE` instead of an `eINSTANCE` field. Alternatively, set the generator package's `Metadata` property to redirect the package and factory interfaces to a different Java subpackage.
    
* Set the _Suppress EMF Model Tags_ property to `false` to eliminate the generation of the @model tags in the Javadoc.
    
* Set the _Root Extends Class_ and _Root Implements Interface_ properties to control the generation of the implementation, but if you clear the first one or set it so the generated implementation is not a subclass of `EObjectImpl`, the generated code will be invalid as it will have unresolved references to inherited methods that will not be available, e.g., `eGet`, `eSet`, `eUnset`, `eIsSet` and `eIsProxy`. Generating an implementation that is pure Java is not possible with the default templates but can be achieved with dynamic templates.

More in [EMF Recipes.](https://wiki.eclipse.org/EMF/Recipes#Recipe:_Generating_Pure_API_With_No_Visible_EMF_Dependencies)

## Customizing genmodel not to create plugin.xml, plugin.properties and build.properties

With the _properties_ view opened, select the root element in your genmodel. You need to do the following changes in your genmodel:

* Set _All/Bundle Manifes_ to `false`. It will prevent MANIFEST.MF to be generated.

* Set _Model/Model Plug-in ID to empty string or suse the button on the top right of the properties view named "Restore Default Value" to set it to `null`. It will prevent the generation of the files `plugin.xml`, `plugin.properties` and `build.properties`.

* Set _Template & Merge/Update Classpath_ to `false`. This one is optional, you may want EMF to stop essing out with your `.classpath` file.

References: [Stack Overflow](https://stackoverflow.com/questions/29767823/customize-genmodel-not-to-create-plugin-xml-plugin-propeties-and-build-properti)

# Plugin creation

Based on [extending ecore](../docs/extending-ecore.pdf)

1. Load Ecore.ecore to metalang4md.ecore
  1. Right-click on metalang4md.ecore
  1. Load Resource:  `http://www.eclipse.org/emf/2002/Ecore`
1. Generate model, edit, and editor from .genmodel
1. Open `plugin.xml` in model project
  1. Click on `Export Wizard`
  1. Select the model, edit, and editor plugins
  1. Install into host

To execute the plugin:

1. New > Other Example EMF Model Creation Wizards > Metalang4md
2. Rename `*.metalang4md` to `*.ecore`
3. Edit the model as usual

