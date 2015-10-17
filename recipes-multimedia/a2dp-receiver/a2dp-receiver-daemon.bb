SUMMARY = "Makes Linux act as a Bluetooth audio receiver. AVRCP control from VWCDPIC."
AUTHOR = "Tyler Hall"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/tylerwhall/a2dp-receiver"
SRCREV = "37ceab8c032c5fa98a7d5f005556caf96ae2a7ea"

S = "${WORKDIR}/git"

inherit setuptools

RDEPENDS_${PN} = "packagegroup-pulseaudio-bluetooth"
