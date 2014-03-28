SgvX3DLib
=========


Overview
========
SgvX3DLib organizes three-dimensional data for SIGVerse by
manipulating X3D parser(more on that later) written by Java.
SgvX3DLib consists of two modules named as libSgvX3D and
X3DParser.
A X3D parser "X3DParser" written by Java read/analyse X3D
file.  libSgvX3D is the main part of SgvX3DLib. This module
manipulates X3DParser and organizes contents as three-
dimensional objects to be used on SIGVerse.


Requirement
===========
* Windows
 - Visual C++ (2010 is recommended)
 - JDK 1.6 or later

* Linux
 - gcc(g++)
 - gnumake
 - OpenJDK or Oracle Java SE (1.6 or later)


How to build X3DParser
======================
* Windows
 1. Open Visual Studio Command Prompt
 2. Move to the directory X3DParser in SgvX3DLib.
 3. Execute the following command:

    nmake -f makefile.msc

 4. You will find the Jar file X3DParser.jar in the current
    directory.

* Linux
 1. Move to the directory X3DParser in SgvX3DLib.
 2. Execute the following command:

    make

 3. You will find the Jar file X3DParser.jar in the current
    directory.


How to build libSgvX3D
======================
* Windows
 1. Open SgvX3D.sln
 2. Choose teh build type Release or Debug and click
    Build -> Build Solution
 3. You will find libSgvX3D.lib in the Release/Debug
    directory.

* Linux
 1. Check makefile in the directory SgvX3DLib/libSgvX3D and
    make sure setting of variables JDKDIR, JVMDIR and
    JDKINC are correct on your system.
 2. Just execute make in the SgvX3DLib directory.
 3. You will find libSgvX3D.so in the directory
    SgvX3DLib/libSgvX3D.


Test run (optional)
===================

