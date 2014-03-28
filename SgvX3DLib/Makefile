
#fullpath=/home/itoh/src/SgvX3D/libSgvX3D

all: parser lib
parser:
	(cd ./X3DParser; make)
lib:
	(cd ./libSgvX3D; make)
test:
	(cd test_libsgvx3d; make)
clean:
	(cd ./X3DParser; make clean)
	(cd ./libSgvX3D; make clean)
clean-all: clean
	(cd test_libsgvx3d; make clean)

