import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//import org.ietf.uri.*;

//import org.web3d.util.DefaultErrorReporter;
//import org.web3d.vrml.lang.*;
//import org.web3d.vrml.nodes.*;
//import org.web3d.vrml.parser.VRMLParserFactory;
//import org.web3d.vrml.renderer.CRVRMLScene;
//import org.web3d.vrml.renderer.common.nodes.core.*;
import org.web3d.vrml.sav.InputSource;
//import org.web3d.vrml.sav.VRMLReader;

import org.web3d.x3d.jaxp.XMLReader;

public class X3DLoaderTest {
	// ----------------------------------------------------------
	//	parse
	// ----------------------------------------------------------
	public boolean parse(String fname){
		File f = new File(fname);
		if (!f.exists()){
			System.err.println("*** [ERROR] "+fname+" not exists! ***");
			return false;
		}

		FileInputStream stream = null;

		try{
			stream = new FileInputStream(fname);
		}
		catch (Exception excep){
			System.out.println(excep.toString());
			return false;
		}

		InputSource is = new InputSource("file://"+fname, stream);
		XMLReader ldt=null;

		try{
			ldt.parse(is);
		}
		catch(Exception fce){
			throw new RuntimeException("Failed to parse");
		}

		return true;
	}

	public static void main(String args[]){
		String fname;
		fname = "list2-12.x3d";
		X3DLoaderTest bt=new X3DLoaderTest();
		bt.parse(fname);
	}
}

