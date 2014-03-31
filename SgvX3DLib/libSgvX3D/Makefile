###### STATIC LINK #####
#JDKINC = -I$(JDKDIR)/include -I$(JDKDIR)/include/linux
#
#SONAME = 
#LIBNAME = libSgvX3D.a
#
#RM = rm -f
#CXX = g++
#CXXFLAGS= -g -Wall
##CXXFLAGS= -O2
#LD = ar
#LDFLAGS = -cr -o $(LIBNAME)
#INCLUDE = $(JDKINC)
#DEFINE=

#--------------------------------------------------------------------

##### DYNAMIC LINK #####
JDKINC = -I$(JDKDIR)/include -I$(JDKDIR)/include/linux

SONAME = libSgvX3D.so
LIBNAME = libSgvX3D.so.2.3.0

RM = rm -f
CXX = g++
CXXFLAGS = -g -Wall -fPIC
#CXXFLAGS = -O2 -fPIC
LD = g++
LDFLAGS = -shared -Wall -Wl,-soname=$(SONAME) -o $(LIBNAME)
INCLUDE = $(JDKINC)
DEFINE =

#--------------------------------------------------------------------

SRCS = CJNIUtil.cpp \
	CSimplifiedShape.cpp \
	CVRMLFieldData.cpp \
	CX3DAppearanceNode.cpp \
	CX3DBoxNode.cpp \
	CX3DColorNode.cpp \
	CX3DConeNode.cpp \
	CX3DCoordinateNode.cpp \
	CX3DCylinderNode.cpp \
	CX3DDirectionalLightNode.cpp \
	CX3DField.cpp \
	CX3DGroupNode.cpp \
	CX3DHAnimDisplacerNode.cpp \
	CX3DHAnimHumanoidNode.cpp \
	CX3DHAnimJointNode.cpp \
	CX3DHAnimSegmentNode.cpp \
	CX3DHAnimSiteNode.cpp \
	CX3DImageTextureNode.cpp \
	CX3DIndexedFaceSetNode.cpp \
	CX3DIndexedLineSetNode.cpp \
	CX3DMaterialNode.cpp \
	CX3DNode.cpp \
	CX3DNormalNode.cpp \
	CX3DOpenHRPHumanoidNode.cpp \
	CX3DOpenHRPJointNode.cpp \
	CX3DOpenHRPSegmentNode.cpp \
	CX3DParser.cpp \
	CX3DParserUtil.cpp \
	CX3DPointLightNode.cpp \
	CX3DShapeNode.cpp \
	CX3DSphereNode.cpp \
	CX3DSpotLightNode.cpp \
	CX3DTextureCoordinateNode.cpp \
	CX3DTextureTransformNode.cpp \
	CX3DTransformNode.cpp \
	CX3DViewpointNode.cpp \
	SgvConfigFile.cpp

OBJS = $(SRCS:.cpp=.o)

.SUFFIXES: .cpp .o

.cpp.o:
	$(CXX) $(CXXFLAGS) $(DEFINE) $(INCLUDE) -c -o $@ $<

all: lib
	ln -s $(LIBNAME) $(SONAME)

lib: $(OBJS)
	$(LD) $(LDFLAGS) $(OBJS)

distclean: clean

clean:
	$(RM) $(LIBNAME) $(SONAME) *.o

