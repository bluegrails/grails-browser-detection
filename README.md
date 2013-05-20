grails-browser-detection
========================

bluegrails fork
---------------
bluegrails uses Maven as dependencies and prefers Binary plugins (which also generate source plugins) using the Bluegrails Maven plugin for Grails.

This version differs from previous forks by upgrading to 1.8 of the actual browser detection library, dealing with its rename issue (nl -> eu).

To use it - please download the tag of 1.8 or higher from here: https://github.com/HaraldWalker/user-agent-utils/tags

Build it and install it into your Nexus.

inifi-groups fork
-----------------
The original version causes a VerifyError with grails 2.2.0.
This fork solves this problem using a workaround.


