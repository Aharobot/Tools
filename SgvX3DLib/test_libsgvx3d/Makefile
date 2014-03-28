
X3DPARSERDIR = ../libSgvX3D
JDKDIR = /usr/lib/jvm/java-6-openjdk-amd64
JVMDIR = $(JDKDIR)/jre/lib/amd64/server
JDKINC = -I$(JDKDIR)/include -I$(JDKDIR)/include/linux

RM       = rm -f
CXX      = g++
CXXFLAGS = -g -Wall

##### DYNAMIC LINK #####
LDFLAGS = -L$(X3DPARSERDIR) -lSgvX3D -L$(JVMDIR) -ljvm
##### STATIC LINK #####
#LDFLAGS = $(X3DPARSERDIR)/libSgvX3D.a -L$(X3DPARSERDIR) -L$(JVMDIR) -ljvm

INCLUDE = -I$(X3DPARSERDIR) $(JDKINC)
DEFINE = 

.SUFFIXES: .cpp .o

.cpp.o:
	$(CXX) $(CXXFLAGS) $(INCLUDE) -c -o $@ $<

SRCS = Main.cpp \
	Test_BoxNode.cpp \
	Test_CalcSimplifiedShape.cpp \
	Test_GetChildrenOfRootNode.cpp \
	Test_GetDefNames.cpp \
	Test_GetDefNode.cpp \
	Test_GetNodeName.cpp \
	Test_LoopFieldOfNode.cpp \
	Test_OpenHRP.cpp \
	Test_SimpleParse.cpp \
	Test_TransformNode.cpp

TESTNAME = xj3dtest

OBJS = $(SRCS:.cpp=.o)

all: $(OBJS)
	$(CXX) -o $(TESTNAME) $(OBJS) $(LDFLAGS)

clean:
	$(RM) *.o $(TESTNAME)
