# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)
# Adapted to MarS Board by Frank Bauernoeppel

require recipes-kernel/linux/linux-imx.inc
# require recipes-kernel/linux/linux-dtb.inc

SUMMARY = "Linux kernel for MarS Board"

SRC_URI = "git://github.com/boundarydevices/linux-imx6.git;branch=${SRCBRANCH} \
           file://defconfig \
           file://imx6q-marsboard.dts \
"

do_compile_prepend () {
	cp ${WORKDIR}/imx6q-marsboard.dts \
	${S}/arch/${ARCH}/boot/dts
}

LOCALVERSION = "-2.0.0_ga+yocto"
SRCBRANCH = "boundary-imx_4.14.x_2.0.0_ga"
SRCREV = "2bfd9b990c4d5ca3df0d3e78b64b125191e74ad9"

DEPENDS += "lzop-native bc-native"

COMPATIBLE_MACHINE = "(marsboard)"

