SUMMARY = "Makes Linux act as a Bluetooth audio receiver. AVRCP control from VWCDPIC."
AUTHOR = "Tyler Hall"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/tylerwhall/a2dp-receiver"
SRCREV = "c59dfee74718ddf3ee7652c449dd48fd095fb4a7"

S = "${WORKDIR}/git"

inherit setuptools systemd

SYSTEMD_SERVICE_${PN} = "a2dp-receiver.service"

do_install_append () {
	install -D -m 644 ${S}/a2dp-receiver.service ${D}/${systemd_unitdir}/system/a2dp-receiver.service
}

RDEPENDS_${PN} += "\
	espeak \
	packagegroup-pulseaudio-bluetooth \
	python-dbus \
	python-distribute \
	python-pygobject \
	python-pyserial \
	python-subprocess \
"
