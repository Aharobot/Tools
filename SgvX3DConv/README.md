SgvX3DConv
==========

Overview
========
SgvX3DConv converts X3D file from generic X3D forms
to the SIGVerse-specified one.  Currently the source
is only adapted for Visual C# on Windows because it
dependes on XML processing methods implemented in
Visual C#.

How to build
============
1. Open SgvX3DConv.sln
2. Click Debug -> Build Solution or push F6 key.

How to use
==========
1. Locate target X3D file to the working directory
   including SgvX3DConv.exe.
2. Open command prompt and move to the working
   directory(by CD command).
3. Execute the following command in the working
   directory:

   SgvX3DConv target.x3d

4. You will find the converted file named as
   target_sgv.x3d.
