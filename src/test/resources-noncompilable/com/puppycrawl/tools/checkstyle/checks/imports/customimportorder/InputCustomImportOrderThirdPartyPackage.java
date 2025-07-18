/*
CustomImportOrder
customImportOrderRules = SAME_PACKAGE(3)###THIRD_PARTY_PACKAGE###STANDARD_JAVA_PACKAGE###STATIC
standardPackageRegExp = (default)^(java|javax)\\.
thirdPartyPackageRegExp = (default).*
specialImportsRegExp = (default)^$
separateLineBetweenGroups = (default)true
sortImportsInGroupAlphabetically = true


*/

// non-compiled with javac: contains specially crafted set of imports for testing
package com.puppycrawl.tools.checkstyle.checks.imports.customimportorder;


import org.junit.*;

import java.*;
import javax.swing.*;

import static sun.tools.util.CommandLine.parse;
import static sun.tools.util.ModifierFilter.ALL_ACCESS;
import static sun.tools.util.ModifierFilter.ALL_ACCESS;

public class InputCustomImportOrderThirdPartyPackage
{

}
