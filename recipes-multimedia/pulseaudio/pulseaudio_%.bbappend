FILESEXTRAPATHS_prepend := "${THISDIR}/${BPN}:"

SRC_URI += "\
	file://0001-Start-bluetooth-on-system-server.patch \
	file://pulseaudio.service \
"

SYSTEMD_PACKAGES += "${PN}-server"
do_install_append () {
	install -D -m 644 ${WORKDIR}/pulseaudio.service ${D}/${systemd_unitdir}/system/pulseaudio.service
}
