#fullpath=/home/itoh/src/SgvX3D/libSgvX3D

JDKDIR = /usr/lib/jvm/java-6-openjdk-amd64
JVMDIR = $(JDKDIR)/jre/lib/amd64/server

all: parser lib
parser:
	(cd ./X3DParser; make)
lib:
	(cd ./libSgvX3D; JDKDIR=$(JDKDIR) JVMDIR=$(JVMDIR) JDKINC=$(JDKINC) make)
test:
	(cd test_libsgvx3d; JDKDIR=$(JDKDIR) JVMDIR=$(JVMDIR) JDKINC=$(JDKINC) make)
clean:
	(cd ./X3DParser; make clean)
	(cd ./libSgvX3D; make clean)
clean-all: clean
	(cd test_libsgvx3d; make clean)

