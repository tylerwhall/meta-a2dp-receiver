SUMMARY = "PulseAudio packages for Bluetooth A2DP"
LICENSE = "MIT"

inherit packagegroup

RDEPENDS_${PN} = "\
	pulseaudio-server \
	pulseaudio-module-bluetooth-discover \
	pulseaudio-module-bluetooth-policy \
	pulseaudio-module-bluez5-discover \
	pulseaudio-module-bluez5-device \
	pulseaudio-module-loopback \
"
