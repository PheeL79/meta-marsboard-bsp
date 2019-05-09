require recipes-bsp/u-boot/u-boot.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=a2c678cfd4a4d97135585cad908541c6"

MARSBOARD_DEFAULT_BOOTLOADER = "u-boot-fslc"
PREFERRED_PROVIDER_u-boot = "${MARSBOARD_DEFAULT_BOOTLOADER}"
PREFERRED_PROVIDER_virtual/bootloader = "${MARSBOARD_DEFAULT_BOOTLOADER}"  

COMPATIBLE_MACHINE = "(marsboard)"

PROVIDES = "virtual/bootloader"

PV = "mainline+git${SRCPV}"

SRCREV = "f95ab1fb6e37f0601f397091bb011edf7a98b890"
SRC_URI = "git://git.denx.de/u-boot.git;branch=master \
           file://0001-increased-eth-phy-reset-time.patch \
"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"

